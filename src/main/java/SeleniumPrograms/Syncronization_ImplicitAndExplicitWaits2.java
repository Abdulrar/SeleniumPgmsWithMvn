package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Syncronization_ImplicitAndExplicitWaits2 {

	public static void main(String[] args) {
		
/*
* 
* 
* Explicit wait can be called as conditional wait. It tells the WebDriver to wait for certain conditions 
* before maximum time exceeded
*WebDriver throws "ElementNotVisibleException" if explicit wait fails
*
*/		 		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("scrolltest" + Keys.ENTER);

       // Thread.sleep(2000);
     // Initialize and wait till element(link) became clickable - timeout in 10 seconds
        WebElement firstResult = new WebDriverWait(driver, 10)
        		.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/h3")));
        
        //  ----------------------> Please practise other functions 
        
        
        System.out.println(firstResult.getText( ));
		
	}

}
