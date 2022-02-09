package com.programming.arrays;

/*1. given a zero indexed array a consisting of N integers, 
 * returns an integer that is the sum of all elements of an array A,
 *  except ignore sections of numbers starting with a 6 and extending to the next 9*/


/*2. Sum of array elements excluding the elements which lie between a and b*/

public class CodilityTest1 {

	static void sumexcludingrange(int li[], int a, int b) {
		int sum = 0;
		boolean add = true;

// loop in li 
		for (int i = 0; i < li.length; i++) {

// if no != a then add 
			if (li[i] != a && add == true)
				sum = sum + li[i];

// mark when a  
// and b are found  
			else if (li[i] == a)
				add = false;
			else if (li[i] == b)
				add = true;
		}

// print sum 
		System.out.print(sum);
	}

//Driver Code 
	public static void main(String[] args) {
		int lis[] = { 1, 2, 4, 5, 6 };
		int a = 2;
		int b = 5;

		sumexcludingrange(lis, a, b);
	}

}
