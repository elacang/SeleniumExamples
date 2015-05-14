package com.dulux.PageFactory;

import org.openqa.selenium.WebDriver;



public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage navigatetoHomePage() {
		driver.navigate().to("http://001.www.dulux.uat.visualjazz.com.au/");
		return new HomePage(driver);
	}
	
	public HomePage closeBrowser(){
		driver.quit();
		return new HomePage(driver);
	}
}