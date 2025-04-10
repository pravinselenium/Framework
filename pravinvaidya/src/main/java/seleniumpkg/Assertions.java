package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Assertion comes from TestNG framework
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				Thread.sleep(2000);
				driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
				//to check if the checkbox is selected or not then use below method
				
				//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				//System.out.println ( driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
				System.out.println( driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
				//Assert.assertEquals(( driver.findElements(By.cssSelector("input[type = 'checkbox']")).size()),"6");
				
				
				//code by rahul shetty
				driver.get("http://spicejet.com"); //URL in the browser

				Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

				//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

				System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

				Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	}

}
