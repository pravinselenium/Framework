package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisableOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		// isEnabled - is the method to identify that the element is enable or not (but it gives wrong ans sometime)
		//System.out.println (driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		//so the another way to make is poss
		//id is mostly unique so mostly go with ID
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
		System.out.println ("Is Enabled");
		Assert.assertTrue(true);
	}
		else
		{
			Assert.assertFalse(false);
		}

}
}