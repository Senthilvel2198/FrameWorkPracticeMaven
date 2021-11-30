package org.pojo;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="Football")
	private Object[][] getData() {

		return new Object [][] {
			
		//	  s1         s2
			{"Messi","Messi123"},
			{"Neymar","Neymar123"},
			{"Ronaldo","Ronaldo123"},
			{"Xavi","Xavi123"}
			
			
		};
		}
}
