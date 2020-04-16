/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class OverridingConceptChild extends OverridingConcept1 {
		
	   //@Override   not possible
		public static void get() {
			System.out.println("Child class get()");		
		}
		
		@Override
		public void add() {			
			System.out.println("Child class add ()");
		}

		@Override  
		public void multi() { // compile time error if we declare override method as static
			System.out.println("Child class multi()");
		}
		
		public static void main(String [] args) {
			get();
			OverridingConceptChild ch = new OverridingConceptChild();		
			
			ch.add();			
			
			OverridingConcept1 parent = new OverridingConceptChild();
			parent.add(); // it will call child class method
			//parent.get(); //also possible
			
			OverridingConcept1 objParent = new OverridingConcept1();
			objParent.add(); // it will call parent class method
		}
	
}
