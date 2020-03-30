/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class String_Word_Swap {
	
	public static void wordSwap(String str) {

		String arr[] = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}
	
	public static void wordSwapWithReverseCharacter(String str) {

		String arr[] = str.split(" ");
		System.out.println("***Swapping words with revering the words***");
		for (int i = arr.length - 1 ; i >= 0; i--) {
			String rev = "";
			//StringBuilder sb = new StringBuilder();//using StringBuilder class
			for(int j= arr[i].length()-1 ; j >= 0  ; j --) {
				
				rev = rev + arr[i].charAt(j);		
				//sb.append(arr[i].charAt(j));
			}
			//System.out.print(sb + " ");
			System.out.print(rev + " ");

		}
	}

	public static void main(String[] args) {
		
		wordSwap("Dheerendra Singh Pal");
		System.out.println();
		wordSwapWithReverseCharacter("Dheerendra Singh Pal");
	}

}
