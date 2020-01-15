package com.sample.model.singleFactMethodology;

public class DealRuleModel {
    String companyFullName;
    String companyRole;
    String isClient;
    String product;

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getCompanyRole() {
        return companyRole;
    }

    public void setCompanyRole(String companyRole) {
        this.companyRole = companyRole;
    }

    public String getIsClient() {
        return isClient;
    }

    public void setIsClient(String isClient) {
        this.isClient = isClient;
    }

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

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getCaStatus() {
        return caStatus;
    }

    public void setCaStatus(String caStatus) {
        this.caStatus = caStatus;
    }

    public Boolean getCurrentDealOrCrossCheckedDeal() {
        return currentDealOrCrossCheckedDeal;
    }

    public void setCurrentDealOrCrossCheckedDeal(Boolean currentDealOrCrossCheckedDeal) {
        this.currentDealOrCrossCheckedDeal = currentDealOrCrossCheckedDeal;
    }

    String subProduct;
    String subSubProduct;
    String purpose;
    String dealStatus;
    String caStatus;
    Boolean currentDealOrCrossCheckedDeal;
}
