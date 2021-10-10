package org.test.sample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Filed implements IRetryAnalyzer{

	int min = 0 , max = 3;
	
	public boolean retry(ITestResult result) {
		
		//    3 < 3
		if (min < max) { 
			
			min++; // 2
			
			return true; // rerun the testcase
			
		}
		
		return false; // testcase wont be rerun again
		
	} 

} 
 