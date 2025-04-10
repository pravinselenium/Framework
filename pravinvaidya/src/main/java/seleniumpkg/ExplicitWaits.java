package seleniumpkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//We will make the object of the class here so it will become globally, then we can use its object and method when we need in code
		//WebDriverWait w = new WebDriverWait(driver,5);
		//below line is given by chatGPT
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi Smartphone");
		
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		//here we are using explicit wait
		//SIR USED DIFFERENT CODE
		w.until(ExpectedConditions.visibilityOf((WebElement) By.id("a-autoid-1-announce")));
		
		//w.until(ExpectedConditions.visibilityOf((WebElement) By.id("a-autoid-1-announce")));
		
		driver.findElement(By.id("a-autoid-1-announce")).click();
		


	}

}
