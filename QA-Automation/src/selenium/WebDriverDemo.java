package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/andy/Desktop/geckodriver");
		// System.setProperty("webdriver.chrome.driver", "/Users/andy/Desktop/chromedriver");
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		// WebElement element = driver.findElement(By.id("lst-ib"));
		// element.sendKeys("Google");
		// element.submit();

		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		driver.findElement(By.cssSelector("a[href*='play.google.com']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'play.google.com')]")).click();
	}
}
