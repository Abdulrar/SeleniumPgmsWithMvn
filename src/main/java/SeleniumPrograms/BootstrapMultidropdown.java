package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapMultidropdown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Multi-selection bootstrap dropdown
				driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
				WebElement dropdownBtn = driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]"));
				dropdownBtn.click();
				List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container')]/li[not(@class='multiselect-item multiselect-group')]/a/label"));
				for (WebElement option : options) {
					
					WebElement optionChk = option.findElement(By.tagName("input"));
					String optionText = option.getText();
					
					System.out.println(optionText);
					
					if(optionText.equals("Bootstrap"))
							option.click();	
					if(optionText.equals("Java"))
						optionChk.click();	
					if(optionText.equals("CSS") && option.findElement(By.tagName("input")).isSelected()) {
						optionChk.click();
					}
				
				}
				
				if(Boolean.valueOf(dropdownBtn.getAttribute("aria-expanded")))
					dropdownBtn.click();
				
				driver.quit();
		
		
	}

}
