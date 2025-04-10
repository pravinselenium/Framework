package seleniumpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsType {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//locater - id
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//locator - name
		driver.findElement(By.name("inputPassword")).sendKeys("pravin");
		//locator - className
		driver.findElement(By.className("signInBtn")).click();
		//locator - CSS selector = tagname.classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//locator - linktext : when <a (anker) - that means it is a link - when we have to use linktext then anker should be there.
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000); //sometime it needs time while page transition so give this )
		//locator - xPath : //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("pravin");
		//locator -  CSS selector 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("pravinvaidya@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//locator - xPath : //tagname[@attribute='value'][index]
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pravinvaidya@gmail.com");
		//locators - xPath: //Parent Tagname/Child Tagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9922039980");
		//locaters - CSS selector: tagname.classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//locaters - CSS selector: ParentTagname(space)ChildTagname
		System.out.println (driver.findElement(By.cssSelector("form p")).getText());
		
		//locater: mix
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		//locaters - CSS selector: tagname#id (if we not write tagname then its ok)
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("pravin");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		//locators - xPath: reguler expression
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		
		
		
		
		
		
		
		
		
	}

}
