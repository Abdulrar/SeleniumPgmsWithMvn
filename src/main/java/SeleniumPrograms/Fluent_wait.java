package SeleniumPrograms;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Fluent_wait {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		 //1st execute 
	        driver.findElement(By.id("name")).sendKeys("Frames Automation");
	        Select select = new Select(driver.findElement(By.id("course")));
	        select.selectByVisibleText("java");
	        
	        
	       //Fluent wait 
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        	       .withTimeout(Duration.ofSeconds(30))
	        	       .pollingEvery(Duration.ofSeconds(5))
	        	       .ignoring(NoSuchElementException.class);

	        	       WebElement txt2 = wait.until(new Function<WebDriver, WebElement>() {
	        	       public WebElement apply(WebDriver driver) {
	        	         return driver.findElement(By.id("frm1"));
	        	       }
	        	     });
	       	     

	}

}
