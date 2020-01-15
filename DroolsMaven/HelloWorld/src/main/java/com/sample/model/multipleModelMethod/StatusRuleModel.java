package com.sample.model.multipleModelMethod;

public class StatusRuleModel {
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

    String dealStatus;
    String caStatus;

    public Boolean getCurrentDealOrCrossCheckedDeal() {
        return CurrentDealOrCrossCheckedDeal;
    }

    public void setCurrentDealOrCrossCheckedDeal(Boolean currentDealOrCrossCheckedDeal) {
        CurrentDealOrCrossCheckedDeal = currentDealOrCrossCheckedDeal;
    }

    Boolean CurrentDealOrCrossCheckedDeal;
}
