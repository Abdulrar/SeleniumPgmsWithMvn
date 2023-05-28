package TestNGAnnotations;

import org.testng.annotations.Test;

public class TestNGExpectedException {

	
	@Test
	public void expectedExceptions() {
		
		String a = "abdul";
		
		Integer.parseInt(a);
	

	}
	
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void expectedExceptions2() {
		
		String a = "abdul";
		
		Integer.parseInt(a);
	

	}
}
