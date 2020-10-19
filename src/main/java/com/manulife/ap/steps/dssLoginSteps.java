	package com.manulife.ap.steps;

import org.testng.Assert;

import com.manulife.ap.pages.dssLoginPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;
import com.quantum.utils.DeviceUtils;
import com.quantum.utils.DriverUtils;
import com.thoughtworks.selenium.Wait;

@QAFTestStepProvider
public class dssLoginSteps {

	@QAFTestStep(description="user open the URL")
	public void userOpenTheURL(){
		DeviceUtils.getQAFDriver().get("https://dss-demo-dev.apps.eas.pcf.manulife.com/");
		
	}
	@QAFTestStep(description="user should be on Home page")
	public void userShouldBeOnHomePage(){
		
		Assert.assertEquals("SelfServiceUi", DriverUtils.getDriver().getTitle());
		
	}
	@QAFTestStep(description="user login using {0} and {1} on {2} tab")
	public void userLoginUsingAndOnTab(String email,String password,String tab) throws InterruptedException{
		
		dssLoginPage loginPage = new dssLoginPage();
		loginPage.switchLoginTab(tab);
		loginPage.enterEmailId(email);
		loginPage.enterPassword(password);
		loginPage.waitForPageToLoad();
		loginPage.clickLoginBtn();
		
		
	
		
	}
	
	@QAFTestStep(description="user should login to the application successfully")
	public void userShouldLoginToTheApplicationSuccessfully(){
		
		dssLoginPage loginPage = new dssLoginPage();
		loginPage.waitForPageToLoad();
		loginPage.Logout();
	}
}
