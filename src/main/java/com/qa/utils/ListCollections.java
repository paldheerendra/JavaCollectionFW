/**
 * 
 */
package com.qa.utils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class ListCollections {

	static ArrayList<String> list;
	public static void getListTest() {
		
		list=new ArrayList<String>();//Creating arraylist    
	    list.add("Ravi"); //Adding object in arraylist    
	    list.add("Vijay");    
	    list.add("Ravi");    
	    list.add("Ajay");    
	    //Invoking arraylist object   
	    System.out.println(list);  
	}
	
	
	//iteration -- iterator()
	 public static void getThroughIterator() {
		 list.add("Dheerendra");
		 
		 Iterator<String> it=list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	 }
	 
	 public static void getThroughSize() {
		 System.out.println("-----------------"); 
		 list.add("Chirag");
		 
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 	
	 }
	 
	//foreach
	 
	 public static void getThroughForEach() {
		
		 System.out.println("--------getThroughForEach()---------"); 
			for(String str : list) {
				System.out.println(str);
			}
	 }
	
	 public static void getThroughLambdaExpression() {
		 
		 System.out.println("-----------------"); 
		 list.add("Virat");
		 list.forEach(item -> {
			 System.out.println(item);
		 });
		 		 
	 }
	
	
	public static void main(String[] args) {

		 getListTest();
		 
		 getThroughIterator();
		 
		 getThroughSize();
		 
		 getThroughLambdaExpression();

		 getThroughForEach();
	}

}
