package org.practice;

import java.awt.AWTException;
import java.io.IOException;

import org.info.Ultilityclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseclassPractie extends Ultilityclass {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		launchchromeDrive();
		launchUrl("https://www.google.co.in/");
		waitsImp();
		winMax();
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		capsOn();
		actionPassValue(searchBox, getData(3, 0));
		capsOff();
		WebElement btnClick = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Clicking(btnClick);
		WebElement wiki = driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]"));
		Clicking(wiki);
		WebElement wikiSearch = driver.findElement(By.xpath("//input[@type='search']"));
		passValue(wikiSearch, getData(4, 0));
	
		
		
	}

}
