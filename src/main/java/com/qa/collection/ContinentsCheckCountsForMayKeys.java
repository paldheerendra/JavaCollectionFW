package com.qa.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ContinentsCheckCountsForMayKeys {

	public static void main(String[] args) {
		
		HashMap<String, String> hmap1 = new HashMap<String, String>();
		hmap1.put("India", "Asia");
		 hmap1.put("Bangladesh", "Asia");
		 hmap1.put("Austria", "Europe");
		 hmap1.put("Iceland", "Europe");
		 hmap1.put("Srilanka", "Asia");
		 hmap1.put("Germany", "Europe");
		 
		 //o/p -> {Asia=3, Europe=2,}
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 for(Entry<String, String> entry : hmap1.entrySet()) {
			 
			 if(map.containsKey(entry.getValue()))
				 map.put(entry.getValue(), map.get(entry.getValue()) + 1);
			 else
				 map.put(entry.getValue(), 1);
		 }		 
		 System.out.println(map);
		 
		 //2.
		 Map<String, Long> continent = hmap1.values().stream().collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
		 
		 System.out.println(continent);
		 
		//3.
		Collection<String> values = hmap1.values();
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for(String ele : values) {
			 if(hm.containsKey(ele))
				 hm.put(ele, hm.get(ele) + 1);
			 else
				 hm.put(ele , 1);
		}
		System.out.println(hm);
	}

}
