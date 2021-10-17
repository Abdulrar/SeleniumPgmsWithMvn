package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementAndFindElements {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		//FindElement
		WebElement firstNameTxt = driver.findElement(By.xpath("//input[@name='name']"));
		firstNameTxt.sendKeys("HYR Tutorials");
		
		//FindElements
		List<WebElement> elements = driver.findElements(By.xpath("//div/h1"));
		System.out.println(elements.size());
	
		
		for (WebElement element : elements) {
			System.out.println(element.getText());
			//System.out.println(element.getSize());
			
		}
		
		//driver.quit();
		
	}

}
