package com.testersconnect.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BAT_Suite extends TestCaseBase {
	
	
	
	
	@BeforeTest
	public void init() {
		System.out.println("initiializing tests");
		System.out.println(" connecting FB tests");
		System.out.println("connected tests");
		System.out.println("connected db tests");
	
		System.out.println("......... tests");
	}
	
	
	
@AfterTest
public void cleanup() {
	
	
	System.out.println("saving your tests");
	System.out.println("deletion tests");
	System.out.println("temp files tests");
	System.out.println("logout tests");
	
}
	@Test(priority=1, description="Verfies Login Feature in FB")
	public void verifyFBLogin() {
		System.out.println("Verfies Login Feature in FB ");
		
		
		//ARRANGE/Test pre-requisites
		
		//ACT/perform the steps.
		
		//ASSERT/validation/verification
		
		
		
		
		
	}
	
	@Test(priority=4,description="Verfies Logout Feature in FB")
	public void verifyFBLogout() {
		System.out.println("Verfies Logout Feature in FB ");

		
		
		//Actual
		boolean rc=false;
		Assert.assertEquals(rc,false);
	
	
	
	
	
	
}
	
	
	@Test(priority=2,description="Verfies Login View note comments Feature in FB")
	public void verifyFBViewNote() {
		System.out.println(" Verfies Login View note comments Feature in FB");
		
	
	
	
	
	
	}
	
	
	
	@Test(priority=3,description="Verfies Login Feature post feature in FB")
	public void verifyFBC0mment() {
		System.out.println("Verfies Login Feature post feature in FB ");
		
		
		//ARRANGE
	
	//ACT
		
		
		
		
		//ASSERT
		
		
}

}