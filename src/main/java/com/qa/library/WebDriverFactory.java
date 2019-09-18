/**
 * 
 */
package com.qa.library;

import java.lang.reflect.Method;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class WebDriverFactory {


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
