package baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	WebDriver driver;
	// 1. Browser Launch
	public void BrowserLaunch(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	// 2. findElement - ID
	// Input: String Id
	// Return: WebElement elementID
	public WebElement findElementID(String ID) {
		WebElement elementID = driver.findElement(By.id(ID));
		return elementID;
	}

	// 3. findElement - name
	// Input: String name
	// Return: WebElement elementID
	public WebElement findElementName(String name) {
		WebElement elementName = driver.findElement(By.name(name));
		return elementName;
	}

	// 4. findElement - Text
	// Input: String text
	// Return: WebElement textElement
	public WebElement findElementClass(String className) {
		WebElement elementText = driver.findElement(By.className(className));
		return elementText;
	}

	// 5. findElement - xPath
	// Input: String xPath
	// Return: WebElement elementID
	public WebElement findElementXpath(String xpath) {
		WebElement elementXpath = driver.findElement(By.xpath(xpath));
		return elementXpath;
	}


	// 6. Send Values (Send Keys)
	// Input: WebElement element , String keys
	// Return: no return
	public void sendValues(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 7. quit
	public void quitBrowser() {
		driver.quit();
	}

	// 8. Close
	public void closeBrowser() {
		driver.close();
	}

	/*            ACTIONS             */

	// Actions - MOVE TO ELEMENT
	// 9. Input: WebElement element
	//    Return: no return
	public void MoveToElement(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
	}

	// Actions - CONTEXT CLICK
	// 10. Input: WebElement element
	// Return: no return

	public void contextClickAction(WebElement element) {
		Actions builder = new Actions(driver);
		builder.contextClick().build().perform();
	}	

	// Actions - DOUBLE CLICK
	// 11. Input: WebElement element
	// Return: no return

	public void doubleClickAction(WebElement element) {
		Actions builder = new Actions(driver);
		builder.doubleClick().build().perform();
	}	

	// Actions - Drag and Drop
	// 12. Input: WebElement element
	// Return: no return
	public void dragAndDropAction(WebElement sourceElement, WebElement destElement) {
		Actions builder = new Actions(driver);
		builder.dragAndDrop(sourceElement, destElement).build().perform();
	}	

	/*      HANDLING INPUTS       */
	// 13. getAttribute
	public String Attribute(WebElement elementID, String attributeName) {
		String attribute = elementID.getAttribute(attributeName);
		return attribute; 

	}

	//14. getText 
	public String Text(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 15. clear
	public void clear(WebElement element) {
		element.clear();
	}

	// 16. Confirm the Field is enabled
	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	// 17. Confirm the Field is Displayed
	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// 17. Confirm the Field is Selected
	public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	/*         NAVIGATION               */

	// 18. Navigate To CurrentURL
	public String currentURL() {
		String currentUrl = driver.getCurrentUrl(); 
		return currentUrl;
	}

	// 19. Navigate To 
	public void navigateTo(String URL) {
		driver.navigate().to(URL);
	}

	// 20. Navigate To Back
	public void Back() {
		driver.navigate().back();
	}

	// 21. Navigate To Forward
	public void forward() {
		driver.navigate().forward();
	}

	// 22. refresh webPage
	public void refresh() {
		driver.navigate().refresh();
	}

	/*        ALERTS             */
	// 23. Simple Alert - 
	// Input: String element
	// Return: no return
	public void simpleAlert(WebElement element) {
		element.click();
		driver.switchTo().alert().accept();
	}

	// 24. Confirm Alert - 
	// Input: String element
	// Return: no return
	public void cnfAlertAccept(WebElement element) {
		element.click();
		driver.switchTo().alert().accept();	
	}

	// 25. Confirm Alert - 
	// Input: String element
	// Return: no return
	public void cnfAlertDismiss(WebElement element) {
		element.click();
		driver.switchTo().alert().dismiss();	
	}

	// 25. Prompt Alert - 
	// Input: String element
	// Return: no return
	public void promptAlert(WebElement element) {
		element.click();
		driver.switchTo().alert();
	}

	/*         ROBOT CLASS       */
	// 26. Robot Class Down
	public void RobotClassDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);   robot.keyRelease(KeyEvent.VK_DOWN);
	}

	// 27. Robot Class Up
	public void RobotClassUp() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);   robot.keyRelease(KeyEvent.VK_UP);
	}

	// 28. Robot Class Enter
	public void RobotClassEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);	robot.keyRelease(KeyEvent.VK_ENTER);
	}

	// 29. Robot Class BackSpace
	public void RobotClassBackSpace() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);	robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	/*         FRAMES             */
	// 30. index Based
	public void framesIndex(String element, int index) {
		WebElement source = driver.findElement(By.xpath(element));
		driver.switchTo().frame(index);
	}

	// 31. frames - id Based
	public void framesID(String element, String ID) {
		WebElement source = driver.findElement(By.id(element));
		driver.switchTo().frame(ID); 
	}

	// 32. frames - name Based
	public void framesName(String element, String name) {
		WebElement source = driver.findElement(By.id(element));
		driver.switchTo().frame(name);
	}

	/*          SELECT                    */
	// 33. select - index 
	public void selectByIndex(String element, int index) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown); 
		select.selectByIndex(index);
	}

	// 34. Select - by Value
	public void selectByValue(String element, String sendValue) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown); 
		select.selectByValue(sendValue);
	}

	// 35. Select - by VisibleText
	public void selectByVisibleText(String element, String visibleText) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown); 
		select.selectByValue(visibleText);
	}

	// 36. Select - MultiSelect
	public int allSelect(String element, int index) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown);
		select.selectByIndex(index);
		select.selectByIndex(index);
		select.selectByIndex(index);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		int size = allSelectedOptions.size();
		return size;
	}
	// 37. Select - isMultiple
	public boolean isMultipleSelect(String element) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown);	
		boolean multiple = select.isMultiple();
		return multiple;
	}
	// 38. Select - deselectByIndex
	public void deselect(String element, int index) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown);	
		select.deselectByIndex(index);
	}
	// 39. Select - deselectByIndex
	public void deselectAll(String element) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown);	
		select.deselectAll();
	}
	//40. get - getAllOptions
	public int getAllOptions(String element) {
		WebElement dropDown = driver.findElement(By.xpath(element));
		Select select = new Select(dropDown);
		List<WebElement> options = select.getOptions();

		int size = options.size();

		for (int i = 0; i < options.size(); i++) {
			WebElement each = options.get(i);
			System.out.println(each.getText());
		}
		return size; 
	}








}
