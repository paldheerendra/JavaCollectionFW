/**
 * 
 */
package com.qa.string;

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
		
	}
	
	public static void swapWords(String str) {

		
		System.out.println("***Swapping words***");
		String words[] = str.split(" ");
		for (String word : words) {

			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);

			}
			System.out.print(rev + " ");
		}
	}
	
	public static void wordSwapWithReverseCharacter(String str) {

		String arr[] = str.split(" ");
		System.out.println("***Swapping words with revering the words***");
		/*
		 * for (int i = arr.length - 1 ; i >= 0; i--) { String rev = ""; //StringBuilder
		 * sb = new StringBuilder();//using StringBuilder class for(int j=
		 * arr[i].length()-1 ; j >= 0 ; j --) {
		 * 
		 * rev = rev + arr[i].charAt(j); //sb.append(arr[i].charAt(j)); }
		 * //System.out.print(sb + " "); System.out.print(rev + " ");
		 * 
		 * }
		 */
		String rev = "";
		for (int i = str.length() - 1 ; i >= 0; i--) {
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
	}
	

	public static void main(String[] args) {
		
		wordSwap("Dheerendra Singh Pal");
		System.out.println();
		swapWords("This is dheerendra");
		System.out.println();
		String msg = "Welcome To Altimetrik India";
		wordSwapWithReverseCharacter(msg);
	}

}
