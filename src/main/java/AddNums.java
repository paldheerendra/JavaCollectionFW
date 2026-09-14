import java.util.HashMap;
import java.util.Map;

public class AddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 2, 1, 1, 1, 1, 1 };
		for (int a : sum(arr, 10)) {

			System.out.println(a);
		}
		int[] result = sum(arr, 10);

		if (result[0] == 0 && result[1] == 0)
			System.out.println("The target is not available");

	}

	public static int[] sum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] index = new int[2];
		for (int i = 0; i < arr.length; i++) {
			int temp = target - arr[i];
			if (map.containsKey(temp)) {
				/* return new int[] {map.get(temp), i}; */
				index[0] = map.get(temp);
				index[1] = i;

			}
			map.put(arr[i], i);

		}

		return index;

	}

}
