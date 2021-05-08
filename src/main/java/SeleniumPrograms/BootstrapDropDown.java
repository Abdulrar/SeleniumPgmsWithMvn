package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		//https://www.jquery-az.com/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		
		driver.findElement(By.id("btnDropdownDemo")).click();
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='dropdown-menu show']/a"));
		
		System.out.println(options.size());
		
		for (WebElement option : options) {
			
			System.out.println(option.getText());
			
			String textOption = option.getText();
			
			if(textOption.equals("HTML")){
				
				option.click();
				break;
			}
			
		}
	
		
		
	}

}
