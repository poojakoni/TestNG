package testpakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseclass {
	
	

	@BeforeTest(alwaysRun=true)			//first test before all test case excuted:excute only once
	public void m3() {
		System.out.println("inside before test loan test");		
	}
	
	
	@BeforeMethod(alwaysRun=true)	        // default it will pass before method:excute before each method
	public void m1() {
		System.out.println("inside before method loan test");		
	}
	@AfterMethod(alwaysRun=true)	          //default it will pass after method:excute after each method
	public void m2() {
		System.out.println("inside after method loan test");		
	}

	@AfterTest(alwaysRun=true)	            //final test AFTER all test case excuted:excute only once
	public void m4() {
		System.out.println("inside after test loan test");		
	}
}
