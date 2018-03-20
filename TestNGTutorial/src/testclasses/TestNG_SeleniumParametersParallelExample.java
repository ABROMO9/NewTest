package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNG_SeleniumParametersParallelExample {
	WebDriver driver;
	String baseURL;

	@BeforeClass
	@Parameters({"browser"})
	public void beforeClass(String browser) {
		baseURL = "https://letskodeit.teachable.com";
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\abromo\\eclipse-workspace\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abromo\\eclipse-workspace\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	public void testLogin() {
		WebElement loginLink = driver.findElement(By.xpath("//a[contains(@href, '/sign_in')]"));
		loginLink.click();
		WebElement emailField = driver.findElement(By.id("user_email"));
		emailField.sendKeys("test@email.com");
		WebElement passwordField = driver.findElement(By.id("user_password"));
		passwordField.sendKeys("Test1");
		WebElement loginButton = driver.findElement(By.name("commit"));
		loginButton.click();

	}

	@AfterClass
	public void afterClass() {

	}

}
