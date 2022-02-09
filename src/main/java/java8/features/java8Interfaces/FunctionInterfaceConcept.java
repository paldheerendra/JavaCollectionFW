package java8.features.java8Interfaces;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {


		/*
		 * Interface Function<T,R> 
		 * Type Parameters: 
		 * T - the type of the input to the
		 * function R - the type of the result of the function
		 */
		
		/*@FunctionalInterface
		public interface Function<T,R>
		*/
		
		/*
		 * Represents a function that accepts one argument and produces a result.
		 * 
		 * This is a functional interface whose functional method is apply(Object).
		 */
		
		Function<String, Integer> func = x -> x.length();
		int len = func.apply("Dheerendra");
		System.out.println(len);
		
		//chaining function:
		
		Function<Integer, Integer> func2 = x -> x * 2 ;
		int result = func.andThen(func2).apply("Hello");
		
		System.out.println(result);
		
		
		//2.
		Function<String, String> func3 = x -> x.toLowerCase();
		String ch = func3.apply("Hi Java");
		System.out.println(ch);
		
	}

}
