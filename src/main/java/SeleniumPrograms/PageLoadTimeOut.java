package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		
		
		/*
		 * Every web application takes a different amount of time to load the page and that is called pageloadtime.

           For eg: application A takes 10sec to load and application B takes 6min to load.
           
           You can restrict this pageloadtime to some limit and that time limit is called PageLoadTimeout.
		  
		   In selenium the default value of pageloadtime is 300 sec
		 * 
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
