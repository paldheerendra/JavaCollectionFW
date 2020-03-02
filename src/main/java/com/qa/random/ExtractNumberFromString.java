/**
 * 
 */
package com.qa.random;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class ExtractNumberFromString {


	public static void extractInt(String str) {
		
		str = str.replaceAll("[^\\d]", " ").trim();
				
		//str = str.replaceAll(" +" , "");
		
		
			System.out.println(str);
	}
	
	public static void removeChars(String str) {
		
		for (char ch : str.toCharArray()) {
            
            if (Character.isDigit(ch)) 
                System.out.print(ch + " ");           

		}
	}

	public static void main(String[] args) {


		extractInt("Sapie1n2 535 af 5");
		removeChars("hell4 123 lo213 fda21 23");

	}

}
