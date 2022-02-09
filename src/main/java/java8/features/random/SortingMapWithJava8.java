package java8.features.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortingMapWithJava8 {

	public static void main(String[] args) {
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Jayant", 80);
		hmap.put("Abhishek", 90);
		hmap.put("Anushka", 80);
		hmap.put("Amit", 75);
		hmap.put("Danish", 40);
		
		//1.
		/*
		 * ArrayList<String> sortedKeys = new ArrayList<String>(hmap.keySet());
		 * 
		 * Collections.sort(sortedKeys);
		 * 
		 * sortedKeys.forEach(x -> System.out.println(x + " " + hmap.get(x)));
		 */
		//2.
		/*
		 * hmap.entrySet() .stream() .sorted(Map.Entry.comparingByKey())
		 * .forEachOrdered(x -> System.out.println(x.getKey() + " : " + x.getValue()));
		 */
		
		/*
		 * hmap.entrySet() .stream() .sorted(Map.Entry.comparingByKey()) .forEach(x ->
		 * System.out.println(x.getKey() + " : " + x.getValue()));
		 */
		
		//3.
		hmap.entrySet()
		  .stream()
		  .sorted(Map.Entry.comparingByKey())
		  .forEach(x -> System.out.println(x.getKey() + " :: " + x.getValue()));
	}

}
