
package com.example.demo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Item {

    @SerializedName("available_products")
    private List<String> availableProducts;
    @SerializedName("billed_products")
    private List<String> billedProducts;
    @Expose
    private Object error;
    @SerializedName("institution_id")
    private String institutionId;
    @SerializedName("item_id")
    private String itemId;
    @Expose
    private String webhook;

    public List<String> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(List<String> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public List<String> getBilledProducts() {
        return billedProducts;
    }

    public void setBilledProducts(List<String> billedProducts) {
        this.billedProducts = billedProducts;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

}
