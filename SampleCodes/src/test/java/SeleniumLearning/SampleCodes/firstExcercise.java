package SeleniumLearning.SampleCodes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstExcercise {
	
	public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	WebElement searchBox = driver.findElement(By.id("lst-ib"));
	searchBox.sendKeys("Eirol John Lacang");
	searchBox.sendKeys(Keys.ENTER);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("ires")));
	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='ires']")).size() != 0);
	driver.close();
	}
	
}
