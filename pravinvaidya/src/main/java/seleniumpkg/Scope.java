package seleniumpkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scope 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// Give the count on links on the page
		// if it is link it should have tag a
		System.out.println("all link " + (driver.findElements(By.tagName("a")).size()));

//2. Get the links count only in the footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("footer link " + (footerdriver.findElements(By.tagName("a")).size()));

//3 . i want link count of only left column
		// press ctrl+f (when u r on inspect mode) = so it will give space where u can
		// write ur xpath and confirm its actual space
		WebElement firstcolumndriver = driver.findElement(By.xpath("(//td/ul)[1]"));
		System.out.println(firstcolumndriver.findElements(By.tagName("a")).size());
//4. click on the each link of the above column and check if the pages are opening
		for (int i = 1; i < firstcolumndriver.findElements(By.tagName("a")).size(); i++) 
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstcolumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
		Set<String> abc = driver.getWindowHandles(); // 4 window
		// iterator - it helps us to move from 1 tab to another tab/window
		Iterator<String> it = abc.iterator();
		// it.hasNext - Weather the next window is present or not(returns boolean value)
		while (it.hasNext()) 
		{
			driver.switchTo().window(it.next()); // it.next - it moves to next tab/window
			System.out.println(driver.getTitle());
		}
	}

}
