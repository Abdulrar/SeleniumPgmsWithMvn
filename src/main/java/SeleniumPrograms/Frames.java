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

public class Frames {

	public static void main(String[] args) {

		/*
		 * Frame is the Html component which can be used to embed one web page into another web page 
		 * 
		 *  e.x; we have web app having multiple web pages if we want to display one page into another web page
		 * 
		 * >> Or it is a container were developers are trying to combine diff types of elements to gather as per req   
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
        List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("----> "+totalFrames.size());
       
        
        //1st execute 
       // driver.findElement(By.id("name")).sendKeys("Frames Automation");
       // Select select = new Select(driver.findElement(By.id("course")));
       // select.selectByVisibleText("java");
        
        
       //Fluent wait 
      /*  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        	       .withTimeout(Duration.ofSeconds(30))
        	       .pollingEvery(Duration.ofSeconds(5))
        	       .ignoring(NoSuchElementException.class);

        	       WebElement txt2 = wait.until(new Function<WebDriver, WebElement>() {
        	       public WebElement apply(WebDriver driver) {
        	         return driver.findElement(By.id("frm1"));
        	       }
        	     });
       */ 	     
        
        
        	       
      //2nd execute 
         driver.findElement(By.id("name")).sendKeys("Frames Automation");
         driver.switchTo().frame(driver.findElement(By.id("frm1")));
         
         Select select = new Select(driver.findElement(By.id("course")));
         select.selectByVisibleText("Java");
        
         driver.switchTo().defaultContent();
         driver.findElement(By.id("name")).clear();
         
	}

}
