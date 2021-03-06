package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGParallelTests {

	@BeforeClass
	void setUpClass(){
		System.setProperty("webdriver.chrome.driver", "/Users/andy/Desktop/chromedriver");
	}

	@Test
	void calcTest(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.id("fakebox-input"));
		element.sendKeys("sqrt 16");
		element.submit();

		WebElement result = driver.findElement(By.id("cwos"));
		Assert.assertEquals(result.getText(), "4");
	}

	@Test
	void searchTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.id("fakebox-input"));
		element.sendKeys("Selenium WebDriver");
		element.submit();

		Assert.assertTrue(driver.getTitle().startsWith("selenium WebDriver"));
	}
}
