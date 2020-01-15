package com.sample;

import com.sample.model.singleFactMethodology.DealRuleModel;

public class DealDataGeneratorForSingleMethodology {

    public static DealRuleModel generateDealRuleModelSingleTexasBlind() {
        DealRuleModel currentDealRuleModel = new DealRuleModel();
        currentDealRuleModel.setCompanyFullName("TEXAS BLIND CO");
        currentDealRuleModel.setCompanyRole("Seller");
        currentDealRuleModel.setIsClient("Y");
        currentDealRuleModel.setProduct("Debt");
        currentDealRuleModel.setPurpose("Other");
        currentDealRuleModel.setCurrentDealOrCrossCheckedDeal(true);
        return currentDealRuleModel;
    }

    public static DealRuleModel generateDealRuleModelSingleTGoogleInc() {
        DealRuleModel crossCheckedDealRuleModel = new DealRuleModel();
        crossCheckedDealRuleModel.setCompanyFullName("Google, INC.");
        crossCheckedDealRuleModel.setCompanyRole("Seller");
        crossCheckedDealRuleModel.setIsClient("Y");
        crossCheckedDealRuleModel.setProduct("Debt");
        crossCheckedDealRuleModel.setPurpose("Other");
        crossCheckedDealRuleModel.setCaStatus("Active");
        crossCheckedDealRuleModel.setDealStatus("Active");
        crossCheckedDealRuleModel.setCurrentDealOrCrossCheckedDeal(false);
        return crossCheckedDealRuleModel;
    }
}
