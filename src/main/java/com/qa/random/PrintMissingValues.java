/**
 * 
 */
package com.qa.random;

import org.testng.annotations.Test;

/**
 * @author Dheerendra Pal (expleo)
 *
 *
 *2,7,10 print the values which are missing between these elements? but not input value(2,7,10)
 */
public class PrintMissingValues {

	private int first_value = 2;
	private int last_value = 10;
	@Test
	public void missingValues() {
		
		for(int i = first_value ; i < last_value ; i++) {
			if(i == first_value || i == 7 || i == last_value)
				continue;
			else
				System.out.print(i + " ");
		}
	}
}
