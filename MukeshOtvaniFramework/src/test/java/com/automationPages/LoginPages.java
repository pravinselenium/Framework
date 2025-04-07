package com.automationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {
	
	WebDriver driver;
	
	public LoginPages(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(id = "user-name") WebElement Username;
	@FindBy(id = "password") WebElement Password;
	@FindBy(id = "login-button") WebElement LoginButton;
	
	public void loginToSauceDemo(String UsernameWeb, String PasswordWeb)
	{
		Username.sendKeys(UsernameWeb);
		Password.sendKeys(PasswordWeb);
		LoginButton.click();
	}


}
