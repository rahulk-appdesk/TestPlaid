
package com.example.demo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Ach {

    @Expose
    private String account;
    @SerializedName("account_id")
    private String accountId;
    @Expose
    private String routing;
    @SerializedName("wire_routing")
    private String wireRouting;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getRouting() {
        return routing;
    }

    public void setRouting(String routing) {
        this.routing = routing;
    }

    public String getWireRouting() {
        return wireRouting;
    }

    public void setWireRouting(String wireRouting) {
        this.wireRouting = wireRouting;
    }

}
