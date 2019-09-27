/**
 * 
 */
package com.qa.random;

import com.qa.utils.AccessModifier;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class AcessModifierChild extends AccessModifier {

	public static void main(String args[]) {

		// Outside the package default and private can't be accessed

		// System.out.println(defaultNum);

		// protected and public elements can be accessed out the package
		System.out.println(protctString);
		System.out.println(publicString);

		System.out.println(":::::::::::Methods:::::::::");

		// privateMethod(); //not accessible
		// defaultMethod();

		protectedeMethod();
		publicMethod();
	}

}
