package seleniumPrgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws Exception {
		
		//For firefox
		System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\Desktop\\@Abdul\\Softwares\\FirefoxGeckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window Handle "+parentWindowHandle);
		
		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> handles = driver.getWindowHandles();
		for (String windowsIds : handles) {
			
			System.out.println("windowsIds "+ windowsIds);
			
			if(!windowsIds.equals(parentWindowHandle)) {    // ! == Not
				
			driver.switchTo().window(windowsIds);
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			//driver.findElement(By.id("firstName")).sendKeys("Enterd Text");
			Thread.sleep(2000);
			
			//driver.close();
			}
			
		}
		
		//Thread.sleep(2000);
		driver.quit();

	}

}
