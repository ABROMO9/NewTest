package com.expedia.TestProject;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abromo\\eclipse-workspace\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select Benz by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("Select Honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select BMW by visible text");
		sel.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print the list of all options");
		List<WebElement> options = sel.getOptions();
		int size= options.size();
		
		for (int i=0; i < size; i++) {
			String optionName = options.get(i).getText();
			System.out.println(optionName);
			
		}
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
	}

}
