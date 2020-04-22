/**
 * 
 */
package com.qa.collection;

import java.util.*;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class SortingMap {

	// Function to sort map by Key
	public static void sortByKeyUsingArraList(Map<String, Integer> map) {
		ArrayList<String> sortedKeys = new ArrayList<String>(map.keySet());

		Collections.sort(sortedKeys);

		for (String key : sortedKeys)
		{
			System.out.println( key + ": " + map.get(key));
			//System.out.println("Key = " + key + ", Value = " + map.get(key));
		}
				
	}
	@SuppressWarnings("rawtypes")
	public static void sortByUsingTreeSet(Map<String, Integer> map) {
		System.out.println("-----------------Sort by TreeMap---------");
		
		/*
		 * TreeMap<String, Integer> tmap1=new TreeMap<>();
		 *  tmap1.putAll(map);
		 */
		
	 
		TreeMap<String, Integer> tmap=new TreeMap<String, Integer>(map);
		for(Map.Entry m: tmap.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}
	}

	public static void main(String[] args) {

		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Jayant", 80);
		hmap.put("Abhishek", 90);
		hmap.put("Anushka", 80);
		hmap.put("Amit", 75);
		hmap.put("Danish", 40);

		sortByKeyUsingArraList(hmap);
		
		
		sortByUsingTreeSet(hmap);
	}

}
