package com.sample;

import com.sample.model.Check;
import com.sample.model.multipleModelMethod.DealParticipantRuleModel;
import com.sample.DealDataGeneratorForMultipleModelMethodology;
import com.sample.model.multipleModelMethod.ProductRuleModel;
import com.sample.model.multipleModelMethod.StatusRuleModel;
import com.sample.model.singleEntity.CrossCheckAndCurrentDealRule;
import com.sample.model.singleFactMethodology.DealRuleModel;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Account;
import org.drools.core.spi.KnowledgeHelper;
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static void help(final KnowledgeHelper drools, final String message){
        System.out.println(message);
        System.out.println("\nrule triggered: " + drools.getRule().getName());
    }
    public static void helper(final KnowledgeHelper drools){
        System.out.println("\nrule triggered: " + drools.getRule().getName());
    }

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

//            DealParticipantRuleModel currentDealParticipant = DealDataGeneratorForMultipleModelMethodology.generateDealParticipantTexasBlindCo();
//            DealParticipantRuleModel crossCheckedDealParticipant = DealDataGeneratorForMultipleModelMethodology.generateDealParticipantGoogleInc();
//            ProductRuleModel currentDealProduct = DealDataGeneratorForMultipleModelMethodology.generateProductDebt();
//            ProductRuleModel crossCheckedDealProduct = DealDataGeneratorForMultipleModelMethodology.generateProductDebtTwo();
//            StatusRuleModel statusRuleModel = DealDataGeneratorForMultipleModelMethodology.generateStatusRuleModel();
//            kSession.insert(currentDealParticipant);
//            kSession.insert(crossCheckedDealParticipant);
//            kSession.insert(currentDealProduct);
//            kSession.insert(crossCheckedDealProduct);
//            kSession.insert(statusRuleModel);

//            DealRuleModel currentDeal = DealDataGeneratorForSingleMethodology.generateDealRuleModelSingleTexasBlind();
//            DealRuleModel crossCheckedDeal = DealDataGeneratorForSingleMethodology.generateDealRuleModelSingleTGoogleInc();
//            kSession.insert(currentDeal);
//            kSession.insert(crossCheckedDeal);

            //One Type
            CrossCheckAndCurrentDealRule crossCheckAndCurrentDealRuleShouldBeRed = DealDataGeneratorForAllInOneMethodology.generateCrossCheckAndCurrentDealRuleScenarioOnePointTwoTrue();
            kSession.insert(crossCheckAndCurrentDealRuleShouldBeRed);

            //Two Type
            DealRuleModel currentDealRule = DealDataGeneratorForSingleMethodology.generateDealRuleModelRedCurrent();
            DealRuleModel crossCheckedDealRule = DealDataGeneratorForSingleMethodology.generateDealRuleModelRedCrossChecked();
            kSession.insert(crossCheckedDealRule);
            kSession.insert(currentDealRule);

            //Three Type
            DealParticipantRuleModel currentDealParticipantRed = DealDataGeneratorForMultipleModelMethodology.generateDealParticipantTexasBlindCoShouldBeRed();
            DealParticipantRuleModel crossCheckedParticipantRed = DealDataGeneratorForMultipleModelMethodology.generateDealParticipantGoogleIncShouldBeRed();
            StatusRuleModel statusRuleModelRed = DealDataGeneratorForMultipleModelMethodology.generateStatusRuleModel();
            ProductRuleModel currentProductRuleRed = DealDataGeneratorForMultipleModelMethodology.generateProductDebtOneRed();
            ProductRuleModel crossProductRuleRed = DealDataGeneratorForMultipleModelMethodology.generateProductDebtTwoRed();
            kSession.insert(currentDealParticipantRed);
            kSession.insert(crossCheckedParticipantRed);
            kSession.insert(statusRuleModelRed);
            kSession.insert(currentProductRuleRed);
            kSession.insert(crossProductRuleRed);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
