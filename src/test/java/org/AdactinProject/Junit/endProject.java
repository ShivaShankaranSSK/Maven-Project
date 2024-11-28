package org.AdactinProject.Junit;

import java.time.LocalDateTime;

import org.JunitPractices.BaseClass;
import org.junit.Test;

public class endProject extends BaseClass{
	
	@Test
	public void quit() {
		LocalDateTime endTime = LocalDateTime.now();
		System.out.println("End Time is: "+endTime);

		quitBrowser();
	}
}
