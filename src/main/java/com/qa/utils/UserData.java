/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class UserData implements Comparable<UserData> {

	private String name;
	private String email;
	private String mobile;

	public UserData(String name, String email, String mobile) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public int compareTo(UserData user) {
		//return this.mobile.compareTo(user.mobile);
		return this.name.compareTo(user.name);
	}

}
