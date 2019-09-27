/**
 * 
 */
package com.qa.utils;

import java.util.Arrays;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class ParallelArraySorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 // Creating an integer array   
        int[] arr = {7,8,1,0,6,3};  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
        // Sorting array elements parallel  
        Arrays.parallelSort(arr); 
        
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  

	}

}
