/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class Bmw extends Car {

	public Bmw() {
		super();
				
	}
	@Override
	public void start() {
		System.out.println("-- BMW Car Start()--");
	}

	@Override
	public void stop() {
		
		System.out.println("---Car engine stop method()---");
	}

	// @override -- can't write if it's not overriding method
	public void theftSafety() {
		System.out.println("--BMW theft Safety method()--");
		
	}

	// can't override but can redeclared static method
	public static void reFuel() {
		System.out.println("---BMW reFuel method()---");
		
		
	}

	public static void main(String[] args) {

		/*
		 * //we can call main() in the same main method
		 * 
		 * String arr[]= {"Dh" ,"pal"};
		 * 
		 * main(arr);
		 * 
		 * for(int i=0;i<args.length;i++) {
		 * 
		 * System.out.println(args[i]); }
		 * 
		 * 
		 * 
		 */
		reFuel();

		Bmw b1 = new Bmw();
		// b1.reFuel(); // we can call static method with the object of the class with a
		
		b1.start();
		b1.theftSafety();
		
		Car c=new Bmw();
		c.reFuel();
		
		//super.reFuel(); //we can't use super in static method --compile time error
		
	}

}
