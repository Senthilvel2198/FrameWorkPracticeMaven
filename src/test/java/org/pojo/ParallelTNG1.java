package org.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTNG1 {
	
	public WebDriver driver;
	
	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	private void tc2() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Senthil");
		driver.findElement(By.name("pass")).sendKeys("Sojiya@123");
		driver.findElement(By.name("login")).click();
	}
	

}
