
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class GenericsFeature {

	public static <T> T getGenericsValues(T value) {

		return value;

	}

	public static int getAddition(int a, int b) {
		return a + b;
	}
	
	
	public static double getAddition(int a, int b, int c) {
		return a + b + c;
	}
	
	public static final long getMulti(int x, int y) {
		
		return x*y;
	}

	/*
	 * @Test public void getGenericValueTest() {
	 * 
	 * String str = getGenericsValues("-----String in generics----");
	 * System.out.println(str);
	 * 
	 * int num = getGenericsValues(100);
	 * System.out.println("-----Numeric value in generics :" + num);
	 * 
	 * System.out.println(getAddition(100, 200)); }
	 */

	public static void main(String args[]) {

		String str = getGenericsValues("-----String in generics----");
		System.out.println(str);

		int num = getGenericsValues(100);
		System.out.println("-----Numeric value in generics :" + num);

		System.out.println("---Addition of 2 numbers :" + getAddition(100, 200));
		
		System.out.println("---Multiplication of 2 numbers :" + getMulti(10, 20));
		
		System.out.println("---Addition of 3 numbers-- overloaded :" + getAddition(100, 200,300));
	}

}
