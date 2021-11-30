package org.pojo;

import org.info.Ultilityclass;
import org.openqa.selenium.WebElement;

public class Facebook extends Ultilityclass {
	
	public static void main(String[] args) {
		
		launchchromeDrive();
		launchUrl("https://www.facebook.com/");
		winMax();
		
		FBPojoClass p = new FBPojoClass();
		WebElement user = p.getTxtUser();
		passValue(user, "Sojiya");
		
		WebElement pass = p.getTxtPass();
		passValue(pass, "Senthu");
		
		driver.navigate().refresh();
		
		passValue(user, "Loose");
		
		passValue(pass, "Paithiyam");
		
		
		
	
	
	}
	

}
