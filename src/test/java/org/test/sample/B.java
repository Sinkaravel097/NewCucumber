package org.test.sample;

import org.testng.annotations.Test;

public class B {
	
	@Test(groups="Smoke")
	private void tc33() {
		System.out.println("Test Case 33");
	}
	
	@Test(groups= {"Smoke" , "Sanity"})
	private void tc2() {
		System.out.println("Test Case 2");
	}
	
	@Test(groups="Sanity")
	private void tc1() {
		System.out.println("Test Case 1");
	} 
	
	@Test(groups= {"Smoke" , "Regression"})
	private void tc22() {
		System.out.println("Test Case 22");
	}
	
	@Test(groups= {"Regression" , "Sanity"})
	private void tc42() {
		System.out.println("Test case 42");
	}
	
	@Test(groups="Regression")
	private void tc3() {
		System.out.println("Test Case 3");
	}
	
}
