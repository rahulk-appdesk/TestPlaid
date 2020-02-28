package com.example.demo;

import java.io.Serializable;

public class PublicTokenCreateResponsePojo implements Serializable {
    private String public_token;
    private String requestId;

    public void setPublic_token(String public_token) {
        this.public_token = public_token;
    }

    public String getPublic_token() {
        return public_token;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    @Override
    public String toString() {
        return
                "PublicTokenCreateResponsePojo{" +
                        "public_token = '" + public_token + '\'' +
                        ",request_id = '" + requestId + '\'' +
                        "}";
    }
}