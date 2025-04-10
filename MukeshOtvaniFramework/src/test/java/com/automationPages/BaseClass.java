package com.automationPages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automationUtility.BrowserFactory;
import com.automationUtility.ConfigDataProvider;
import com.automationUtility.ExcelDataProvider;
import com.automationUtility.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setUpSuite() {
		 Reporter.log("Setting up reports and test is ready", true);
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();

		// ✅ Corrected System.getProperty (was incorrectly using getProperties)
		ExtentSparkReporter extent = new ExtentSparkReporter("./Reports/" + Helper.getCurrentDateTime()+ ".html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}
    @Parameters({"browser","urlToBeTested"})
	@BeforeClass
	//public void setUp(){
	public void setUp(String browser,String url) {
	
		//driver = BrowserFactory.startBrowser(config.getBrowser(), config.getStagingURL());
		driver = BrowserFactory.startBrowser(browser,url);
		System.out.println(driver.getTitle());
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quiteBrouser(driver);
	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		// ✅ Removed semicolon after 'if' condition, which was causing screenshot to always run
		if (result.getStatus() == ITestResult.FAILURE) {
			Helper.captureScreenshot(driver);
		}
		report.flush();
		 Reporter.log("Test is completed and Report is generated", true);
	}
}
