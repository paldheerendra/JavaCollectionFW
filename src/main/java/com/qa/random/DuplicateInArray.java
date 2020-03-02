/**
 * 
 */
package com.qa.random;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class DuplicateInArray {

	//1st method
	public static void duplicate(int arr[]) {
		
		
		for(int i =0 ; i < arr.length ; i++) {
			
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate is: " + arr[i]);
				}
			}
		}
	}
	
	//1st method
		public static void duplicate1(int arr[]) {
			
			
			for(int i =0 ; i < arr.length ; i++) {
								
					if(arr[i] == arr[i+1]) { // at the last it would throw ArrayIndexOutOfBoundsException because it'd compare arr.lenght +1 
						System.out.println("Duplicate is: " + arr[i]);
					}
				}
			
		}
		
	//2nd method Using Set
	
	public static void duplicateArray(int arr[]) {
		Set<Integer> set= new HashSet<Integer>();
		for(int num : arr) {
			
			if(set.add(num) == false) {
				System.out.println("Duplicate is: " + num);
			}
		}
	}

	public static void main(String args[]) {
		int numbers[] = {3, 3, 4, 4, 5, 6 , 9};
		duplicate(numbers);
		//duplicateArray(numbers);
		
		//duplicate1(numbers);
	}
	
	
	
}
