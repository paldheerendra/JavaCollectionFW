package java8.features.lambdaConcept;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesConcept {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Tom" , "Peter" , "Dheeren", "Sammy");
		list.forEach( System.out:: println );

	}

}
