package com.sample;

import com.sample.model.singleEntity.CrossCheckAndCurrentDealRule;

public class DealDataGeneratorForAllInOneMethodology {

    public static CrossCheckAndCurrentDealRule generateCrossCheckAndCurrentDealRule() {
        CrossCheckAndCurrentDealRule crossCheckAndCurrentDealRule = new CrossCheckAndCurrentDealRule();
        crossCheckAndCurrentDealRule.setCompanyFullNameCurrent("TEXAS BLIND CO");
        crossCheckAndCurrentDealRule.setCompanyRoleCurrent("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCurrent("Y");
        crossCheckAndCurrentDealRule.setProductCurrent("Debt");
        crossCheckAndCurrentDealRule.setPurposeCurrent("Other");
        crossCheckAndCurrentDealRule.setCompanyFullNameCrossChecked("Google, INC.");
        crossCheckAndCurrentDealRule.setCompanyRoleCurrent("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCrossChecked("Y");
        crossCheckAndCurrentDealRule.setProductCrossChecked("Debt");
        crossCheckAndCurrentDealRule.setCaStatusCrossChecked("Active");
        crossCheckAndCurrentDealRule.setDealStatusCrossChecked("Active");
        return crossCheckAndCurrentDealRule;
    }

    public static CrossCheckAndCurrentDealRule generateCrossCheckAndCurrentDealRuleScenarioOnePointTwoTrue() {
        CrossCheckAndCurrentDealRule crossCheckAndCurrentDealRule = new CrossCheckAndCurrentDealRule();
        crossCheckAndCurrentDealRule.setCompanyFullNameCurrent("TEXAS BLIND CO");
        crossCheckAndCurrentDealRule.setCompanyRoleCurrent("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCurrent("N");
        crossCheckAndCurrentDealRule.setProductCurrent("M&A");
        crossCheckAndCurrentDealRule.setPurposeCurrent("Other");
        crossCheckAndCurrentDealRule.setCompanyFullNameCrossChecked("Google, INC.");
        crossCheckAndCurrentDealRule.setCompanyRoleCurrent("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCrossChecked("Y");
        crossCheckAndCurrentDealRule.setProductCrossChecked("Debt");
        crossCheckAndCurrentDealRule.setCaStatusCrossChecked("Active");
        crossCheckAndCurrentDealRule.setDealStatusCrossChecked("Active");
        return crossCheckAndCurrentDealRule;
    }
}
