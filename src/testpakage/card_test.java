package testpakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class card_test extends baseclass {
	
	@Test(groups= {"sanity testing"})
	public void CCTest() {
		
		System.out.println("Inside CC Test");


}}
 