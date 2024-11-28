package org.AdactinProject.Junit;

import org.JunitPractices.BaseClass;
import org.junit.Test;

public class Test04_fillDetails extends BaseClass{
	
	@Test
	public void fillDetails_test04() {

		sendValues(findElementName("first_name"), "Shiva");
		sendValues(findElementName("last_name"), "Shankaran");
		sendValues(findElementName("address"), "Madhavaram, Chennai");
		sendValues(findElementID("cc_num"), "4548-5585-5869-5648");

		selectByValue("cc_type", "VISA");

	//	selectByValue(findElementID("cc_exp_month"), "March");
		selectByIndex("cc_exp_year", 18);
		sendValues(findElementID("cc_cvv"), "123");
		findElementClass("reg_button").click();

	}

}
