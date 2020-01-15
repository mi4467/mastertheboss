package com.sample.model;

public class Check {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    private String name;

    private Integer deposit;

    public Check(String name, Integer deposit) {
        this.name = name;
        this.deposit = deposit;
    }
}
