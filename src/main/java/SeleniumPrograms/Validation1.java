package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation1 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//Open Google
		driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
        String Actualtitle = "Google";
        String Expectedtitle = driver.getTitle();
        
        if(Actualtitle.equals(Expectedtitle)) {
        	
        	System.out.println(Expectedtitle + "--> This is the correct title of the Google page");
        	
        }else {
        	
        	System.out.println(Expectedtitle + "--> This is the incorrect title of the Google page");
        }
		
        
        
	
	
        String ActualCurrentUrl = "https://www.google.com/?gws_rd=ssl";
        String ExpectedCurrentUrl = driver.getCurrentUrl();
        
        if(ActualCurrentUrl.equals(ExpectedCurrentUrl)) {
        	
        	System.out.println(ExpectedCurrentUrl+"--> This is the correct CurrentUrl of the Google page");
        	
        }else {
        	
        	System.out.println(ExpectedCurrentUrl+"--> This is the incorrect CurrentUrl title of the Google page");
        }
        	
        	
        	
        	
	
	}

}
