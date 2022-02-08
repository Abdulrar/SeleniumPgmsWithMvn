package dynamicWebTableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicWebTable1 {

	
	/*
	 * 
	 * table headers count = //table[contains(@id,'custo')]/tbody/tr/th  OR //table[contains(@id,'custo')]//th
	 * 
	 * table row count = //table[contains(@id,'custo')]/tbody/tr
	 * 
	 * table Alldata = //table[contains(@id,'custo')]/tbody/tr/td
	 * 
	 * 
	 */
	
	@Test
	public static void test() {
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();


//driver.navigate().to("http://seleniumpractise.blogspot.com/");
	driver.get("http://seleniumpractise.blogspot.com/");
	
	List<WebElement> tableHeaders= driver.findElements(By.xpath("//table[contains(@id,'custo')]/tbody/tr/th"));	
	
System.out.println(tableHeaders.size());	

Assert.assertEquals(tableHeaders.size(), 5);


boolean status = false;

/*
for (WebElement headers : tableHeaders) {
	
	System.out.println(headers.getText());
	String headerNames = headers.getText();
	
	if(headerNames.contains("Contact")) {
		
		status = true;
		break;
	}
	
	//Assert.assertTrue(status, "Header is not exist");     FALSE --> should be outside for loop
} */


// *** By using for loop *** //

for(int i = 0; i<tableHeaders.size(); i++) {
	
	WebElement headernmaes = tableHeaders.get(i);
	String allHeaderNmaes = headernmaes.getText();
	
if(allHeaderNmaes.contains("Contact")) {
		
		status = true;
		//headernmaes.click(); for click on the required element
		break;
	}
}

//Assert.assertTrue(status, "Header is not exist");
Assert.assertTrue(status, "Header is not exist");

System.out.println("======================================");



List<WebElement> noOfRows = driver.findElements(By.xpath("//table[contains(@id,'custo')]/tbody/tr"));

System.out.println("Total no of rows count: "+noOfRows.size());	

Assert.assertEquals(noOfRows.size(), 7, "Table row count missmatch");



System.out.println("======================================");

List<WebElement> allData = driver.findElements(By.xpath("//table[contains(@id,'custo')]/tbody/tr/td"));


boolean datastatus = false;

for (WebElement allTableData : allData) {
	
	System.out.println(allTableData.getText());
	String allTableCellData = allTableData.getText();
	
	if(allTableCellData.contains("Ola")) {
		
		datastatus = true;
		//allTableData.click(); for clcik on required element
		break;
	}
	
	//Assert.assertTrue(status, "Header is not exist");     FALSE --> should be outside for loop
}
Assert.assertTrue(datastatus, "Record did not find");


System.out.println("======================================");

List<WebElement> companyData = driver.findElements(By.xpath("//table[contains(@id,'custo')]/tbody/tr/td[2]"));


boolean companyDataStatus = false;

for (WebElement companyList : companyData) {
	
	System.out.println(companyList.getText());
	String companyListData = companyList.getText();
	
	if(companyListData.contains("Java")) {
		
		companyDataStatus = true;
		break;
	}
	
	//Assert.assertTrue(status, "Header is not exist");     FALSE --> should be outside for loop
}
Assert.assertTrue(companyDataStatus, "company list data not exist");


System.out.println("======================================");


driver.findElement(By.xpath("//td[text()='Java']//preceding-sibling::td//input")).click();

driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a")).click();


	}

}





