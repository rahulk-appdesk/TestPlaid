
package com.example.demo;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GetAccountsRequestPojo {

    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("client_id")
    private String clientId;
    @Expose
    private String secret;

    public GetAccountsRequestPojo(String accessToken, String clientId, String secret) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.secret = secret;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

}
