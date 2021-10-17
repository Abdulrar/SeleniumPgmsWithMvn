package seleniumPrgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsInSele {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\eclipse-workspace\\Demo1\\Resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		// Open facebook
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		Thread.sleep(4000);
		
		//driver.findElement(By.id("menu_login_show_link")).click();
		//driver.findElement(By.id("menu_login_show_link")).click();
		
        driver.findElement(By.xpath("//*[@id='menu_login_show_link']")).click();
		
        //driver.findElement(By.cssSelector("#menu_login_show_link>input")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("Input field text");
		
        //driver.findElement(By.linkText("Forgotten")).click();
        
        //driver.findElement(By.linkText("Forgotten")).click();   -----> For link text it will not work 
        
       driver.findElement(By.partialLinkText("Forgotten")).click();
        
        
	}

}
