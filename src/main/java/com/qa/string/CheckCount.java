package com.qa.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CheckCount {

	public static void main(String args[]) {

		String str = "dhee rendra";

		char[] a = str.replace(" ", "").toCharArray();

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					i++;
				}
			}
			System.out.println(a[i] + " " + count);
		}

		countChars(str);
	}
	public static void countChars(String str) {
		char[] strChars = str.replace(" ", "").toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(Character a : strChars) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}else {
				map.put(a, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
	}

}
