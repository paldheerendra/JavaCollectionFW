/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class AcessModifierChild extends AccessModifier {

	
	public static void main(String[] args) {
		
 System.out.println(":::::::::::Variables:::::::::");
		System.out.println(defaultNum);
		System.out.println(protctString);
		System.out.println(AccessModifier.publicString); //static elements can be accessed directly with class name
		
		//can't access the private elements outside the class
		//System.out.println(AccessModifier.privateNum);
		
		System.out.println(":::::::::::Methods:::::::::");
		
		//privateMethod(); //not accessible
		defaultMethod();
		protectedeMethod();
		publicMethod();
	}

}
