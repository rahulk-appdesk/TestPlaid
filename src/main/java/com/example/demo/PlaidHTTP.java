package com.example.demo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface PlaidHTTP {

    @Headers({"Content-Type: application/json", "User-Agent: Plaid Postman"})
    @POST("sandbox/public_token/create")
    Call<PublicTokenCreateResponsePojo> getLinkPublicKey(@Body PublicTokenCreateRequestPojo publicTokenCreateRequestPojo);

    @Headers({"Content-Type: application/json", "User-Agent: Plaid Postman"})
    @POST("item/public_token/exchange")
    Call<AccessTokenResponsePojo> getAccessToken(@Body AccesTokenRequestPojo accesTokenRequestPojo);

    //https://sandbox.plaid.com/auth/get
    @Headers({"Content-Type: application/json", "User-Agent: Plaid Postman"})
    @POST("auth/get")
    Call<GetAccountsResponsePojo> getAllAccounts(@Body GetAccountsRequestPojo getAccountsRequestPojo);
}
