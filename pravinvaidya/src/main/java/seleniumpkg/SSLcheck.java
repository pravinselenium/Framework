package seleniumpkg;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		//no need to remember, it is readymade code on selenium document
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		option.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		option.setExperimentalOption("prefs", prefs);
		//can use this to add the extension in the web page which will be open by selenium
		//option.addExtensions(" ")
//same for firefox
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println (driver.getTitle());
		
		
	
}
}