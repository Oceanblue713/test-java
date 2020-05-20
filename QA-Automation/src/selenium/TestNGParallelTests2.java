package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGParallelTests2 {

	@BeforeClass
	void setUpClass(){
		System.setProperty("webdriver.gecko.driver", "/Users/andy/Desktop/geckodriver");
	}


	@Test
	void searchTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.id("fakebox-input"));
		element.sendKeys("Selenium WebDriver");
		element.submit();

		Assert.assertTrue(driver.getTitle().startsWith("selenium WebDriver"));
	}
}
