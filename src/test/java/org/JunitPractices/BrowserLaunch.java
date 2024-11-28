package org.JunitPractices;

import org.junit.Test;

public class BrowserLaunch extends BaseClass {

	@Test
	public void launch_tc_01() {

		BrowserLaunch("https://www.facebook.com/login.php/");

	}

}

