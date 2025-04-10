package seleniumpkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> window = driver.getWindowHandles();  //(parent and child window in it)
		Iterator<String> it = window.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		//here sir used the debugging for getting gmail extracted from whole sentence but i get it directly
		String emailID = (driver.findElement(By.xpath("//a[@href='mailto:mentor@rahulshettyacademy.com']")).getText());
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailID);
		
		

	}

}
