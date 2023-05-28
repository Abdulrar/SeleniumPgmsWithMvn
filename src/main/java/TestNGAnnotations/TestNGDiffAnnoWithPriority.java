package TestNGAnnotations;

import org.openqa.grid.internal.listeners.Prioritizer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDiffAnnoWithPriority {

	
	@BeforeSuite
	public void beforeSuite() {	
		System.out.println("----------->BeforeSuite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("----------->BeforeTest");
	}
	
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("----------->BeforeClass");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("----------->BeforeMethod");
	}
	
	@Test(priority = 2)
	public void test1() {
		System.out.println("----------->Test1");
	}
	
	
	@Test(priority = 1)
	public void test2() {
		System.out.println("----------->Test2");
	}
	
	
	@Test(priority = 3)
	public void test3() {
		System.out.println("----------->Test3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("----------->AfterMethod");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("----------->AfterClass");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("----------->AfterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("----------->AfterSuite");
	}
	
}
