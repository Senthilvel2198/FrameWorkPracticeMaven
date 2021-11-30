package org.pojo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Jmainrun {
	  
	@Test
	public void tc10() {
		Result rs = JUnitCore.runClasses(Jtesting.class,junitrunner.class,samplejunit.class);
		
		System.out.println("Run Count :"+ rs.getRunCount());
		System.out.println("Failure Count :"+ rs.getFailureCount());
		System.out.println("Run Time :" + rs.getRunTime());
		System.out.println("Ignore Count :" + rs.getIgnoreCount());
		
		List<Failure> fail = rs.getFailures();
		
		for (Failure eachfail : fail) {
			
			System.out.println(eachfail);
			
		}
		
		
	}

}
