package com.qa.string;

import java.util.HashMap;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class StringCountEachCharacter {

	public static void countChars(String str) {

		str = str.toUpperCase().replace(" ", "");
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		char strArray[] = str.toCharArray();
		               
		for (char ch : strArray) {

			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			} else
				hmap.put(ch, 1);
			System.out.println(hmap.get(ch));	
			if(hmap.get(ch) > hmap.get(ch)+1) {
				System.out.println(hmap.get(ch));
			}
		}

		
		System.out.println(hmap);

	}

	public static void main(String[] args) {

		/*
		 * countChars("Dheerendra singh");
		 * countChars("I love java but hate c javScript");
		 */
		countChars("Dheerendra");
	}

}
