package TestNGAnnotations;

import org.testng.annotations.Test;

public class TestNGInvocationCountTest {

	//If i want to iterate multiple time the same test
	
	@Test(invocationCount = 10)
	public void sum() {
		
		int i = 2;
		int j =3;
		int k = i+j;
		System.out.println("----------->Sum " + k);
		
	}
	
}
