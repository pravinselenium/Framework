package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//if we want the the total number of iframe on the page
		System.out.println( driver.findElements(By.tagName("iframe")).size());
		//ifram by index
		//driver.switchTo().frame(0);
		//iframe by element, and there is 1 more option
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		//now we use Action class
		Actions a = new Actions(driver);
		
		a.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();

	}

}
