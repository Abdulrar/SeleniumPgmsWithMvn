package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesClass {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * If we open browser in automation browser will open a 'dummy plane profile'
		 *  (without any predefined configurations) like plugins, certificate acceptance and zoom levels ...or 
		 *  some popups allowed or blocked  
		 * 
		 * 
		 * To use DesiredCapabilities, you need to know the name of the capability and the type of value it takes.
		 * 
		 */
		
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.merge(caps);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cacert.com");
		
	}

}
