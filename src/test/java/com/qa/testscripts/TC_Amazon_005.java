package com.qa.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_Amazon_005 extends TestBase{
	
	@Test
	public void newUserRegistration() {
		Actions act = new Actions(driver);
		
		WebElement ele = AmazonOR.getAccountsandLists();
		act.moveToElement(ele).build().perform();
		
		AmazonOR.getstarthereLink().click();
		
		boolean contains = driver.getTitle().contains("register");
		if(contains) {
			System.out.println("The user is on registration page");
		}else {
			System.out.println("The user is not on the registration page");
		}
		
	}

}
