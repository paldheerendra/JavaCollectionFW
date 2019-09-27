
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class SingletonChildClass {

	public static void main(String args[]) {

		//Can directly call static method
		SingletonClass.getCarInfo();
		

		SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		/*
		 * when we change the value for a variable it will be changed for each instance
		 * of the class. because it refers to single instance only
		 * *using the instance/object we can call non static elements/methods
		 */
		obj.a = obj.a + 20;
		System.out.println(obj.a);
		System.out.println(obj2.a);
		
		
		obj.startFun();
		obj.stopFun();
	}

}
