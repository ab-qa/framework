package com.manulife.ap.steps;


import com.qmetry.qaf.automation.step.QAFTestStep;
import com.manulife.ap.pages.*;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.utils.DeviceUtils;

@QAFTestStepProvider
public class moveAppLoginSteps {

	@QAFTestStep(description="I start the application")
	public void iStartTheApplication(){
		DeviceUtils.getQAFDriver();
		
	}
	
	@QAFTestStep(description="I click on language button")
	public void clickOnLanguageButton(){
		MovePage loginMovePage=new MovePage();
		loginMovePage.waitForPageToLoad();
		loginMovePage.langBtnSelect();
		
		}
	
	@QAFTestStep(description="Lets go button should be displayed on the next page")
	public void letsGoButtonCheck(){
		MovePage loginMovePage=new MovePage();
		loginMovePage.waitForElement();
		loginMovePage.verifyLetsGoBtn();
		
	}
	
}
