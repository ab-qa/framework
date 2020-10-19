	package com.manulife.ap.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;

@QAFTestStepProvider
public class diffRegionDataSteps {

	@QAFTestStep(description = "I login with username {0} and {1}")
	public void iPrintData(String username, String password) {
		System.out.println("Username - " + username);
		System.out.println("Password - " + password);
	}
	
}
