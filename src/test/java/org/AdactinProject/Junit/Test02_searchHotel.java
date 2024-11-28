package org.AdactinProject.Junit;

import org.JunitPractices.BaseClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Test02_searchHotel extends BaseClass{
	
	@Test
	public void searchHotel() throws InterruptedException {

		selectByIndex("location", 2);
		selectByIndex("hotels", 2);
		selectByIndex("room_type", 4);
		selectByIndex("room_nos", 2);

		WebElement DateIn = findElementID("datepick_in"); 
		DateIn.clear();
		sendValues(DateIn, "29/11/2024");

		Thread.sleep(2000);

		WebElement DateOut = findElementID("datepick_out"); 
		DateOut.clear();
		sendValues(DateOut, "30/11/2024");

		selectByIndex("adult_room", 2);
		findElementName("Submit").click();

	}

}
