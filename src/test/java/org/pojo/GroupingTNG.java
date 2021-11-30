package org.pojo;


import org.info.Ultilityclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingTNG extends Ultilityclass {
	
	@BeforeClass(alwaysRun=true)
	private void launchWeb() {
		launchchromeDrive();
		winMax();
		
	}
	
	@Test(priority=1,groups="GreensTech")
	private void tc3() {
		WebElement greenWeb = driver.findElement(By.xpath("(//h3[contains(text(),'Best')])[1]"));
		Clicking(greenWeb);
		
	}
	
	@Test(priority=-1,groups="GreensTech")
	private void tc4() throws InterruptedException {
		launchUrl("https://www.google.co.in/");
		WebElement googleSearch = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		passValue(googleSearch, "Greens Technology Chennai");
		Thread.sleep(1000);
		Clicking(searchBtn);
		
	}
	
	
	
}
