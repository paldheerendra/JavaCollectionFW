/**
 * 
 */
package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.library.CustomAnnotation;
import com.qa.library.POJO;
import com.qa.library.WebDriverFactory;
import com.qa.library.WebDriverProvider;


/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class LoginTest {
	POJO pojo;
	@CustomAnnotation(webAction = "mobile")
	@Test
	public void initializeDriver() {
		try {
			WebDriverProvider.driverInitialize(new WebDriverFactory().setAnnotation(this.getClass(),this.getClass().getMethod("initializeDriver")));
		} catch (NoSuchMethodException | SecurityException e) {			
			e.printStackTrace();
		}
	}
	
	@CustomAnnotation(webAction = "web")
	@Test
	public void initializeDriver1() {
		try {
			WebDriverProvider.driverInitialize(new WebDriverFactory().setAnnotation(this.getClass(),this.getClass().getMethod("initializeDriver1")));
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@CustomAnnotation(webAction = "safari")
	@Test
	public void initializeDriver2() {
		
		try {
			WebDriverProvider.driverInitialize(new WebDriverFactory().setAnnotation(this.getClass(),this.getClass().getMethod("initializeDriver2")));
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
