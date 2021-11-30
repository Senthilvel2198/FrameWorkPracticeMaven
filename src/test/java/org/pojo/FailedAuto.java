package org.pojo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedAuto implements IRetryAnalyzer {

	int a=0;
	int b=4;
	
	public boolean retry(ITestResult result) {
		
		if (a<b) {
			
			a++;
			
			return true;
			
		}
		
		return false;
	}
	
	
	

}
