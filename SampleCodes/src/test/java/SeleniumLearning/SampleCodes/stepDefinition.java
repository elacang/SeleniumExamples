package SeleniumLearning.SampleCodes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {

	WebDriver driver = new FirefoxDriver();
		
	@Given("^that the user opens Google homepage on a web browser$")
	public void that_the_user_opens_Google_homepage_on_a_web_browser() throws Throwable {
	    driver.get("https://www.google.com");
	}

	@When("^the user enters \"(.*?)\"$")
	public void the_user_enters(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(arg1);
	}

	@When("^the user press \"(.*?)\" key on the keyboard$")
	public void the_user_press_ENTER_key_on_the_keyboard() throws Throwable {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	}

	@Then("^the user should be shown the result page$")
	public void the_user_should_be_shown_the_result_page() throws Throwable {
	   	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='ires']")).size() != 0);
	}

	@Then("^the user clicks on the first result$")
	public void the_user_clicks_on_the_first_result() throws Throwable {
	   
	}

	@When("^the user clicks on the Im Feeling Lucky button$")
	public void the_user_clicks_on_the_Im_Feeling_Lucky_button() throws Throwable {
		
	}

	@Then("^the user should be redirected on the doodle page of Google$")
	public void the_user_should_be_redirected_on_the_doodle_page_of_Google() throws Throwable {
	 
	}

	
}
