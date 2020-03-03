/**
 * 
 */
package com.qa.random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Dheerendra Pal (expleo)
 *
 */
public class TestNGAnnotationSequence {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void test() {
		System.out.println("@Test");
	}
	
	@AfterSuite
	public void bAftereSuite() {
		System.out.println("@AftereSuite");
	}
	
	@AfterTest
	public void AftereTest() {
		System.out.println("@AftereTest");
	}
	
	@AfterClass
	public void AftereClass() {
		System.out.println("@AftereClass");
	}
	
	@AfterMethod
	public void AftereMethod() {
		System.out.println("@AftereMethod");
	}

}
