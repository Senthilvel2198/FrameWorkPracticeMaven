package org.pojo;

import java.io.IOException;
import java.util.Date;

import org.info.Ultilityclass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;


public class JunitOrder extends Ultilityclass {
	
	@BeforeClass
	public static void launchBrower() {
		launchchromeDrive();
		launchUrl("https://www.facebook.com/");
		winMax();
	}
	
	@Before
	public void startTime() {
		System.out.println(new Date());
	}
	
	@After
	public void endTime() {
		System.out.println(new Date());
	}

	
	@Test
	public void tc1() throws IOException {
		FBPojoClass f = new FBPojoClass();
		passValue(f.getTxtUser(), getData(1, 0));
	}
	
	
	@Test
	public void tc2() throws IOException {
		FBPojoClass f = new FBPojoClass();
		passValue(f.getTxtPass(), getData(1,1));
	}
	@Test
	public void tc3() {
		String t = driver.getTitle();
		Assert.assertTrue("Incorrect Title", t.contains("Facebook"));
		System.out.println("Correct Title");
		
	}
	@Test
	public void tc4() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("Incorrect URL", url, "https://www.facebook.com/");
		System.out.println("Correct URL");
	}
	
	@Test
	public void tc5() throws InterruptedException {
		FBPojoClass f = new FBPojoClass();
		Clicking(f.getBtnLogin());
		Thread.sleep(2000);
	}
	
	@AfterClass
	public static void closeFacebbok() {
		closeBrowser();
	
	}
	

}
