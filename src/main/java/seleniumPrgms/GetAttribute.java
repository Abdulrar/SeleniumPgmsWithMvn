package seleniumPrgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) {
		
		
		//WebElement tableHeader= driver.findElement(By.xpath("//table[contains(@id,'custo')]/tbody/tr/th"));
		//tableHeader.getAttribute("class");

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://duckduckgo.com/");

		WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

				
		// retrieving html attribute value using getAttribute() method
		String typeValue=searchTextBox.getAttribute("type");
		System.out.println("Value of type attribute: "+typeValue);
		
		      //  OR 
		
		String typeValueTwo=driver.findElement(By.id("search_form_input_homepage")).getAttribute("type");
		System.out.println("Value of type attribute: "+typeValueTwo);

		String autocompleteValue=searchTextBox.getAttribute("autocomplete");
		System.out.println("Value of autocomplete attribute: "+autocompleteValue);

		// Retrieving value of attribute which does not exist
		String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
		System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);

		
		
		}
		
		
	}

