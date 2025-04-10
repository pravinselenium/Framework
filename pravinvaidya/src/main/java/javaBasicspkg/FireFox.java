package javaBasicspkg;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.firefoxdriver().setup();
FirefoxDriver driver = new FirefoxDriver();

driver.get("https://rahulshettyacademy.com/");
System.out.println(driver.getTitle());
driver.close();

	}

	
}
