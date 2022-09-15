package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Amazon_004 extends TestBase{
	
	@Test
	public void footerlinks() {
		List<WebElement> getfooterLinks = AmazonOR.getfooterLinks();
		System.out.println("Total no. of footer links are : " + getfooterLinks.size());
		for(WebElement link:getfooterLinks) {
			System.out.println(link.getText());
		}
	}

}
