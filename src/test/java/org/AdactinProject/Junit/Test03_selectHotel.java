package org.AdactinProject.Junit;

import org.JunitPractices.BaseClass;
import org.junit.Test;

public class Test03_selectHotel extends BaseClass{
	
	@Test
	public void selectHotel() throws InterruptedException {
		findElementID("radiobutton_0").click();
		Thread.sleep(2000);
		findElementID("continue").click();

	}
	

}
