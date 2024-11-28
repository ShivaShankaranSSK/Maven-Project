package org.AdactinProject.Junit;

import org.JunitPractices.BaseClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({launchAdactin.class, 
	Test01_Login.class,
	Test02_searchHotel.class,
	Test03_selectHotel.class, 
	Test04_fillDetails.class,
	Test05_orderID.class,
	testEnd.class})
public class TestRunner extends BaseClass{

	

}
