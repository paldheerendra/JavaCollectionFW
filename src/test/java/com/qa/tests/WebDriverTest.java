/**
 * 
 */
package com.qa.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class WebDriverTest {
	ChromeDriver driver;

	// WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\6867\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void wdTest() {

		driver.get("https:\\www.google.com");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
