package com.sample;

import com.sample.model.multipleModelMethod.DealParticipantRuleModel;
import com.sample.model.multipleModelMethod.ProductRuleModel;
import com.sample.model.multipleModelMethod.StatusRuleModel;

public class DealDataGeneratorForMultipleModelMethodology {

    public static DealParticipantRuleModel generateDealParticipantTexasBlindCo() {
        DealParticipantRuleModel dealParticipantRuleModel = new DealParticipantRuleModel();
        dealParticipantRuleModel.setCompanyFullName("TEXAS BLIND CO");
        dealParticipantRuleModel.setIsClient("Y");
        dealParticipantRuleModel.setCompanyRole("Seller");
        dealParticipantRuleModel.setCurrentDealOrCrossCheckedDeal(true);
        return  dealParticipantRuleModel;
    }

    public static DealParticipantRuleModel generateDealParticipantTexasBlindCoShouldBeRed() {
        DealParticipantRuleModel dealParticipantRuleModel = new DealParticipantRuleModel();
        dealParticipantRuleModel.setCompanyFullName("TEXAS BLIND CO");
        dealParticipantRuleModel.setIsClient("N");
        dealParticipantRuleModel.setCompanyRole("Seller");
        dealParticipantRuleModel.setCurrentDealOrCrossCheckedDeal(true);
        return  dealParticipantRuleModel;
    }

    public static  DealParticipantRuleModel generateDealParticipantGoogleIncShouldBeRed() {
        DealParticipantRuleModel dealParticipantRuleModel = new DealParticipantRuleModel();
        dealParticipantRuleModel.setCompanyFullName("Google, INC.");
        dealParticipantRuleModel.setIsClient("Y");
        dealParticipantRuleModel.setCompanyRole("Seller");
        dealParticipantRuleModel.setCurrentDealOrCrossCheckedDeal(false);
        return  dealParticipantRuleModel;
    }

    public static  DealParticipantRuleModel generateDealParticipantGoogleInc() {
        DealParticipantRuleModel dealParticipantRuleModel = new DealParticipantRuleModel();
        dealParticipantRuleModel.setCompanyFullName("Google, INC.");
        dealParticipantRuleModel.setIsClient("Y");
        dealParticipantRuleModel.setCompanyRole("Seller");
        dealParticipantRuleModel.setCurrentDealOrCrossCheckedDeal(false);
        return  dealParticipantRuleModel;
    }

    public static ProductRuleModel generateProductDebtTwoRed() {
        ProductRuleModel productRuleModel = new ProductRuleModel();
        productRuleModel.setCurrentDealOrCrossCheckedDeal(false);
        productRuleModel.setProduct("Debt");
        productRuleModel.setPurpose("");
        return productRuleModel;
    }

    public static ProductRuleModel generateProductDebtOneRed() {
        ProductRuleModel productRuleModel = new ProductRuleModel();
        productRuleModel.setCurrentDealOrCrossCheckedDeal(true);
        productRuleModel.setProduct("M&A");
        productRuleModel.setPurpose("Other");
        return productRuleModel;
    }

    public static ProductRuleModel generateProductDebtTwo() {
        ProductRuleModel productRuleModel = new ProductRuleModel();
        productRuleModel.setCurrentDealOrCrossCheckedDeal(false);
        productRuleModel.setProduct("Debt");
        productRuleModel.setPurpose("");
        return productRuleModel;
    }

    public static ProductRuleModel generateProductDebt() {
        ProductRuleModel productRuleModel = new ProductRuleModel();
        productRuleModel.setCurrentDealOrCrossCheckedDeal(true);
        productRuleModel.setProduct("Debt");
        productRuleModel.setPurpose("Other");
        return productRuleModel;
    }

    public static StatusRuleModel generateStatusRuleModel() {
        StatusRuleModel statusRuleModel = new StatusRuleModel();
        statusRuleModel.setCurrentDealOrCrossCheckedDeal(false);
        statusRuleModel.setCaStatus("Active");
        statusRuleModel.setDealStatus("Active");
        return statusRuleModel;
    }

}
