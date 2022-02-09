package java8.features.java8Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {

		/*@FunctionalInterface
		public interface Predicate<T>*/
		
		/*
		 * Represents a predicate (boolean-valued function) of one argument.
		 * 
		 * This is a functional interface whose functional method is test(Object).
		 */
		Predicate<Integer> func = x -> x > 5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
		List<Integer> colList= list.stream().filter(func).collect(Collectors.toList());
		System.out.println(colList);
		
		//predicate with && and using direct		
		List<Integer> colList2= list.stream().filter(x -> x > 6 && x < 9).collect(Collectors.toList());
		System.out.println(colList2);
		
		//predicate with negate()
		List<String> list2 = Arrays.asList("Java" , "Jav", "Ja", "Python", "Pyth");
		Predicate<String> listExp = x -> x.startsWith("Ja");
		List<String> newList = list2.stream().filter(listExp.negate()).collect(Collectors.toList());
		System.out.println(newList);
	
	}

}
