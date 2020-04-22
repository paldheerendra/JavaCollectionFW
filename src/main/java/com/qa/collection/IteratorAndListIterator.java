/**
 * 
 */
package com.qa.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class IteratorAndListIterator {

	public static void listIterator(List<Integer> list) {

		System.out.println();

		ListIterator<Integer> lit1 = list.listIterator();
		ListIterator<Integer> lit = list.listIterator(list.size());

		/*
		 * while (lit.hasNext()) { System.out.print(lit.next() + " "); }
		 * 	System.out.println();
		 */

	
		//System.out.println(lit.hasNext() + " ");

		System.out.println(lit.hasPrevious() + " "); 
		/*
		 * It would return -1 because there is no value before 0 index.. we need to
		 * first traverse from 0 to last index then we can traverse back
		 */
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
			// System.out.println(lit.nextIndex());
			// System.out.print(lit.previousIndex() + " ");
		}
		System.out.println();
	}

	public static void addWithListIterator(List<Integer> list) {
		ListIterator<Integer> lit = list.listIterator();
		
		lit.next();
		lit.set(8000);// setting the value at 0 index as traversed to 0 index by using lit.next()
		 		
		lit.add(600); // we can add values to list through ListIterator		
		for(Integer i : list) {
			
			System.out.print(i + " ");
		}
			
	}

	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(40);
		list.add(60);

		listIterator(list);
		
		addWithListIterator(list);
	}

}
