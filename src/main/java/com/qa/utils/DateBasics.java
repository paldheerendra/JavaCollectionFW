/**
 * 
 */
package com.qa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class DateBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Date current=new Date();
		System.out.println(current);
		System.out.println(current.getDay());
		
		SimpleDateFormat sDF=new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		System.out.println(sDF.format(current));
		
		

		long prevDay = System.currentTimeMillis() - 1000*60*60*24 ;
		Date prev = new Date(prevDay);
		System.out.println(prev);
		
		if(prev.before(current)) {
			System.out.println("The date is older than current day");
        } else {
            System.out.println("The date is future day");
        }
	}

}
