package seleniumpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Broken_Links {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//"a[href*='soapui']"
		//broken URL
				//Step 1 - IS to get all urls tied up to the links using Selenium
				//  Java methods will call URL's and gets you the status code
				//if status code >400 then that url is not working-> link which tied to url is broken
		 
		List<WebElement> links = driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link:links) 
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			 conn.setRequestMethod("HEAD");
			 conn.connect();
			 int resCode = conn.getResponseCode();
			// System.out.println(resCode);
			 a.assertTrue(resCode< 400, "the link with the text"+ link.getText()+"in brokeen with the status code"+resCode); 
		}
		     a.assertAll();


	}

}
