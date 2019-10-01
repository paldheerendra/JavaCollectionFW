/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class PalindromeCheck {

	public static void isNumberPalindrome(int givenNum) {

		int num = givenNum;
		int temp = num;
		int rev = 0;
		while (num != 0) {

			rev= rev * 10 + num % 10;
			num = num / 10;
		}
		
		if(temp == rev) {
			System.out.println(temp + " is a palindrome number");
		}
		else 
			System.out.println( temp + " is not a palindrome number");
	}
	
	public static void isStringPalindrome(String givenString) {
		
		String str= givenString.toLowerCase();
		String rev = "";
		
		for(int i = str.length()-1; i >=0  ; i --) {
			
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str + " is a palindrome");
		}
		else
			System.out.println(str + " isn't a palindrome");
	}

	public static void main(String[] args) {

		isNumberPalindrome(1221);
		isStringPalindrome("Nitin");

	}

}
