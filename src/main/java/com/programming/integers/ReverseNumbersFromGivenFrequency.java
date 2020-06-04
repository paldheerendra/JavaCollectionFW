package com.programming.integers;

public class ReverseNumbersFromGivenFrequency {

	/*
	 * Input: [1,3,5,7,9,11,15,17,19,20,21] n=3
	 * 
	 * Output: [5,3,1,11,9,7,19,17,15,21,20]
	 */

	public static void pintReverseNum(int [] arr, int num) {	

		int temp = num;
		int start = 0;
		int end = num;
		for (int i = 0; i < arr.length; i++) {

			if (end > arr.length) {
				break;
			}

			for (int j = end - 1; j >= start; j--) {
				System.out.print(arr[j] + " ");
			}
			start = end;
			end = end + temp;
			if (end > arr.length) {
				end = end - 1;
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11, 15, 17, 19, 20, 21};
		pintReverseNum(arr, 3);
	}

}
