package com.example.demo;

import java.util.List;
import java.io.Serializable;

public class PublicTokenCreateRequestPojo implements Serializable {

    private String public_key;
    private String institution_id;
    private List<String> initial_products;
    private OptionsPojo options;

    public PublicTokenCreateRequestPojo(String public_key, String institution_id, List<String> initial_products, OptionsPojo options) {
        this.public_key = public_key;
        this.institution_id = institution_id;
        this.initial_products = initial_products;
        this.options = options;
    }

    public void setPublic_key(String public_key) {
        this.public_key = public_key;
    }

    public String getPublic_key() {
        return public_key;
    }

    public void setInstitution_id(String institution_id) {
        this.institution_id = institution_id;
    }

    public String getInstitution_id() {
        return institution_id;
    }

    public void setInitial_products(List<String> initial_products) {
        this.initial_products = initial_products;
    }

    public List<String> getInitial_products() {
        return initial_products;
    }

    public void setOptions(OptionsPojo options) {
        this.options = options;
    }

    public OptionsPojo getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return
                "ResponsePojo{" +
                        "public_key = '" + public_key + '\'' +
                        ",institution_id = '" + institution_id + '\'' +
                        ",initial_products = '" + initial_products + '\'' +
                        ",options = '" + options + '\'' +
                        "}";
    }
}