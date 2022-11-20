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

public class Frames2 {

	public static void main(String[] args) throws Exception {

		/*
		 * Frame is the Html component which can be used to embed one web page into another web page 
		 * 
		 *  e.x; we have web app having multiple web pages if we want to display one page into another web page
		 * 
		 * >> Or it is a container were developers are trying to combine diff types of elements to gather as per req   
		 */

		
//defaultContent() and driver. switchTo(). parentFrame() is that the first method switches the control to the main web page 
//regardless of the number of frames within the web page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
        List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("----> "+totalFrames.size());
       
        
        	       
      //2nd execute 
         driver.findElement(By.id("name")).sendKeys("Default Frame Automation");
         driver.switchTo().frame(driver.findElement(By.id("frm3")));
         driver.switchTo().frame(driver.findElement(By.id("frm1")));
         Thread.sleep(3000);
         
         Select select = new Select(driver.findElement(By.id("course")));
         select.selectByVisibleText("Java");
         Thread.sleep(3000);
         
         driver.switchTo().parentFrame();
         driver.findElement(By.id("name")).sendKeys("Frame3 Automation");
         Thread.sleep(3000);
         
         driver.switchTo().defaultContent();
         driver.findElement(By.id("name")).clear();
         driver.findElement(By.id("name")).sendKeys("Back to the default Frame Automation");
	
	}

}
