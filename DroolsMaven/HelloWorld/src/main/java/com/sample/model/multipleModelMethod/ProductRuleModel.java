package com.sample.model.multipleModelMethod;

public class ProductRuleModel {
    String product;

    public Boolean getCurrentDealOrCrossCheckedDeal() {
        return CurrentDealOrCrossCheckedDeal;
    }

    public void setCurrentDealOrCrossCheckedDeal(Boolean currentDealOrCrossCheckedDeal) {
        CurrentDealOrCrossCheckedDeal = currentDealOrCrossCheckedDeal;
    }

    Boolean CurrentDealOrCrossCheckedDeal;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSubProduct() {
        return subProduct;
    }

    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct;
    }

    public String getSubSubProduct() {
        return subSubProduct;
    }

    public void setSubSubProduct(String subSubProduct) {
        this.subSubProduct = subSubProduct;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    String subProduct;
    String subSubProduct;
    String purpose;
}
