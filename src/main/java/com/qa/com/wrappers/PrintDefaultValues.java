/**
 * 
 */
package com.qa.com.wrappers;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class PrintDefaultValues {
	
	private Byte b;
	
	private int i;
	
	private long l;
	
	public Byte getByte() {
		return b ;
	}
	
	public int getInt() {
		return i ;
	}
	
	public long getLong() {
		return l ;
	}
	
	public static void main(String args[]) {
		
		PrintDefaultValues obj = new PrintDefaultValues();
		System.out.println(obj.getByte());
		
		System.out.println(obj.getInt());
		
		System.out.println(obj.getLong());
	}

}
