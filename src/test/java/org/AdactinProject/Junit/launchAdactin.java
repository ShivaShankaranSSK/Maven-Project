package org.AdactinProject.Junit;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDateTime;
import org.JunitPractices.BaseClass;
import org.JunitPractices.test1;
import org.jspecify.annotations.Nullable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class launchAdactin extends baseclass.BaseClass {

	@BeforeClass
	public static void AdactinLaunch() {
		
		
		// BrowserLaunch("https://adactinhotelapp.com/");
		System.out.println("Browser Launched Successffully");
	}

	@Before
	public void StartTime() {
		LocalDateTime StartDateAndTime = LocalDateTime.now();
		System.out.println("Start time is: "+StartDateAndTime);
	}
	
	@Test 
	public void test1() {
		System.out.println("Browser Launched..!!");
	}
	
	

}


