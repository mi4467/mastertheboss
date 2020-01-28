package com.mastertheboss;

import com.mastertheboss.model.BPNRuleEngineInputModel;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.mastertheboss.model.Customer;

public class DroolsTest {

	public static final void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rule");

			BPNRuleEngineInputModel shouldBeGreen = BPNRuleEngineInputModelGenerator.generateCrossCheckAndCurrentDealRuleScenarioOnePointTwoTrue();
			FactHandle fact1 = kSession.insert(shouldBeGreen);
			//BPNRuleEngineInputModel shouldntBeGreen = BPNRuleEngineInputModelGenerator.generateCrossCheckAndCurrentDealRule();
			//FactHandle fact2 = kSession.insert(shouldntBeGreen);

			System.out.println("We are going to run the BPN Rules Engine, the data points look as such: \n");
			System.out.println(shouldBeGreen);

			kSession.fireAllRules();

			System.out.println("We have finished running BPN Rules Engine, the data points look as such: \n");
			System.out.println(shouldBeGreen);

//			System.out.println("The color code is: " + shouldBeGreen.getColorCode());
			//System.out.println("The color code is: " + shouldntBeGreen.getColorCode());
			//System.out.println("The discount for the Customer " + customer2.getName() + " is " + customer2.getDiscount());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}