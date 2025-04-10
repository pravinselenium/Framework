package seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String MonthNumber = "6";
		String date = "15";
		String year = "2027";
		String[] expectedList = {MonthNumber,date,year};
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@class='react-date-picker__inputGroup__input react-date-picker__inputGroup__year']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElement(By.xpath("(//button[@class='react-calendar__tile react-calendar__year-view__months__month'])[6]")).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		//it will not work in this way
		//System.out.println ( driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).getText());
		//so we get in this way (this is my way)
		WebElement element = driver.findElement(By.xpath("//input[@name='date']"));
		String attributeValue = element.getAttribute("value");
		System.out.println(attributeValue);
		
		//sir style
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i =0; i<actualList.size();i++)
			
		//NEED TO PRECTICE FOR Assert
		{
		System.out.println(actualList.get(i).getAttribute("value"));
		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
		}
		driver.close();
		
	}
}


