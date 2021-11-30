package org.pojo;

import org.info.Ultilityclass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNG1datapro extends Ultilityclass {
	
	@BeforeClass
	private void launchBrowser() {
		launchchromeDrive();
		
		winMax();
	}
	
	@Test(dataProviderClass=DataProviderClass.class,dataProvider="Football")
	private void tc1(String s1,String s2) throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		FBPojoClass f = new FBPojoClass();
		passValue(f.getTxtUser(),s1 );
		passValue(f.getTxtPass(), s2);
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name="Family")
	private Object[][] getData() {

		return new Object [][] {
			
		//	  s1         s2
			{"Soji","Soji123"},
			{"Senthil","Senthil123"},
			{"Kia","Kia123"},
			{"Gypsy","Gypsy123"}
			
			
		};
		}
	}

