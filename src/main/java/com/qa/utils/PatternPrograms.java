/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class PatternPrograms {

/*	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	
	
	System.out.print(i + " ");
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 
	*/
	public static void trianglePrint(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	/*
	5 4 3 2 1 
	5 4 3 2 
	5 4 3 
	5 4 
	5 
	
	1 1 1 1 1 
	2 2 2 2 
	3 3 3 
	4 4 
	5
	*/
	
	public static void reverseTrianglePrint(int rows) {
		
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	/*
	
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1

	5 5 5 5 5 
	4 4 4 4 
	3 3 3 
	2 2 
	1
	
	*/	
	public static void reverseTrianglePrint2(int rows) {
		
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	/*
	5 4 3 2 1 
	4 3 2 1 
	3 2 1 
	2 1 
	1
	*/
	public static void reverseTrianglePrint3(int rows) {
		
		for (int i = rows; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void diamondPrint() {

	}

	public static void main(String[] args) {

		trianglePrint(5);
		
		System.out.println("---------------------------");
		reverseTrianglePrint(5);
		
		System.out.println("---------------------------");
		reverseTrianglePrint2(5);
		
		System.out.println("---------------------------");
		reverseTrianglePrint3(5);

	}

}
