package actionsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        
        Actions action = new Actions(driver);
        
		
	}

}
