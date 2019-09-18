/**
 * 
 */
package com.qa.library;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class WebDriverProvider {

	public static void driverInitialize(String actionType) {
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
			System.err.println("Implementation is not done for: " + actionType);
			//throw new IllegalArgumentException("Unexpected value: " + actionType);
		}
	}
}
