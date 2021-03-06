/**
 * 
 */
package com.qa.string;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class CheckTwoStringValues {

	
	public static void main(String[] args) {
		
		String s1 = "Selenium";
		String s2 = "Selenium" ;
		
		System.out.println(s1 == s2); //true
		
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s1 = s2); // it will print the value
		
		//s1.getChars(0, 3, s1.toCharArray(), 2);
		
		System.out.println(s1.hashCode());
		
		System.out.println(s1.indexOf(3));
		
		System.out.println(s1.indexOf(0, 3));
		
		System.out.println(s1.indexOf("en"));
		
		System.out.println(s1.indexOf("en" , 2));
		
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(2 , 7));
		
		for(char ch : s1.toCharArray()) {
			System.out.println(ch);
		}
		
		
		
	}

}
