/**
 * 
 */
package com.qa.oops;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class AbstractConceptChild extends AbstractConcept {

	String userName;
	String password;

	/**
	 * @param userName
	 * @param password
	 */
	public AbstractConceptChild(String userName, String password) {
		super(userName, password);

	}	

	/**
	 * can't have the constructor which isn't defined in super abstract class 
	 * can have only the constructor with the same parameter which is available in super abstract class	  
	 */

	// public ChildToAbstractConcept() { } //constructor

	@Override
	public void addNumbers(double x, double y) {

		System.out.println(x + y);

	}

	@Override
	public void addNumbers(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		AbstractConceptChild ch = new AbstractConceptChild("admin", "password123");

		System.out.println(ch.getUserName());
		System.out.println(ch.getPassword());

		ch.addNumbers(5.55, 6.45);
		ch.addNumbers(100, 200);

		ch.getUserName();
		//can't create object without parameter if no default constructor is created in super abstract class
		//ChildToAbstractConcept ch = new ChildToAbstractConcept();
		//AbstractConcept ch2 = new ChildToAbstractConcept(); 
		
		AbstractConcept objRef = new AbstractConceptChild("TestUserName", "TestPassword");
		System.out.println(objRef.getUserName());
		System.out.println(objRef.getPassword());

	}

}
