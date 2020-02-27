package com.mastertheboss.model;

public class nestedCustomer {
    public String getNestedName() {
        return nestedName;
    }

    public void setNestedName(String nestedName) {
        this.nestedName = nestedName;
    }

    public nestedCustomer(String name) {
        nestedName = name;
    }

    String nestedName;

    @Override
    public String toString() {
        return nestedName;
    }
}
