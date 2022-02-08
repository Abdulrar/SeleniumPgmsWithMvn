package encodeAndDecodeData;

import static org.testng.Assert.assertNotEqualsDeep;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasewithEncryptedPassword {

 public static void main(String[] args) {
  
  //System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
  
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
  
  driver.get("http://demo.nopcommerce.com/");
  
  driver.findElement(By.linkText("Log in")).click();
  
  driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("pavanoltraining@gmail.com");
  driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(decodeString("dGVzdDEyMw=="));
  
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@class='buttons']//*[text()='Log in']")));
  driver.findElement(By.xpath("//*[@class='buttons']//*[text()='Log in']")).click();
 }

 
 static String decodeString(String password) {
  byte[] decodedString = Base64.decodeBase64(password);
  return(new String(decodedString));
 }


}


