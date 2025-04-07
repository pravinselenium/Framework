package com.automationTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automationPages.BaseClass;
import com.automationPages.LoginPages;
import com.automationUtility.ExcelDataProvider;
import com.automationUtility.Helper;

public class LoginTestCase extends BaseClass {

	// sequence doesn't matter for annotations
	@Test(priority=1)
	public void loginApp() {
		
		logger =  report.createTest("Login To SauceDemo");
		// Fetch username and password from Excel
		String u = excel.getStringData("Login", 0, 0);
		String p = excel.getStringData("Login", 0, 1);

		// Initialize the LoginPages object
		LoginPages loginpage = PageFactory.initElements(driver, LoginPages.class);
        
		logger.info("Starting Application");
		// Perform login
		loginpage.loginToSauceDemo(u, p);
		
		logger.pass("Login Sucess");
		
		Helper.captureScreenshot(driver);
	}
	
	
	
}
