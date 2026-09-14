package com.qa.collection.linkedlist;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(100);
        list.display(); // Output: 100 -> 30 -> 20 -> 10 -> null
        
        list.addLast(300);
        list.display();
        
        list.add(200, 3);
        
        list.display();
        
        System.out.println("deleted first: " + list.deleteFirst());
        
        list.display();
        
        System.out.println("deleted last:" + list.deleteLast());
        list.display();
        
        System.out.println("Deleted index value: " + list.delete(2) );
        list.display();

    }
}
