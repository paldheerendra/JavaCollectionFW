package com.qa.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharFromString {

	public static void main(String[] args) {

		String str = "ahackthegame";

		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		char strArray[] = str.toLowerCase().toCharArray();

		for (char ch : strArray) {

			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			} else
				hmap.put(ch, 1);
		}
		System.out.println("###########1##############");
		// 1.

		for (Map.Entry<Character, Integer> ent : hmap.entrySet()) {
			if (ent.getValue() > 1)
				System.out.println(ent.getKey());
		}
		System.out.println("##########2.###############");
		// 2.

		hmap.entrySet().stream().forEach(x -> {
			if (x.getValue() > 1) {
				System.out.println(x.getKey());
			}
		});

		System.out.println("##########3.###############");
		// 3.
		System.out.println(hmap.entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList()));

	}

}
