
package com.example.demo;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class AccesTokenRequestPojo {

    @SerializedName("client_id")
    private String client_id;
    @SerializedName("public_token")
    private String public_token;
    @SerializedName("secret")
    private String secret;

    public AccesTokenRequestPojo(String client_id, String public_token, String secret) {
        this.client_id = client_id;
        this.public_token = public_token;
        this.secret = secret;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getPublic_token() {
        return public_token;
    }

    public void setPublic_token(String public_token) {
        this.public_token = public_token;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

}
