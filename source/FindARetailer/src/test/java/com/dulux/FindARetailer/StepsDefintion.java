package com.dulux.FindARetailer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dulux.PageFactory.FindARetailerPage;
import com.dulux.PageFactory.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefintion {

	WebDriver driver = new FirefoxDriver();
	FindARetailerPage retailerPage = new FindARetailerPage(driver);
	HomePage homePage = new HomePage(driver);
	
	@Given("^the user is in the Find a Retailer landing page$")
	public void the_user_is_in_the_Find_a_Retailer_landing_page()
			throws Throwable {
		//driver.get("http://001.www.dulux.uat.visualjazz.com.au/find-a-retailer/");
		homePage.navigateToFindARetailerPage();
	}

	@When("^a user enters \"(.*?)\"$")
	public void a_user_enters_$(String arg1) throws Throwable {
		//driver.findElement(By.name("search")).sendKeys(arg1);
		retailerPage.enterSearch(arg1);
	}

	@When("^clicks on search button$")
	public void clicks_on_search_button() throws Throwable {
		//driver.findElement(By.cssSelector("input[type=submit]")).click();
		retailerPage.clickSubmit();
	}

	@Then("^result should be shown$")
	public void result_should_be_shown() throws Throwable {
		System.out.println("Result shown");
	}

	@Then("^the user closes the browser$")
	public void the_user_closes_the_browser() throws Throwable {
		//driver.quit();
		homePage.closeBrowser();
	}

}
