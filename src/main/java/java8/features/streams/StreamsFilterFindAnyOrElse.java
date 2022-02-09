package java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {

		List<Customer> custList = Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Peter", 35),
				new Customer("Simon", 32),
				new Customer("Sammy", 25),
				new Customer("Steve", 30)
				);
		
		Customer customer = custList.stream().filter(ele -> ele.getName().equals("Peter")).findAny().orElse(null);
		
		System.out.println(customer.getAge());
		
		//2.
		List<Customer> list = custList.stream().filter(ele -> ele.getAge()==30).collect(Collectors.toList());
		
		list.forEach(ele -> System.out.println(ele.getName() + " " + ele.getAge()));
		
		//3. correct code for #1(in first scenario it might throw exception
		Customer customer2 = custList.stream().filter(ele -> ele.getName().equals("Peter1")).findAny().orElse(null);
		if(customer2 != null)
			System.out.println(customer2.getName() + " " + customer2.getAge());
		else
			System.out.println("-->No matching customer");
		
		
	}

}
