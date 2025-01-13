package java8.features.random;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCountFromNoteFIle {
	
	static String path = "C:\\Users\\Dheerendra\\eclipse-workspace\\JavaCollectionFW\\src\\main\\resource\\com\\qa\\testData\\demo.txt";

	public static void main(String[] args) {
				
		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader reader = null;
		
		int lineCount = 0;		int wordCount = 0;		int charCount = 0;
		try {
			reader = new BufferedReader(new FileReader(path));
			String currentLine = reader.readLine();
						
			while(currentLine != null) {
				lineCount = lineCount + 1;
				String[] words = currentLine.toLowerCase().split(" ");
				for(String word : words) {
					if(!word.isBlank()) {
						
						wordCount = wordCount + 1 ;
						charCount = charCount + word.length();
						if(map.containsKey(word))
							map.put(word, map.get(word) + 1 );
						else
							map.put(word, 1);		
						}
				}								
				currentLine = reader.readLine();
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total lines = " + lineCount);
		System.out.println("Total words = " + wordCount);
		System.out.println("Total chars = " + charCount);
		System.out.println("******word count/occurances*******");
		map.forEach((k,v) -> System.out.println(k + ": " + v));
		
		//print max count words
		Map<String, Integer> maxWords = new HashMap<String, Integer>();
		
		map.entrySet().stream()
			.filter(entry -> entry.getValue() == Collections.max(map.values()))
				.forEach(e -> maxWords.put(e.getKey(), e.getValue()));
		
		System.out.println("********Highest word count *******");
		System.out.println(maxWords);
		//maxWords.forEach((k,v) -> System.out.println(k + " : " + v));
		
	}

}
