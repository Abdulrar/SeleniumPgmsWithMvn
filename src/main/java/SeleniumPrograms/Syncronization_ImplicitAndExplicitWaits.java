package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Syncronization_ImplicitAndExplicitWaits {

	public static void main(String[] args) {
		
/*
* >> When finding the element in any webpage selenium doesn't wait for any time, so if the element is
*    not available immediately then selenium webdriver will throw the exception i.e: NoSuchElementException
*    
* Syncronization : The process of maching the execution speed of selenium with that of the application execution
*                  speed is know as "Syncronization".
*                  
*      We have 1)ImplicitlyWait
*              2)ExplicitlyWait            
* 
* 1)ImplicitlyWait : ImplicitlyWait will wait for all that fields, which we are interacting(Automating) with the 
*                    field for a specific amount of time 
* 
* 2)ExplicitlyWait : ExplicitlyWait will wait for a specific amount of time which we are 
*                    interacting(Automating) the 
* 
* 
* Thread.sleep(4000)(static wait) // 4sec wait
*  ----> it is a static wait so, 
*        1)script will be passed some time
*        2)If element is still not available after Thread.sleep(4000) will throw the exception i.e: NoSuchElementException
* 
* Default wait for Implicit wait is "0(Zero)" seconds    we can find here ----> https://w3c.github.io/webdriver
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
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//-----> Dynamic Wait : if the page or elements is loaded with in 5 sec rest of the 5 sec will e ignore and if more 
		//                      then 10 sec will throw the exception i.e: NoSuchElementException
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		System.out.println("Button1 is clicked");

		driver.findElement(By.id("txt1")).sendKeys("text enter");
		
	}

}
