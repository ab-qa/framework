package com.manulife.ap.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class dssLoginPage extends WebDriverBaseTestPage<WebDriverTestPage>  {
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}

	@FindBy(locator = "manulife.dss.login.customer")
	private QAFWebElement dssCustomerTab;
	
	@FindBy(locator = "manulife.dss.login.agent")
	private QAFWebElement dssAgentTab;
	
	@FindBy(locator = "manulife.dss.login.email")
	private QAFWebElement dssEmail;
	
	@FindBy(locator = "manulife.dss.login.password")
	private QAFWebElement dssPassword;
	
	@FindBy(locator = "manulife.dss.login.loginbtn")
	private QAFWebElement dssLogin;
	
	@FindBy(locator = "manulife.dss.login.logout.button")
	private QAFWebElement dssLogoutBtn;
	
	//Method to enter the email id
	public void enterEmailId(String LoginId) {
		dssEmail.sendKeys(LoginId);
			}
	
	//Method to enter the password
	public void enterPassword(String pwd) {
		dssPassword.sendKeys(pwd);
		}
	
	public void clickLoginBtn() {
		dssLogin.waitForVisible(5);
		dssLogin.click();
	}
	
	public void switchLoginTab (String tabName) {
		if(tabName.equalsIgnoreCase("Customer")) {
			dssCustomerTab.click();
		} else if (tabName.equalsIgnoreCase("Agent")) {
			dssAgentTab.click();
		}
	}
	
	public void Logout() {
		dssLogoutBtn.waitForVisible(5);
		dssLogoutBtn.click();
		
	}
	
}
