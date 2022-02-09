package java8.features.java8Interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {


		/*@FunctionalInterface
		public interface UnaryOperator<T>
		extends Function<T,T>*/
		
		/*
		 * Represents an operation on a single operand that produces a result of the
		 * same type as its operand. This is a specialization of Function for the case
		 * where the operand and result are of the same type.
		 * 
		 * This is a functional interface whose functional method is
		 * Function.apply(Object).
		 */
		
		UnaryOperator<Integer> func = x -> x * 7;
		int result = func.apply(10);
		System.out.println(result);
		
		UnaryOperator<String> func2 = x -> x.toUpperCase();
		String str = func2.apply("Hello");
		System.out.println(str);
		
	}

}
