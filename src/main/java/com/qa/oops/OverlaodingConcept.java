/**
 * 
 */
package com.qa.oops;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class OverlaodingConcept {


	/* overloading has nothing to do with return type-- it can be anything--only argument list should be differ
	
	 * we can overload a method with following conditions: 
	 * 1. No of parameters 
	 * 2. Data Types of parameters 
	 * 3. Sequence of parameters
	 */

	public static int getAddition(int a, int b) {
		return a + b;
	}
	
	
	public static double getAddition(int a, int b, int c) {
		return a + b + c;
	}
	
	public static boolean getAddition(boolean value) {					
		return value;
	}
	
	public static String getAddition(String fName, String lName) {
		return fName + " " + lName;
	}
	
	public static final long getMulti(int x, int y) {
		
		return x * y;
	}
	
	public static String getMulti(int x, String y) {
		
		return x + y;
	}
	
	
	public static void main(String[] args) {	

		System.out.println(getAddition(500, 500));
		System.out.println(getAddition(500, 500, 500));
		System.out.println(getAddition("Dheerendra", "Pal"));
	}

}
