/**
 * 
 */
package com.qa.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class SortingUsingCollections {

	public static void sortListNumbers(List<Integer> list) {

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
			
		}

	}

	public static void sortListString(List<String> list) {

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" }) // warning-- not giving any specific type List
	public static void sortListAny(List list) { // "rawtypes" warning

		Collections.sort(list); // "unchecked" warning

		/*
		 * for(int i=0; i<list.size();i++) {
		 * 
		 * System.out.println(list.get(i)); }
		 */
		for (Object ls : list) {
			System.out.println(ls);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sortReverseListAny(List list) {

		// Collections.sort(list,Collections.reverseOrder());
		Collections.reverse(list);
		System.out.println("------------Reverse Order---------------");
		for (Object ls : list) {
			System.out.println(ls);
		}
	}

	public static void sortAnyClassValues(List<UserData> users) {
		Collections.sort(users);
		System.out.println(("Player" + " :   " + "E-mail" + ":    " + "Mobile").toUpperCase());
		for (UserData user : users) {
			System.out.println(user.getName() + ": " + user.getEmail() + ": " + user.getMobile());
		}

	}

	public static void sortAnySetConvertingToLIst() {
		HashSet<String> set = new HashSet<String>();

		// Adding elements into HashSet using add()
		set.add("geeks");
		set.add("practice");
		set.add("contribute");
		set.add("ide");

		System.out.println("Original HashSet: " + set);

		// Sorting HashSet using List
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);
	}

	public static void sortAnySetUsingTreeSet() {
		HashSet<String> set = new HashSet<String>();

		// Adding elements into HashSet using add()
		set.add("Kohli");
		set.add("Sharma");
		set.add("Pandya");
		set.add("Jadeja");

		System.out.println("Original HashSet: " + set);

		// Sorting HashSet using TreeSet
		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println( "Sorted Set is: "+ treeSet);
		
		System.out.println("Sorted Set Values are:");
		for(String set1: treeSet) {
			System.out.println(set1);
			
		}
		
	}

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(100);
		alist.add(300);
		alist.add(500);
		alist.add(50);
		alist.add(400);
		alist.add(350);
		// sortListNumbers(alist);
		sortListAny(alist);

		sortReverseListAny(alist);

		System.out.println("---------------------------");
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("Dheerendra");
		sList.add("Datta");
		sList.add("Chirag");
		sList.add("Gaurav");
		sList.add("Abhi");
		sList.add("350");

		System.out.println(sList);
		// sortListString(sList);
		sortListAny(sList);
		
		sortReverseListAny(sList);

		System.out.println("---------------------------");
		UserData user1 = new UserData("Veeru", "veeru@google.com", "0987564313");
		UserData user2 = new UserData("Saurav", "saurav@google.com", "0964213875");
		UserData user3 = new UserData("Sachin", "sachin@google.com", "0756421398");
		UserData user4 = new UserData("Virat", "virat@google.com", "0987564213");
		UserData user5 = new UserData("Dhoni", "dhoni@google.com", "0991398642");

		ArrayList<UserData> emp = new ArrayList<UserData>();
		emp.add(user1);
		emp.add(user2);
		emp.add(user3);
		emp.add(user4);
		emp.add(user5);
		emp.add(new UserData("Rohit", "rohit@google.com", "09867523458"));

		sortAnyClassValues(emp);

		System.out.println("-----------Sorting Set by converting to List----------------");
		sortAnySetConvertingToLIst();

		System.out.println("-----------Sorting Set by converting to TreeSet----------------");

		sortAnySetUsingTreeSet();

	}

}
