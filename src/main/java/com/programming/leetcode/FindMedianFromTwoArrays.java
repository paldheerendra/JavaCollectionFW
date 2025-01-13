package com.programming.leetcode;

public class FindMedianFromTwoArrays {
	
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int i=0,j=0,k=0;
        
        int arr[] = new int[m+n];
        
        while(i<m && j < n){
            if(nums1[i] < nums2[j])
                arr[k++] = nums1[i++];
            else
                arr[k++] = nums2[j++];
        }
        if(i<m){
            while(i<m){
                arr[k++] = nums1[i++];
            }
        }
        if(j<n){
            while(j<n){
                arr[k++] = nums2[j++];
            }
        }
        for(int ele: arr)
        System.out.print(ele);
        System.out.println();
        n = n+m;
        if(n%2 ==1)
        	return arr[((n+1)/2)-1];
        else 
        	return ((float)arr[(n/2)-1]+(float)arr[(n/2)])/2;
        
    }

	public static void main(String[] args) {
		int [] arr1 = {1,3};
		int [] arr2 = {2,4,5};
		System.out.println(findMedianSortedArrays(arr1, arr2));

	}

}
