package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoDownloadDriverExecutableUsingWebdriverManager {

	public static void main(String[] args) {
		
		/*
		*
		*We don't want download driver executable file for latest version of browsers and we don't want to set properties
		* every time 'WebdriverManager' will take care of Auto Download DriverExecutable for related browser versions
		*
		*If we want to execute the cross browser testing no need to vary about version of driver executable file 
		*other wise it's a big tedious task
		*
		*WebdriverManager is one library which can be added as a dependency (i.e; Jar file) this let 
		*you auto download DriverExecutable for related browser versions
		*
		*
		*To download WebdriverManager dependency(Jar) ----> https://github.com/bonigarcia/webdrivermanager   
		*or go to mvnrepository and search WebdriverManager ---> https://mvnrepository.com/
		*
		*/
		
		
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\eclipse-workspace\\Demo1\\Resources\\Drivers\\geckodriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
	
	//WebDriverManager.firefoxdriver().setup();
	//WebDriver driver = new FirefoxDriver();
	
	//WebDriverManager.chromedriver().version("78.0.3904.105").setup();
	//WebDriver driver = new ChromeDriver();

	}

}
