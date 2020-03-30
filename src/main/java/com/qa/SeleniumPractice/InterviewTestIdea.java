/**
 * 
 */
package com.qa.SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class InterviewTestIdea {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resource/drivers/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void getData() throws InterruptedException {
		driver.get("https://wanikirtesh.github.io/");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='selDetails']")));
		
		select.selectByValue("department");
		select.selectByValue("region");
		
		Select selDep = new Select(driver.findElement(By.xpath("//select[@id='fltdepartment']")));
		selDep.deselectAll();
		selDep.selectByVisibleText("Marketing");
		
		Select selReg = new Select(driver.findElement(By.xpath("//select[@id='fltregion']")));
		selReg.deselectAll();
		selReg.selectByVisibleText("UAE");
		
		driver.findElement(By.xpath("//button[@id='btnGen']")).click();
				
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		  String parentWindow = it.next();
		  String childWindow = it.next();
		  
		  driver.switchTo().window(childWindow);
		  
		 List<WebElement> list=driver.findElements(By.xpath("//table[@id='rpt']//tbody//tr"));
		 System.out.println(list.size());
		 
		 Assert.assertEquals(list.size(), 9);
		 
		 List<WebElement> listCB = driver.findElements(By.xpath("//table[@id='rpt']//tbody//tr//td//input[@type='checkbox']"));
		 int count = 0;
		 for(int i = 0; i < listCB.size() ; i ++)
		 {
			 
			 if(listCB.get(i).isSelected()) {
				 count ++;
			}
		 }
		 
		 Assert.assertEquals(count, 4);
		 
		 for(int i = 0 ; i < list.size() ; i++) {
			 
			 if(i == 3) {				 
				 Assert.assertEquals(list.get(i).getText(), "4 Chetan Patel Marketing UAE band 2 5");
				 listCB.get(i).isSelected();
			 }
				 
			 
		 }
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
