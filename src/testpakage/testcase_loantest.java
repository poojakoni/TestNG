package testpakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//no need main method using testNg running

public class testcase_loantest extends baseclass { //inhert from baseclass
	
	@Test(groups= {"sanity","regression"})
	public void HomeLoanTest() {
		
		System.out.println("Inside Home Loan Test");
	}
	
	@Test(groups= {"regression"})
	public void PersonalLoanTest() {
		
		System.out.println("Inside Personal Loan Test");
	}

	
	}
