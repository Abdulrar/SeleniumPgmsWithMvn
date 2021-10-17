package SeleniumPrograms;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Syncronization_FluentWait3 {

	public static void main(String[] args) {
		
	 		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
        
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn2")).click();
		System.out.println("Button2 is clicked");

		//driver.findElement(By.id("txt1")).sendKeys("text enter");
		

     // Waiting 30 seconds for an element to be present on the page, checking
     // for its presence once every 5 seconds.     Wait condition along with poling 
		
		// Check the doc ----> https://www.selenium.dev/documentation/en/webdriver/waits/
		
     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(30))
       .pollingEvery(Duration.ofSeconds(5))
       .ignoring(NoSuchElementException.class);

       WebElement txt = wait.until(new Function<WebDriver, WebElement>() {
       public WebElement apply(WebDriver driver) {
         return driver.findElement(By.id("txt2"));
       }
     });
		
//     System.out.println("--------->"+txt2.getTagName());
//    
//     System.out.println("--------->"+txt2.getText());
//     
//     System.out.println("--------->"+txt2.getAttribute("id"));
//     
//     System.out.println("---------hashCode > "+txt2.hashCode());
//     
//     System.out.println("--------->"+txt2.getLocation());
//     
     
     
     driver.findElement(By.id("txt2")).sendKeys("text enter");
     
	}

}
