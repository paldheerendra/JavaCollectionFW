package java8.features.lambdaConcept;

import java.util.Arrays;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {

		// List<String> list = Arrays.asList("Code", "aapmg" ,"doce", "apamg");

		// Predicate<String> func = x -> x.replaceAll("o", "*");

		int values[] = { 0, 1, 0, 1, 1, 0, 0 };
		Arrays.sort(values);

		for (int ele : values) {
			//System.out.print(ele + " ");
		}

		String[] arr = { "mint", "min", "minimum" };
		//o/p min (which available in all strings)
		Boolean t = false;
		for (int i = 0; i < arr.length; i++) {

			String value = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j].contains(value)) {
					t = true;
				} else {
					t = false;
					break;
				}
			}

			if (t == true)
				System.out.println(value);
		}
	}

}
