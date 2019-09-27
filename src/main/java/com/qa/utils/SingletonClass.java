
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 *         Create a private constructor to restrict creating an object/instance
 *         of this class in other classes
 */
public class SingletonClass {

	static SingletonClass singltonInstance = null;
	public int a = 10;

	
	  private SingletonClass() {
	  
	  System.out.println("------------Private constructor()----------"); }
	 

	public static SingletonClass getInstance() {
		
		if(singltonInstance == null)
		{
			singltonInstance = new SingletonClass();
		}
		return singltonInstance;
	}

	static void getCarInfo() {

		System.out.println("------------getCarInfo()-- static method----------");
	}

	public void startFun() {
		System.out.println("--------startFun()-- non static method------------");
	}

	public void stopFun() {

		System.out.println("--------stopFun()--non static method------------");
	}
		


}
