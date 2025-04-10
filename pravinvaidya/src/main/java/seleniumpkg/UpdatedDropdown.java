package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//if we have to click at 1 tab for 5 times then we should use while loop by providing condition
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		
		//int i=1; //Initialization
		//while(i<5)   ///condition
		//{
		//	driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		//	i++;
		//}
		for( int i=1;i<5;i++) 
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		
		
		
		}

}
