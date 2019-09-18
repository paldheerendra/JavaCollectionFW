/**
 * 
 */
package com.qa.utils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class MapCollections {

	 
	public static void getMapValues(Map<Integer, String> hm) {
		
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}

		hm.putIfAbsent(26, "Gaurav");

		System.out.println("-------------------------------------");

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
			
				
	}

	public static void sortHashMapUsingTreeMap(Map<String, Integer> map) {
		
		TreeMap<String, Integer> tmap=new TreeMap<>(map);
		//tmap.putAll(map);
		for(Map.Entry<String, Integer> values: tmap.entrySet()) {
			
			System.out.println(values.getKey() + ": " + values.getValue());
		}
				
	}

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(28, "Dheerendra");
		map1.put(29, "Rachit");
		map1.put(27, "Indu");
		map1.put(30, "Pal");
		map1.put(null,null);
		map1.put(null,null);
		map1.put(null,"Saurabh"); //Only 1 null key is allowed, others will be ignored
		map1.put(10,null);
		map1.put(20,null);
		map1.put(100,null);// Null values are allowed
		getMapValues(map1);		
		

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Vishal", 10);
		map.put("Sachin", 30);
		map.put("",null);	
		map.put("Vaibhav", 20);
		System.out.println(map);
		
		/*
		 * //Fetching keys System.out.println("Keys: "+map.keySet()); //Fetching value
		 * System.out.println("Values: "+map.values());
		 */  
	       
		sortHashMapUsingTreeMap(map);
		
		//Similarly we can use HashTable
		Hashtable<Integer,String> hashTable=new Hashtable<Integer,String>();  
		  
		hashTable.put(100,"Amit");  
		hashTable.put(102,"Ravi");  
		hashTable.put(101,"Vijay");  
		hashTable.put(103,"Rahul");  
		//hashTable.put(null,"Yuvi"); //no null key or value allowed
		//hashTable.put(100,null);
		getMapValues(hashTable);
		  
		
	}

}
