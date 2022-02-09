package java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
		
		List<String> products = Arrays.asList("iphone", "McBook", "Mobile", "Shoes" , "Battery");
		
		List<String> result = products.stream().filter(ele -> !ele.equals("Shoes")).collect(Collectors.toList());
		
		//result.forEach(ele -> System.out.println(ele));
		
		result.forEach(System.out :: println);

	}

}
