package java8.features.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAscendingOrder {

	public static void main(String[] args) {

		String str = "01735543283872501";
		// 1.
		char[] c = str.toCharArray();
		Arrays.sort(c);
		System.out.println(c);

		// 2.
		List<Integer> list = new ArrayList<>();
		for (char ch : str.toCharArray()) {
			// list.add(Integer.parseInt(String.valueOf(ch)));
			list.add(Character.getNumericValue(ch));
		}
		Collections.sort(list);
		list.forEach(System.out::print);
		// System.out.println(list);

		int[] arr = { 1, 2, 3, 4, 5, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}

			System.out.println(arr[i]);
		}

		/*
		 * int n = 841; int x = 1; for (int i = 0; i < 50; i++) { int nx = (x + n / x) /
		 * 2; x = nx; } System.out.println(x);
		 */

	}

}
