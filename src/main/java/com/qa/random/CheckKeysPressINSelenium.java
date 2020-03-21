/**
 * 
 */
package com.qa.random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qa.library.WebDriverFactory;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class CheckKeysPressINSelenium {
	
	WebDriverFactory wdFactory;
	WebDriver driver;
	
	public CheckKeysPressINSelenium() {
		wdFactory = new WebDriverFactory();	
		driver = wdFactory.getDriver();
	}
	
	@Test
	public void checkKeyPress() {
		driver.get("https://www.google.com/");		
		//driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).sendKeys(Keys.CONTROL + "c");
		driver.findElement(By.name("q")).sendKeys("book");
		
		Actions action = new Actions(driver);
		
		//action.keyDown(driver.findElement(By.name("q")), Keys.CONTROL + "C");
		
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "c");
		driver.navigate().refresh();
		
		
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "v");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
