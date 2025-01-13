package com.qa.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		System.out.println('j' + 'a' + 'v' + 'a');

		String array[] = new String[] { "A", "B", "C" };

		List<String> list1 = Arrays.asList(array);

		List<String> list2 = new ArrayList<>(Arrays.asList(array));

		List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));

		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));

		// **********print first char of word*****
		String name = "A Dheerendra Singh Pal ";
		name = name.trim();
		String[] arr = name.split(" ");
		for (String s : arr) {
			if (s.length() > 0)
				System.out.println(s.charAt(0));

		}
		String strn = "my name is dheerendra";
		// o/p- My Name Is Dheerendra

		String arrn[] = strn.split(" ");

		for (String ele : arrn) {
			System.out.print(Character.toUpperCase(ele.charAt(0)));
			for (int i = 1; i < ele.length(); i++) {
				System.out.print(ele.charAt(i));
			}
			System.out.print(" ");

		}

		int nums[] = { 2, 19, 0, 7, 8, 0, 11 };
		//shift all zero to right

		int final1[] = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				final1[j] = nums[i];
				j++;
			}
			
		}
		for (int ele : final1) {
			System.out.print(ele + " ");
		}
		
		String name1= "Dheer$$##20.2$$##3";
		String check []=name1.split("[$$##]");
		
		for(String ele : check) {
			if(!ele.isEmpty())
				System.out.println(ele);
		}
	}

}
