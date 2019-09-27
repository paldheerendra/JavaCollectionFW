/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class AccessModifier {

	static private int privateNum = 10;
	static String defaultNum = "Default String";
	static protected String protctString = "Protected String";

	static protected String publicString = "Public String";

	private static void privateMethod() {

		System.out.println("------------------privateMethod()-----------------");
	}

	/*
	 * *default keyword is only allowed in interfaces 
	 * default static void defaultMethod() {
	 * 
	 * }
	 */

	static void defaultMethod() {

		System.out.println("------------------defaultMethod()-----------------");

	}

	protected static void protectedeMethod() {
		System.out.println("------------------protectedeMethod()-----------------");
	}

	public static void publicMethod() {
		System.out.println("------------------publicMethod()-----------------");
	}
}
