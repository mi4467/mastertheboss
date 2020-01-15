package com.sample.model.multipleModelMethod;

public class DealParticipantRuleModel {
    String companyFullName;
    String companyRole;
    String isClient;

    public Boolean getCurrentDealOrCrossCheckedDeal() {
        return CurrentDealOrCrossCheckedDeal;
    }

    public void setCurrentDealOrCrossCheckedDeal(Boolean currentDealOrCrossCheckedDeal) {
        CurrentDealOrCrossCheckedDeal = currentDealOrCrossCheckedDeal;
    }

    Boolean CurrentDealOrCrossCheckedDeal;

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

}
