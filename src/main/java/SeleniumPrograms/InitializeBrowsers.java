package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
				//For Download Selenium Jar --> https://www.selenium.dev/downloads/
				//For Selenium Webdriver dependencys --> https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
				
				//https://chromedriver.chromium.org/downloads 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\araha\\eclipse-workspace\\Demo1\\Resources\\Drivers\\chromedriver.exe");
			    //Initialize browser
				WebDriver driver=new ChromeDriver();
				
				
				//https://github.com/mozilla/geckodriver/releases
				//For firefox
				
		        //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Resources\\Drivers\\geckodriver.exe");
		        //System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\eclipse-workspace\\Demo1\\Resources\\Drivers\\geckodriver.exe");
				//WebDriver driver = new FirefoxDriver();
				
				
				// Open Google
				driver.get("http://www.google.com");
				driver.getTitle();
				
				System.out.println(driver.getTitle());
				String getURL = driver.getCurrentUrl();
				
				System.out.println(getURL);
				
				// Close browser
				driver.close();
		//driver.quit();
		
		
	}

}
