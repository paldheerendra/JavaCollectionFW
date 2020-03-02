/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class TestTest {

	public static void fizz(int n){
		if(n % 3 == 0 && n% 5 ==0) {
				
			System.out.println("FizzBuzz");
	}
	else if(n%3==0 && n%5!=0 ){
        System.out.println("Fizz");
    }
    else if(n%3!=0 && n%5==0 ){
        System.out.println("Buzz");
    }
     else if(n%3!=0 && n%5!=0 ){
        System.out.println(n);
    }
	}
		public static void main(String[] args) {
		
		fizz(8);
	}

	
}
