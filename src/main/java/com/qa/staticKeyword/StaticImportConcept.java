
package com.qa.staticKeyword;
import static com.qa.utils.StaticClass.getPlayerDetails;

/**
 * @author Dheerendra Pal (expleo)
 * *Used to Check the static import functionality(we can access static method and variable directly using static import)
 * And check the optional argument
 * 
 * //non static methods will not be accessible through static import
 *
 */
public class StaticImportConcept{




	public static void main(String[] args) {			
		
		getPlayerDetails(45, "Rohit");
		
		getPlayerDetails(10, "Sachin");
		
		getPlayerDetails(7, "Dhoni" , "Batsman" , "Skipper");
		
		getPlayerDetails(18, "Virat" , "BatsMan");
	
		
	
		
		
	}

}
