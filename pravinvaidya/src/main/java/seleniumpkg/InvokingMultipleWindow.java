package seleniumpkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokingMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/");
		String coursename = driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses'])[2]")).getText();
		driver.switchTo().window(parent);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(coursename);
		
		//(//a[@href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses'])[2]
		
		

	}

}
