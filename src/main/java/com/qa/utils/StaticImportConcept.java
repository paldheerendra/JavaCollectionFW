
package com.qa.utils;
import static com.qa.utils.StaticClass.*;

/**
 * @author Dheerendra Pal (expleo)
 * *Used to Check the static import functionality
 * And check the optional argument
 *
 */
public class StaticImportConcept {




	public static void main(String[] args) {	
		
		getPlayerDetails(45, "Rohit");
		
		getPlayerDetails(10, "Sachin");
		
		getPlayerDetails(7, "Dhoni" , "Batsman" , "Skipper");
		
		getPlayerDetails(18, "Virat" , "BatsMan");
	}

}
