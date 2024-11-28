package org.JunitPractices;

import java.time.LocalDateTime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class launch extends BaseClass
{

	@BeforeClass
	public static void test1() {
		// BrowserLaunch("https://facebook.com/");
		System.out.println("This is from @BeforeClass");
	}

	@AfterClass
	public static void test2() {
		System.out.println("Successfully Logged in..!!");
		System.out.println("This is from @AfterClass");
	}

	@Before
	public void test3() {
		
		LocalDateTime startTime = LocalDateTime.now();
		
		// long StartTime = System.currentTimeMillis();
		System.out.println("Start Time: "+startTime);
		System.out.println("This is from @Before");
	}

	@After
	public void test4() {
		long endTime = System.currentTimeMillis();
		System.out.println("End Time: "+endTime);
		System.out.println("This is from @After");
	}
	
	@Test
	public void test5() {
		WebElement elementID = findElementID("email");
		sendValues(elementID, "shiva@gmail.com");
		sendValues(findElementID("pass"), "Shiva@119");
		System.out.println("This is from @Test");
		System.out.println("Successfully Entered username & password.");
	}

}
