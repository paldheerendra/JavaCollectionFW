/**
 * 
 */
package com.qa.SeleniumPractice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qa.library.WebDriverFactory;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class MixImplicitWaitAndExplicitWait {
	
	
	WebDriverFactory wdFactory;
	WebDriver driver;
	
	public MixImplicitWaitAndExplicitWait() {
		wdFactory = new WebDriverFactory();	
		driver = wdFactory.getDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}
	
	
		@Test
		public void mixImplicitExplicit() {				
					
			// Loading a URL
			driver.get("https://www.redbus.in/");
			
			// defining explicit wait
			WebDriverWait wait= new WebDriverWait(driver, 10);
			// Locating and typing in From text box. 
			
			System.out.println("Wait starts:"+new Date());
			WebElement fromTextBox= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("src"))));
			System.out.println("Wait ends:"+new Date());
					
		}
		
		@Test
		public void SameTimeOutForBoth() {
			// Loading a URL
			driver.get("https://www.redbus.in/");
			
			// defining explicit wait
			WebDriverWait wait= new WebDriverWait(driver, 20);
			// Locating and typing in From text box. 
			
			System.out.println("Wait starts:"+new Date());
			try{
			WebElement fromTextBox= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Wrong Locator"))));
			}catch(Exception e)
			{
				System.out.println("Unable to locate element.");
			}
			System.out.println("Wait ends:"+new Date());			
		
		}
		
	

}
