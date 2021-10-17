package seleniumPrgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializationOfBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For Download Selenium Jar --> https://www.selenium.dev/downloads/
		
		
		//https://chromedriver.chromium.org/downloads 
		//System. setProperty("webdriver.chrome.driver", "C:\\Users\\araha\\eclipse-workspace\\SeleniumPrograms\\Resources\\Drivers\\chromedriver.exe");
	    //Initialize browser
		//WebDriver driver=new ChromeDriver();
		
		
		//https://github.com/mozilla/geckodriver/releases
		//For firefox
		System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\Desktop\\@Abdul\\Softwares\\FirefoxGeckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		// Open Google
		driver.get("http://www.google.com");
		
		System.out.println("This is the title of google page -------------> "+driver.getTitle());
		String getURL = driver.getCurrentUrl();
		
		System.out.println("This is the url of google page -------------> "+getURL);
		
		// Close browser
		driver.close();
		
	}

}
