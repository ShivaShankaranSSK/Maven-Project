package org.JunitPractices;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginCredentials extends BaseClass{
	
	@Test
	public void credentials_tc_02() {

		findElementID("email").sendKeys("Shiva1919");
		findElementID("pass").sendKeys("Shiva@1919");
	}

}
