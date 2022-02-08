package SeleniumPrograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertAndVerifyInSelenium {

	
		@Test		
		public void testVerify() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//Open Google
		driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
        String Actualtitle = "Google";
        String Expectedtitle = driver.getTitle();
        
        
        Assert.assertEquals(Actualtitle, Expectedtitle);  // Hard Assert
        
        SoftAssert softassert = new SoftAssert();         // Soft Assert 
        softassert.assertEquals(Actualtitle, Expectedtitle);
        
        //softassert.assertAll();
		}
	

}
