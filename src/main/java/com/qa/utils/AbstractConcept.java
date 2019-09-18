/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public abstract class AbstractConcept {

	private String userName;
	private String password;

	/*
	 * Abstract class can have constructor -- to initialize the private variables etc
	 * In case no constructor is defined then it would call default constructor as soon as the child class create an object
	 */

	public AbstractConcept(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName-- the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password --the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public abstract void addNumbers(double x, double y);

	public abstract void addNumbers(int a, int b);

}
