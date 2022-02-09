package java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {



		List<Customer> custList = Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Peter", 35),
				new Customer("Simon", 32),
				new Customer("Sammy", 25),
				new Customer("Steve", 30)
				);
		
		String customer = custList.stream().filter(ele -> ele.getName().equals("Peter")).map(Customer::getName).findAny().orElse(null);
		
		System.out.println(customer);
		
		System.out.println("-------------");
		//2.
		 List<String> customers= custList.stream().map(Customer :: getName).collect(Collectors.toList());
		 customers.forEach(System.out :: println);
		 
		//2.
		 List<Integer> customers2= custList.stream().map(Customer :: getAge).collect(Collectors.toList());
		 customers2.forEach(System.out :: println);
		
	}

}
