package com.dulux.PageFactory;

import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public FindARetailerPage navigateToFindARetailerPage() {
		driver.get("http://001.www.dulux.uat.visualjazz.com.au/find-a-retailer");
		return new FindARetailerPage(driver);
	}

}
