/**
 * 
 */
package com.qa.String;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class ExtractNumberFromString {


	public static void extractInt(String str) {
		
		str = str.replaceAll("[^\\d]", " ").trim();
				
		str = str.replaceAll(" +" , " ");
		
		System.out.println(str);
		
		String s[] = str.split(" ");
		
		int count = 0;
		for(int i = 0; i < s.length; i ++) {
			
			count = count + Integer.parseInt(s[i]);			
		}		
		System.out.println(count);	
			
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
		
		extractInt("Hum11ming13Bird15");

	}

}
