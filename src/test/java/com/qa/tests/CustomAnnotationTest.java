/**
 * 
 */
package com.qa.tests;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.qa.library.CustomAnnotation;
import com.qa.library.WebDriverFactory;
import com.qa.library.WebDriverProvider;

import java.lang.reflect.Method;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class CustomAnnotationTest {

	WebDriverFactory webFactory;
	WebDriverProvider webDriverProvider;

	@CustomAnnotation(webAction = "web")
	@Test(enabled = false)
	public void annotationTest() {

		/*
		 * Hashtable<String, String> hashTable=dataSet;
		 * 
		 * String actionType=hashTable.get("webAction"); switch(actionType){ case "web":
		 * { System.out.println("Web browser should be invoked");
		 * 
		 * }
		 * 
		 * default: System.out.println("No browser invoked"); }
		 */

		Class<? extends CustomAnnotationTest> cls = this.getClass();
		Method mth;
		try {
			mth = cls.getMethod("annotationTest");
			CustomAnnotation myAnno = mth.getAnnotation(CustomAnnotation.class);
			System.out.println("key: " + myAnno.webAction());
			// System.out.println("value: "+myAnno.value());
		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@CustomAnnotation(webAction = "mobile")
	@Test(enabled = false)
	public void printAnnotation() {

		String actionType = null;
		Method mth;
		try {
			mth = this.getClass().getMethod("printAnnotation");
			CustomAnnotation annotationObj = mth.getAnnotation(CustomAnnotation.class);
			System.out.println("Web Action is being performed on: " + annotationObj.webAction());
			actionType = annotationObj.webAction();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		switch (actionType) {
		case "mobile": {
			System.out.println("Mobile browser is going to be invoked.......");
			break;
		}

		case "web": {
			System.out.println("Web browser is going to be invoked.......");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + actionType);
		}
	}
	
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
			e.printStackTrace();
		}
	}

}
