package extentreports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	HomePage hp;

	@BeforeClass
	public void beforeClass() {
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify welcome Text");
		
		baseUrl = "http://www.letskodeit.com/";
		test.log(LogStatus.INFO, "Browser started...");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abromo\\eclipse-workspace\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();

		hp = new HomePage(driver, test);
		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
		hp.login("test@email.com", "abcabc");
		
		Thread.sleep(3000);
		boolean result = hp.isWelcomeTextPresent();
		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified Welcome Text");
		
	}
	
	@AfterClass
	public void afterClass() {
		//driver.quit();
		report.endTest(test);
		report.flush();
	}
}