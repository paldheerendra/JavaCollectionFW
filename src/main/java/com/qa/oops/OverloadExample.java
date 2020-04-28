/**
 * 
 */
package com.qa.oops;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class OverloadExample {
	
	public void get(int a, int b) {
		System.out.println("int - int");		
	}

	public void get(float a, int b) {
		System.out.println("float - int");		
	}
	
	public void get(float a, double b) {
		System.out.println("float - double");		
	}
	
	public void get(float a, float b) {
		System.out.println("float - float");		
	}
	
	public void get(double a, double b) {
		System.out.println("double - double");		
	}
	
	public void get(float a, long b) {
		System.out.println("float - long");		
	}
	
	public static void main(String args[]) {
		
		OverloadExample obj =  new OverloadExample();
		
		obj.get(10, 20);
		
		obj.get(10.f, 20);
		
		obj.get(10.0f, 20.9);
		
		obj.get(10.9f, 20.0f);
			
		obj.get(10.5, 20.2);
		
		obj.get(10.55, 20l);
		
		obj.get('a', 'b');
	}
}
