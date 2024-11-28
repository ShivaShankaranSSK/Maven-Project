package org.JunitPractices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test3 {
	
	@Before
	public void empname1() {
		System.out.println("NO @Before");
	}
	
	@BeforeClass
	public static void empname2() {
		System.out.println("NO @BeforeClass");
	}

	@After
	public void empname3() {
		System.out.println("NO @After");
	}
	
	@AfterClass
	public static void empname4() {
		System.out.println("NO @AfterClass");
	}
	
	@Test
	public void empname5() {
		System.out.println("NO @Test");
	}

}
