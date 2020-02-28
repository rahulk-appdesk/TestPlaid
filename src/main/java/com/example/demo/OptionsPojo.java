package com.example.demo;

import java.io.Serializable;

public class OptionsPojo implements Serializable {
    private String webhook;

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    public String getWebhook() {
        return webhook;
    }

    @Override
    public String toString() {
        return
                "OptionsPojo{" +
                        "webhook = '" + webhook + '\'' +
                        "}";
    }
}