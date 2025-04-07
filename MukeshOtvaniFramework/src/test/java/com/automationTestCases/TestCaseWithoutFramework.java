package com.automationTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseWithoutFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Setup ChromeDriver using WebDriverManager
		        WebDriverManager.chromedriver().setup();
		        
		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();
		        
		        // Maximize the browser window
		        driver.manage().window().maximize();
		        
		        // Open SauceDemo login page
		        driver.get("https://www.saucedemo.com/");
		        
		        // Locate username field and enter username
		        WebElement username = driver.findElement(By.id("user-name"));
		        username.sendKeys("standard_user"); // Use a valid username
		        
		        // Locate password field and enter password
		        WebElement password = driver.findElement(By.id("password"));
		        password.sendKeys("secret_sauce"); // Use a valid password
		        
		        // Locate login button and click
		        WebElement loginButton = driver.findElement(By.id("login-button"));
		        loginButton.click();
		        
		        // Validate successful login by checking for an element on the homepage
		        try {
		            WebElement inventoryPage = driver.findElement(By.className("title"));
		            if (inventoryPage.isDisplayed()) {
		                System.out.println("Login successful!");
		            }
		        } catch (Exception e) {
		            System.out.println("Login failed!");
		        }

		        // Close the browser
		        driver.quit();
		    }
		


	}

