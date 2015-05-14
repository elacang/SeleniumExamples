package com.dulux.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindARetailerPage extends AbstractPage {

	public FindARetailerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public FindARetailerPage enterSearch(String arg1) {
		driver.findElement(By.name("search")).sendKeys(arg1);
		return new FindARetailerPage(driver);
	}
	
	public FindARetailerPage clickSubmit() {
		driver.findElement(By.cssSelector("input[type=submit]"));
		return new FindARetailerPage(driver);
	}
	
}
