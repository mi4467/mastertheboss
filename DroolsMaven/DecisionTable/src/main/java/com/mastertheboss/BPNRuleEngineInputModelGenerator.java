package com.mastertheboss;

import com.mastertheboss.model.BPNRuleEngineInputModel;
import com.mastertheboss.model.Customer;
import com.mastertheboss.model.nestedCustomer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
        crossCheckAndCurrentDealRule.setProductCurrent("Debt Is Bad");
        crossCheckAndCurrentDealRule.setPurposeCurrent("Other");

        crossCheckAndCurrentDealRule.setCompanyFullNameCrossChecked("Google, INC.");
        crossCheckAndCurrentDealRule.setCompanyRoleCrossChecked("Seller");
        crossCheckAndCurrentDealRule.setCompanyIsClientCrossChecked("Y");
        crossCheckAndCurrentDealRule.setProductCrossChecked("Debt");
        crossCheckAndCurrentDealRule.setCaStatusCrossChecked("Active");
        crossCheckAndCurrentDealRule.setDealStatusCrossChecked("Active");
        List<String> data = crossCheckAndCurrentDealRule.getTestList();
        data.add("Finance");
        data.add("Bridge Loan");
        crossCheckAndCurrentDealRule.setCustomer(new Customer("Tom"));
        crossCheckAndCurrentDealRule.getCustomer().setNestedCustomer(new nestedCustomer("Brady"));
        crossCheckAndCurrentDealRule.getCustomer().setPurposes(new ArrayList<String>());
        crossCheckAndCurrentDealRule.getCustomer().getPurposes().add("Buy Side");
        crossCheckAndCurrentDealRule.getCustomer().getPurposes().add("Sell Side");
        return crossCheckAndCurrentDealRule;
    }
}
