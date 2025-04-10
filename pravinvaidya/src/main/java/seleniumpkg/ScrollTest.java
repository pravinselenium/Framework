package seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//scrolling feature is not provided by selenium, so we can write the java code and run it with the help of selenium
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Typecasting the WebDriver
		// Why Typecasting is Required
		//The driver instance by default references the WebDriver interface, which doesn’t declare JavaScript execution methods.
		//Typecasting tells the Java compiler to treat the driver instance as an object of a class that implements both WebDriver and JavascriptExecutor.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		//document.querySelector('.tableFixHead').scrollTop=5000 - This selects the first DOM element with the CSS class tableFixHead.to do it ,
		//write this code in the console
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values =  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for(int i=0; i<values.size(); i++) 
		{
			sum = sum + ( Integer.parseInt(values.get(i).getText()));
		}
		
		//System.out.println(sum);
		String s =  driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int total = Integer.parseInt(s);
		
		//System.out.println(total);
		Assert.assertEquals(total, sum);
		

	}

}
