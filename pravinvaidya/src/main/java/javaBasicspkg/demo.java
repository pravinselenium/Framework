package javaBasicspkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	}

}
