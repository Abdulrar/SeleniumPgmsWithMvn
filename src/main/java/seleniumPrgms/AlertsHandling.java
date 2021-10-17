package seleniumPrgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandling {

	public static void main(String[] args) throws Exception {
		
		//For firefox
				System.setProperty("webdriver.gecko.driver","C:\\Users\\araha\\Desktop\\@Abdul\\Softwares\\FirefoxGeckodriver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
				driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
				
				driver.findElement(By.id("alertBox")).click();
				
				
				//Simple Alert
				Alert simpleAlert = driver.switchTo().alert();

				System.out.println(simpleAlert.getText());
				
				Thread.sleep(2000);
				
				simpleAlert.accept();
			
	
				
	
				
				Thread.sleep(2000);
				//Confirmation Alert
				
				driver.findElement(By.id("confirmBox")).click();
				
				Alert confirmationAlert = driver.switchTo().alert();

				System.out.println(confirmationAlert.getText());
				
				Thread.sleep(2000);
				
				confirmationAlert.dismiss();
				
				
				Thread.sleep(2000);
				//promptBox Alert
				
                driver.findElement(By.id("promptBox")).click();
				
				Alert promptBoxAlert = driver.switchTo().alert();

				System.out.println(promptBoxAlert.getText());
				
				Thread.sleep(2000);
				
				promptBoxAlert.sendKeys("text enter");
				
				promptBoxAlert.accept();
				
				
	
	}

}
