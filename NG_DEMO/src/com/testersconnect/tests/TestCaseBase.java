package com.testersconnect.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCaseBase {
	

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

}
