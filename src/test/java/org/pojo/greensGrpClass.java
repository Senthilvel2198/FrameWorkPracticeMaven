package org.pojo;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.info.Ultilityclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class greensGrpClass extends Ultilityclass {
	
	@Test(priority=2,groups="Courses")
	private void coursess() {
		WebElement CoursesTab = driver.findElement(By.xpath("(//a[contains(text(),COURSES)])[6]"));
		pointElement(CoursesTab);
	}
	
	@Test(priority=3,groups="Selenium")
	private void seleniumm() {
		WebElement SeleniumCourse = driver.findElement(By.xpath("(//a[contains(text(),Selenium)])[9]"));
		Clicking(SeleniumCourse);
	}
	
	@Test(priority=4,groups="Selenium")
	private void enrollSelenium() {
		WebElement enrollS = driver.findElement(By.xpath("(//a[@href='contact.php'])[2]"));
		Clicking(enrollS);
	}
	
	@Test(priority=5,groups="Selenium")
	private void fillDetailsSelenium() {
		WebElement name = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement eMail = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		WebElement mobileNumber = driver.findElement(By.xpath("(//input[@name='phone'])[1]"));
		WebElement selectCourse = driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
		WebElement selectBranch = driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
		WebElement selectTime = driver.findElement(By.xpath("(//select[@name='time'])[1]"));
		WebElement message = driver.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
		
		passValue(name, "Sojiya");
		passValue(eMail, "saviourchrist98@gmail.com");
		passValue(mobileNumber, "8825427575");
		selectValueDD(selectCourse, "Selenium");
		selectValueDD(selectBranch, "Perumbakkam");
		selectValueDD(selectTime, "Immediately");
		passValue(message, "I would like to Join Selenium course for immediate job placement");
	}

	@Test(priority=3,groups="Python")
	private void pythonn() {
		WebElement pythonCourse = driver.findElement(By.xpath("(//a[contains(text(),Python)])[8]"));
		Clicking(pythonCourse);
	}
	
	@Test(priority=4,groups="Python")
	private void enrollPython() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement enrollP = driver.findElement(By.xpath("(//a[@data-target='#exampleModal'])[6]"));
		js.executeScript("arguments[0].click()", enrollP);
		
	}
	
	@Test(priority=5,groups="Python")
	private void fillingDetailsPython() {
		WebElement nameP = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement phoneP = driver.findElement(By.xpath("(//input[@name='phone'])[2]"));
		WebElement emailP = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		passValue(nameP, "Senthil");
		passValue(phoneP, "8248471887");
		passValue(emailP, "skathiravan32@gmail.com");
	}
}
