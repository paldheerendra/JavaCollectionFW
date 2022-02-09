package com.qa.string;

public class CheckCount {
	
	public static void main(String args[]) {
		
		  String str ="Aa BbBcc"; 
		  
		   String []a=str.replace(" ","").split("");
		  
		  int count=0; for(int i=0;i<a.length;i++) { for(int j=i+1;j<a.length;j++) {
		  if(a[i]==a[j]) { count++; }
		  
		  } System.out.println(a[i]+""+count); }
		 
		for(int i = 1; i <5 ; i++) {
			for(int j = 1; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
