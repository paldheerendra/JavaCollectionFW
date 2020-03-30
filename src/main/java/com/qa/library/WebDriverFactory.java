/**
 * 
 */
package com.qa.library;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class WebDriverFactory {

	WebDriver driver;
	public WebDriverFactory() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resource/drivers/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver(){
		
		return driver;
	}

	Method mth;
	public String setAnnotation(Class<?> cls,Method method) {

				
		String actionType = null;		
		try {
			this.mth=cls.getMethod(method.getName());					
			/*
			 * CustomAnnotation annotationObj = mth.getAnnotation(CustomAnnotation.class);
			 * System.out.println("Driver is going to be initialized for: " + annotationObj.webAction()); 
			 * actionType= annotationObj.webAction();
			 */
			
			actionType=mth.getAnnotation(CustomAnnotation.class).webAction();
			System.out.println("Driver is going to be initialized for: " + actionType);			
			return actionType;
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return actionType;		
		
	}
		
}
