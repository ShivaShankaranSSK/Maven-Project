package org.AdactinProject.Junit;

import java.time.Duration;
import java.time.LocalDateTime;

import org.JunitPractices.BaseClass;
import org.junit.Assert;
import org.junit.Test;

public class Test05_orderID extends BaseClass{
	
	@Test
	public void orderID_test05() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String attribute = Attribute(findElementID("order_no"), "value");
		System.out.println("Order No: "+attribute);
			
	}

}
