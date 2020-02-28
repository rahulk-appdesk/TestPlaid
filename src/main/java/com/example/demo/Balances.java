
package com.example.demo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Balances {

    @Expose
    private Double available;
    @Expose
    private Double current;
    @SerializedName("iso_currency_code")
    private String isoCurrencyCode;
    @Expose
    private Object limit;
    @SerializedName("unofficial_currency_code")
    private Object unofficialCurrencyCode;

    public Double getAvailable() {
        return available;
    }

    public void setAvailable(Double available) {
        this.available = available;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }

    public String getIsoCurrencyCode() {
        return isoCurrencyCode;
    }

    public void setIsoCurrencyCode(String isoCurrencyCode) {
        this.isoCurrencyCode = isoCurrencyCode;
    }

    public Object getLimit() {
        return limit;
    }

    public void setLimit(Object limit) {
        this.limit = limit;
    }

    public Object getUnofficialCurrencyCode() {
        return unofficialCurrencyCode;
    }

    public void setUnofficialCurrencyCode(Object unofficialCurrencyCode) {
        this.unofficialCurrencyCode = unofficialCurrencyCode;
    }

}
