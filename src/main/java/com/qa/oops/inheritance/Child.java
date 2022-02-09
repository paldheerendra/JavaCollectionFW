package com.qa.oops.inheritance;

import java.io.IOException;

public class Child extends Parent {

	int value = 100;
	public static void display() {
		System.out.println("Display:Child");
	}

	public void print() {
		System.out.println("print:child");
	}
	
	public void printValue() {
		System.out.println("Value: " + value);
	}

	public static void main(String args[]) {
		
		Child obj1 = new Child();
		Parent obj2 = new Child();
		//Parent obj3 = new Parent();
		obj1.display();
		obj1.print();
		
		obj2.display();
		obj2.print();
		
		System.out.println(obj1.value);
		System.out.println(obj2.value);
		
		obj1.printValue();
		obj2.printValue();
		
		//obj3.printValue();
	}

}
