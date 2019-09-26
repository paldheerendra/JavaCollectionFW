/**
 * 
 */
package com.qa.utils;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class StaticClass {

	private static int jerseyNum;

	public static void getPlayerDetails(int id, String name, String... skill) {

		jerseyNum = id;
		System.out.println(name +"'s " + "Jersey number " + " is: " + jerseyNum);
		if(skill.length >0) {
			System.out.print(" And " + name +" has skills- ");
			for(String s: skill) {
				System.out.print(s + ": ");				
			}
			System.out.println();
		}
	}

}
