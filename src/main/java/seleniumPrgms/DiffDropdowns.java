package seleniumPrgms;

import java.util.List;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class DiffDropdowns {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\Desktop\\@Abdul\\Softwares\\FirefoxGeckodriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	    
	    
	//Single select Dropdown    
	WebElement CourseName = driver.findElement(By.id("course"));
	Select CourseName_dd = new Select(CourseName);

	
	CourseName_dd.selectByIndex(0);
	Thread.sleep(2000);
	
	CourseName_dd.selectByValue("java");
	Thread.sleep(2000);
	
	CourseName_dd.selectByVisibleText("Python");
	Thread.sleep(2000);
	
	
	
	List<WebElement> AllcourseNames = CourseName_dd.getOptions();
	
	System.out.println("CoursesAvailable :");
	for (WebElement webElement : AllcourseNames) {
		
		System.out.println(webElement.getText());
		System.out.println();
		
	}
	
	
	System.out.println("---------------");
	System.out.println("First selected option : "+CourseName_dd.getFirstSelectedOption().getText());
	
	

	System.out.println("---------------");
	
	
	//Multiple select Dropdown
	WebElement IDEName = driver.findElement(By.id("ide"));
	Select IDEName_dd = new Select(IDEName);
	
	IDEName_dd.selectByIndex(0);
	Thread.sleep(2000);
	
	IDEName_dd.selectByValue("ij");
	Thread.sleep(2000);
	
	IDEName_dd.selectByVisibleText("Visual Studio");
	Thread.sleep(2000);
	
	
	
	
	List<WebElement> AllIDENames = IDEName_dd.getOptions();
	System.out.println("AllIDENames :");
	for (WebElement webElement : AllIDENames) {
		
		System.out.println(webElement.getText());	
		
	}
		
	
	System.out.println("---------------");
	
	List<WebElement> AllIDEslectedOptions = IDEName_dd.getAllSelectedOptions();
	System.out.println("AllIDEslectedOptions :");
	for (WebElement webElement : AllIDEslectedOptions) {
		
		System.out.println(webElement.getText());	
		
	}
	
	
	
	
	System.out.println("---------------");
	System.out.println("First selected option for IDEName_dd : "+IDEName_dd.getFirstSelectedOption().getText());
	
	
	driver.quit();
	
	
	}

}
