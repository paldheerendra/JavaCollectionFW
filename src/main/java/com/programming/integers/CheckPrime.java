package com.programming.integers;

public class CheckPrime {

	public static void main(String[] args) {

		int num= 7;
        // Input positive infinity, Output positive infinity  
      // int num = (int) Math.sqrt(x);
        //System.out.println(num);
        int c =2;
        boolean flag = false;
        while (c <= num/2){
            if(num % c ==0){
                flag = true;
                break;
            }
            c = c+1;
        }
        if(flag)
         System.out.println("not prime");
        else
            System.out.println("prime");

	}

}
