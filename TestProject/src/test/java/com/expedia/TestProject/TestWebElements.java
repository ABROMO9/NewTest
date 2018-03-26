package com.expedia.TestProject;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestWebElements {
	private WebDriver driver;
	private String baseURL;

	@BeforeClass
	public void beforeClass() {
		baseURL = "https://uk.protectyourbubble.com/gadget-insurance/get-quote";
		
		//Browser openBrowser = new Browser();
		//openBrowser.Setup("Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abromo\\eclipse-workspace\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\abromo\\eclipse-workspace\\Selenium\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);;
		
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//i[@class='fa fa-mobile fa-5x fa-inverse']")).click();
	}

	@AfterClass
	public void afterClass() {
	}

}
