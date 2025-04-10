package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiblingWithXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//we are using relative xpath. absulate x path starts from root and so large, if someone updated in middle then it will not work
		//sibling below
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent to child and sibling to sibling
		Thread.sleep(2000);
		//System.out.println( driver.findElement(By.xpath("header/div/button[1]/following-sibling::button[1]")).getText());
		//child to parent and sibling to sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


	}

}
