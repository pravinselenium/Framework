package com.automationUtility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	          // Method to start the browser
		    public static WebDriver startBrowser(String browserName, String appURL) {
		        WebDriver driver = null;
		        
		        String browser = browserName.trim().toLowerCase();
		        if (browser.equalsIgnoreCase("Chrome")) {
		            WebDriverManager.chromedriver().setup();
		            driver = new ChromeDriver();
		        } 
		        else if (browser.equalsIgnoreCase("Firefox")) {
		            WebDriverManager.firefoxdriver().setup();
		            driver = new FirefoxDriver();
		        } 
		        else if (browser.equalsIgnoreCase("Edge")) { // IE is outdated, using Edge
		            WebDriverManager.edgedriver().setup();
		            driver = new EdgeDriver();
		        } 
		        else {
		            System.out.println("We do not support this browser: " + browserName);
		            return null;
		        }

		        // Set browser properties
		        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		        driver.manage().window().maximize();
		        driver.get(appURL);
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		        return driver;
		    }

		

		
		
		public static void quiteBrouser(WebDriver driver)
		{
			driver.quit();
		}

		

		

	}



