package org.JunitPractices;

import static org.testng.Assert.assertEquals;
import org.jspecify.annotations.Nullable;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class assertion extends org.JunitPractices.BaseClass {
	
	@Test
	public void test1() {
		
		BrowserLaunch("https://facebook.com/");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("Shiva@11");
		
		@Nullable
		String attribute = mail.getAttribute("email");
		System.out.println("Actual is: "+attribute);
		
		Assert.assertEquals(attribute, "Shiva@119");
		
		System.out.println("completed");
		
		
		
	}
	
	

}
