package com.example.demo;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.AuthGetRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

@SpringBootApplication
public class PlaidTestApplication {
    private static String accessToken;

    public static void main(String[] args) throws IOException {

        PublicTokenCreateResponsePojo pojo = PlaidApiUtility.getPlaidApiUtility().getPublicToken();
    }


}



