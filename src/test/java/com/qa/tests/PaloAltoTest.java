package com.qa.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PaloAltoTest {

	public static void removeDuplicates(int[] nums) {

		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println(set);
	}

	public static int removeDuplicates1(int[] nums) {

		 int n = nums.length;
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (nums[i] != nums[i+1]){  
	                temp[j++] = nums[i];  
	            }  
	         }  
	        temp[j++] = nums[n-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            nums[i] = temp[i];  
	        }  
	        return j;  
		
	}
	
	public static int removeDuplicates2(int[] A) {
		if (A.length < 2)
			return A.length;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] != A[j]) {
				j++;
				A[j] = A[i];
			}
	 
	                i++;
		}
	 
		return j + 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 5 };
		removeDuplicates(arr);
		System.out.println(removeDuplicates1(arr));
		System.out.println(removeDuplicates2(arr));
		
		
		

	}

}
