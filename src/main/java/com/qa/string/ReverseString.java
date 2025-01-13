package com.qa.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Dheerendra";
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		System.out.println(sb);
	}

}
