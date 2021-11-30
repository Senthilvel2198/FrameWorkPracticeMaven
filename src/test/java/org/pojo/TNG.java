package org.pojo;

import java.io.IOException;
import java.util.Date;

import org.info.Ultilityclass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG extends Ultilityclass {
	
	@BeforeClass
	public void launch() {
		launchchromeDrive();
		winMax();
	}
	
	@AfterMethod
	public void endTime() {
		System.out.println(new Date());
	}
	
	@BeforeMethod
	public void startTime() {
		System.out.println(new Date());
	}
	
	@Parameters({"Username1","pass1"})
	@Test()
	public void tc1(@Optional("Sojiya")String s1,String s2) throws IOException, InterruptedException {
		launchUrl("https://www.facebook.com/");
		FBPojoClass f = new FBPojoClass();
		passValue(f.getTxtUser(), s1 );
		passValue(f.getTxtPass(), s2);
		Thread.sleep(3000);
	}
	
	@Parameters({"Username","pass"})
	@Test
	private void tc2(String s1,String s2) {
		launchUrl("https://www.facebook.com/");
		FBPojoClass f = new FBPojoClass();
		passValue(f.getTxtUser(), s1 );
		passValue(f.getTxtPass(), s2);
	}
	
	@Test(enabled = false)
	public void tc3() {
		FBPojoClass f = new FBPojoClass();
		Clicking(f.getBtnLogin());
	}
	

}
