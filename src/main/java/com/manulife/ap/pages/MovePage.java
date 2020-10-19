
	package com.manulife.ap.pages;

	import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
	import com.qmetry.qaf.automation.ui.annotations.FindBy;
	import com.qmetry.qaf.automation.ui.api.PageLocator;
	import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
	import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

	import junit.framework.Assert;

	public class MovePage extends WebDriverBaseTestPage<WebDriverTestPage>  {
		
		@Override
		protected void openPage(PageLocator locator, Object... args) {
		}

		@FindBy(locator = "manulife.move.language")
		private QAFWebElement moveLangBtn;
		
		@FindBy(locator = "manulife.move.letsgo")
		private QAFWebElement moveLetsGoBtn;
		
		public void langBtnSelect() {
			
			moveLangBtn.click();
		 
		}
		
		public void waitForElement() {
			moveLetsGoBtn.waitForVisible(5);
			
		}
		
		public void verifyLetsGoBtn() {
		    
			moveLetsGoBtn.assertVisible("Let's Go");
					
		}
		

	}

