package seleniumpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "ii";
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//locater - id
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		//locator - name
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//locator - className
		driver.findElement(By.className("signInBtn")).click();
		//locaters - tagname (xpath - //tagAME , CSS - tagname
		
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.tagName("p")).getText());
	   // Assert.assertEquals((driver.findElement(By.tagName("p")).getText()),"You are successfully logged in");
		Assert.assertEquals(driver.findElement(By.xpath("//h2")),"Hell" + name + ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
