package TestNGAnnotations;

import org.testng.annotations.Test;

public class TestNGDependsOnMethods {

	//Some TC's are depends on other TC's e.x; If login not work then why we have to execute other TC's
	
	@Test
	public void logInTest() {
		System.out.println("----------->logInTest");
		int i = 2/0;
	}
	
	
	@Test(dependsOnMethods = "logInTest")
	public void homePageTest() {
		System.out.println("----------->homePageTest");
	}
	
	
	/*
	 * @Test public void searchPageTest() {
	 * System.out.println("----------->searchPageTest"); }
	 */
	
	
}
