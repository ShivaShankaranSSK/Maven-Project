package org.AdactinProject.Junit;

import org.JunitPractices.BaseClass;
import org.junit.Test;

public class Test01_Login extends BaseClass{
	
	@Test
	public void Login() {
		sendValues(findElementID("username"), "shivashan1919");
		sendValues(findElementID("password"), "Shiva119");
		findElementID("login").click();
	}


}
