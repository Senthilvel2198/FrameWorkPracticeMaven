package org.pojo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTNG2 {
	
	public WebDriver driver;
	
	@Test
	private void tc1() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	private void tc2() throws InterruptedException {
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cowin Application");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
	}
	
	@Test
	private void tc3() throws InterruptedException {
		driver.findElement(By.xpath("(//h3[contains(text(),Co-Win)])[1]")).click();
		Scanner s = new Scanner(System.in);
		WebElement enterNum = driver.findElement(By.xpath("//input[@type='number']"));
		String mobNum = s.next();
		enterNum.sendKeys(mobNum);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='covid-button-desktop ion-text-center']")).click();
		Thread.sleep(5000);
	}
	
	@Test
	private void tc4() throws InterruptedException {
		
		WebElement enterNum = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		Scanner s = new Scanner(System.in);
		String mobNum = s.next();
		enterNum.sendKeys(mobNum);
	}
	
	@Test
	private void tc5() {
		driver.findElement(By.xpath("//div[@class='covid-button-desktop ion-text-center']")).click();
	}

}
