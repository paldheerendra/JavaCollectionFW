package java8.features.java8Interfaces;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {

		/*@FunctionalInterface
		public interface Supplier<T>*/
		/*
		 * Represents a supplier of results.
		 * 
		 * There is no requirement that a new or distinct result be returned each time
		 * the supplier is invoked.
		 * 
		 * This is a functional interface whose functional method is get().
		 */
		getText(() -> "java");
		getText(() -> "Dheerendra");

	}
	
	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
	}
	

}
