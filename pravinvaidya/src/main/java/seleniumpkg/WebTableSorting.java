package seleniumpkg;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on that column
		///capture all the Webelement in the list
		//capture all text of all web element in new list - original list
		//sort in that list - sorted list
		//COMPARE Both list
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementList =  driver.findElements(By.xpath("//tr/td[1]"));
		List<String> OriginalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> SortedlList = OriginalList.stream().sorted().collect(Collectors.toList());
		//COMPARE Both list
		Assert.assertTrue(OriginalList.equals(SortedlList));
		
		//scan the name column with get text - Rice -price
		List<String> price;
		do
		{   List<WebElement> row =  driver.findElements(By.xpath("//tr/td[1]"));
			price = row.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(ab->System.out.println(ab));
		
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		
		}while(price.size()<1);

	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
		
	}

}
