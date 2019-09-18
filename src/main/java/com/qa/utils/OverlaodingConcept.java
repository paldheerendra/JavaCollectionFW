/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class OverlaodingConcept {



	public static int getAddition(int a, int b) {
		return a + b;
	}
	
	// overloading has nothing to do with return type-- it can be anything--only argument list should be differ
	public static double getAddition(int a, int b, int c) {
		return a + b + c;
	}
	
	public static String getAddition(String fName, String lName) {
		return fName + " " + lName;
	}
	
	public static final long getMulti(int x, int y) {
		
		return x*y;
	}
	
	public static void main(String[] args) {
		

		System.out.println(getAddition(500, 500));
		System.out.println(getAddition(500, 500, 500));
		System.out.println(getAddition("Dheerendra", "Pal"));
	}

}
