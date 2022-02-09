package java8.features.java8Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {

		/*
		 * This is a functional interface and can therefore be used as the assignment
		 * target for a lambda expression or method reference.
		 */

		
		/*@FunctionalInterface
		public interface Consumer<T>*/
		/*
		 * Represents an operation that accepts a single input argument and returns no
		 * result. Unlike most other functional interfaces, Consumer is expected to
		 * operate via side-effects.
		 * 
		 * This is a functional interface whose functional method is accept(Object).
		 */
		Consumer<String> func = x -> System.out.println(x);
		func.accept("Hi Java");
		
		//2.
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.forEach(x -> System.out.println(x / 2));
	}

}
