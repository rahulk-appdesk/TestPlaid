package com.example.demo;

import com.plaid.client.PlaidClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.Arrays;

public class PlaidApiUtility {
    private static PlaidClient instance;
    private PlaidHTTP plaidHTTP;
    private static PlaidApiUtility plaidApiUtility;


    public static PlaidApiUtility getPlaidApiUtility() {
        if (plaidApiUtility == null) {
            plaidApiUtility = new PlaidApiUtility();
        }
        return plaidApiUtility;
    }

    PublicTokenCreateResponsePojo result = null;

    public PlaidClient getInstance() {
        if (instance == null) {
            instance = PlaidClient.newBuilder()
                    .clientIdAndSecret(Constants.CLIENT_ID, Constants.SECRET_KEY)
                    .publicKey(Constants.PUBLIC_KEY) // optional. only needed to call endpoints that require a public key
                    .developmentBaseUrl() // or equivalent, depending on which environment you're calling into
                    .build();

        }
        return instance;
    }

    private PlaidHTTP getPlaidHTTP() {
        if (plaidHTTP == null) {
            plaidHTTP = RetrofitClientInstance.getInstance().create(PlaidHTTP.class);
        }
        return plaidHTTP;
    }


    public PublicTokenCreateResponsePojo getPublicToken() throws IOException {
        String[] initial_products = {"auth"};
        OptionsPojo optionsPojo = new OptionsPojo();
        optionsPojo.setWebhook("https://www.genericwebhookurl.com/webhook");
        PublicTokenCreateRequestPojo requestPojo = new PublicTokenCreateRequestPojo(Constants.PUBLIC_KEY, "ins_3", Arrays.asList(initial_products), optionsPojo);
        Call<PublicTokenCreateResponsePojo> call = getPlaidHTTP().getLinkPublicKey(/*"application/json; charset=utf-8", "Plaid Postman",*/ requestPojo);
        call.enqueue(new Callback<PublicTokenCreateResponsePojo>() {
            @Override
            public void onResponse(Call<PublicTokenCreateResponsePojo> call, Response<PublicTokenCreateResponsePojo> response) {

                if (response.isSuccessful()) {
                    System.out.println(response.code() + response.message());
                    if (response.code() == 200) {
                        System.out.println("We have received the Public key");
                        result = response.body();


                        PlaidApiUtility.getPlaidApiUtility().getAccessToken(new AccesTokenRequestPojo(Constants.CLIENT_ID, response.body().getPublic_token(), Constants.SECRET_KEY));

                    } else {
                        System.out.println("Call code is not 200 ");
                    }
                } else {
                    try {
                        System.out.println("Call is not successful " + response.message() + response.code() + response.errorBody().string()
                        );
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }

            @Override
            public void onFailure(Call<PublicTokenCreateResponsePojo> call, Throwable throwable) {
                System.out.println("Call got failed " + throwable.getMessage());
            }
        });

        return result;

    }

    private AccessTokenResponsePojo itemPublicTokenExchangeResponse = null;

    public AccessTokenResponsePojo getAccessToken(AccesTokenRequestPojo accesTokenRequestPojo) {
        Call<AccessTokenResponsePojo> call = plaidHTTP.getAccessToken(accesTokenRequestPojo);
        call.enqueue(new Callback<AccessTokenResponsePojo>() {
            @Override
            public void onResponse(Call<AccessTokenResponsePojo> call, Response<AccessTokenResponsePojo> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.code() + response.message());
                    itemPublicTokenExchangeResponse = response.body();
                    System.out.println("Access Token is " + response.body().getAccessToken());
                    getAccounts(new GetAccountsRequestPojo(itemPublicTokenExchangeResponse.getAccessToken(), Constants.CLIENT_ID, Constants.SECRET_KEY));

                } else {
                    try {
                        System.out.println("unsuccess " + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<AccessTokenResponsePojo> call, Throwable throwable) {

            }
        });
        return itemPublicTokenExchangeResponse;
    }

    private GetAccountsResponsePojo getAccountsResponsePojo = null;

    public GetAccountsResponsePojo getAccounts(GetAccountsRequestPojo getAccountsRequestPojo) {
        Call<GetAccountsResponsePojo> call = getPlaidHTTP().getAllAccounts(getAccountsRequestPojo);
        call.enqueue(new Callback<GetAccountsResponsePojo>() {
            @Override
            public void onResponse(Call<GetAccountsResponsePojo> call, Response<GetAccountsResponsePojo> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.code() + response.message());
                    getAccountsResponsePojo = response.body();
                    System.out.println(response.body().getAccounts().toString());
                } else {
                    try {
                        System.out.println(response.code() + response.message() + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<GetAccountsResponsePojo> call, Throwable throwable) {
                System.out.println("FAIL " + throwable.getMessage());
            }
        });
        return getAccountsResponsePojo;
    }


}
