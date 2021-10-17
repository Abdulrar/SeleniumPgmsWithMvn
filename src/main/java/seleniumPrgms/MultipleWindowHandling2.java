package seleniumPrgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling2 {

	public static void main(String[] args) throws Exception {
		
		//For firefox
		System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\Desktop\\@Abdul\\Softwares\\FirefoxGeckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindowHandle = driver.getWindowHandle();
		//System.out.println("Parent window Handle "+parentWindowHandle);
	
		driver.findElement(By.id("newTabsBtn")).click();

		Set<String> handles = driver.getWindowHandles();
		
		
		for (String handle : handles) {
			
			System.out.println("window Handles ids before Convering Set to Array  "+handle);
			
			
		}
		
		
		
		
		
		
		Object[] windowId = handles.toArray();  
		//Convering Set to Array of type Object, Since the id is stored in Array we can access the windows randomly w.r.to the reference id(Index)
		
		
		driver.switchTo().window((String) windowId[2]);
	    //driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().window((String) windowId[1]);
		Thread.sleep(2000);
		
		driver.switchTo().window((String) windowId[0]);
	    
	    
	    
       for (Object windowIds : windowId) {
			
			System.out.println("window Handles ids after Convering Set to Array "+windowIds);
			
			
		}
	    
	    
		Thread.sleep(2000);
		//driver.close();
	
	
	
	}

}
