package com.mastertheboss;

import com.mastertheboss.model.BPNRuleEngineInputModel;

public class BPNRuleEngineInputModelGenerator {
    public static BPNRuleEngineInputModel generateCrossCheckAndCurrentDealRule() {
        BPNRuleEngineInputModel crossCheckAndCurrentDealRule = new BPNRuleEngineInputModel();
        crossCheckAndCurrentDealRule.setCompanyFullNameCurrent("TEXAS BLIND CO");
        crossCheckAndCurrentDealRule.setCompanyRoleCurrent("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCurrent("Y");
        crossCheckAndCurrentDealRule.setProductCurrent("Deb");
        crossCheckAndCurrentDealRule.setPurposeCurrent("Other");
        crossCheckAndCurrentDealRule.setCompanyFullNameCrossChecked("Google, INC.");
        crossCheckAndCurrentDealRule.setCompanyRoleCurrent("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCrossChecked("Y");
        crossCheckAndCurrentDealRule.setProductCrossChecked("Debt");
        crossCheckAndCurrentDealRule.setCaStatusCrossChecked("Active");
        crossCheckAndCurrentDealRule.setDealStatusCrossChecked("Active");
        return crossCheckAndCurrentDealRule;
    }

    public static BPNRuleEngineInputModel generateCrossCheckAndCurrentDealRuleScenarioOnePointTwoTrue() {
        BPNRuleEngineInputModel crossCheckAndCurrentDealRule = new BPNRuleEngineInputModel();
        crossCheckAndCurrentDealRule.setCompanyFullNameCurrent("TEXAS BLIND CO");
        crossCheckAndCurrentDealRule.setCompanyRoleCurrent("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCurrent("N");
        crossCheckAndCurrentDealRule.setProductCurrent("M&A");
        crossCheckAndCurrentDealRule.setPurposeCurrent("Other");

        crossCheckAndCurrentDealRule.setCompanyFullNameCrossChecked("Google, INC.");
        crossCheckAndCurrentDealRule.setCompanyRoleCrossChecked("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCrossChecked("Y");
        crossCheckAndCurrentDealRule.setProductCrossChecked("Debt");
        crossCheckAndCurrentDealRule.setCaStatusCrossChecked("Active");
        crossCheckAndCurrentDealRule.setDealStatusCrossChecked("Active");
        return crossCheckAndCurrentDealRule;
    }
}
