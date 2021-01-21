package com.programming.integers;
public class IntToWords {
	

	public static void main(String[] args) {

		String str1 ="dheerendra";
		String str2= new String("dheerendra");
		
		System.out.println(str1==str2);
		
		String str= "Dhe56eRe$&$#N";
		System.out.println(Integer.toHexString(str.hashCode()));
		str = str + "465465";
		System.out.println(Integer.toHexString(str.hashCode()));
		//str = str.replaceAll("[\\d]", "");
		str = str.replaceAll("[^a-zA-z]", "");
		
		for(int i = str.length()-1 ; i>=0 ; i--) {
			
			 if(Character.isUpperCase(str.charAt(i))) {
				 System.out.print(Character.toLowerCase(str.charAt(i)));
			 }
			 else
				 System.out.print(Character.toUpperCase(str.charAt(i)));
		}
		
	}

}
