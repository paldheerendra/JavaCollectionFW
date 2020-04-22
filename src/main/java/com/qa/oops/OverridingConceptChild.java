/**
 * 
 */
package com.qa.oops;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class OverridingConceptChild extends OverridingConcept1 {
		
	/*
	 * compile time error-- if we declare override method as static, private or
	 * final But we can redeclare private and static methods in childClass. The child class private and static methods would act separately, it would have nothing to do with parent class same methods.
	 * 
	 * We can't redeclare final method in child Class
	 * 
	 * we can't change return type for overriding method
	 */
	
	   //@Override   not possible
		public static void get() {
			System.out.println("Child class get()");		
		}
		
		@Override
		public void add() {			
			System.out.println("Child class add ()");			
		}

		@Override  
		public void multi() { // compile time error if we declare override method as static, private or final
			System.out.println("Child class multi()");
		}
		
		public static void main(String [] args) {
			get();
			OverridingConceptChild ch = new OverridingConceptChild();		
			
			ch.add();	
			ch.multi();
						
			OverridingConcept1 parent = new OverridingConceptChild();
			parent.add(); // it will call child class method
			//parent.get(); //also possible
			
			OverridingConcept1 objParent = new OverridingConcept1();
			objParent.add(); // it will call parent class method
		}
	
}
