package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEdit =  driver.findElement(By.xpath("//input[@name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEdit)).getText());
		
		//it can not handle flex element
		//WebElement DateofBirth = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		//driver.findElement(with(By.tagName("input")).below(DateofBirth)).click();
		
		//WebElement icecream = driver.findElement(By.xpath("//label[@class='form-check-label']"));
		//driver.findElement(with(By.tagName("label")).toLeftOf(icecream)).click();
		
		WebElement radiobutton  = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
	}
	

}
