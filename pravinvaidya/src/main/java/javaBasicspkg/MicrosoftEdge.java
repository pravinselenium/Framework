package javaBasicspkg;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MicrosoftEdge {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println (driver.getCurrentUrl());
		System.out.println (driver.getTitle());
		driver.close();

	}

}
