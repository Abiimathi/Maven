package Selenium.ProjectImplementation;

import org.openqa.selenium.Keys;

public interface Wrappers {
	/**
	 * This method will launch the given browser and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Basha - LibertyTestingCenter
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @throws Exception 
	 * 
	 */
	public void invokeApp(String browser, String url);
	
	/**
	 * This method will clear the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 * @return 
	 * @throws Exception 
	 */
	
	public void clearById(String idValue);
	

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 * @return 
	 * @throws Exception 
	 */
	
	public void enterById(String idValue, String data);
	
	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 * @return 
	 * @throws Exception 
	 */
	public void enterById(String idValue, Keys key, String KeyName);
	
	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param xpath - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 * @return 
	 * @throws Exception 
	 */
	public void enterByXpath(String xpath, Keys key, String keyName);
	
	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 */
	public void enterByName(String nameValue, String data) ;	
	
	/**
	 * This method will enter the value to the text field using xpath attribute to locate
	 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Basha - LibertyTestingCenter
	 */
	public void enterByXpath(String xpathValue, String data);


	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTitle(String title);
	
	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTextById(String id, String text);
	
	/**
	 * This method will verify the given text with exact match
	 * @param xpath - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTextByXpath(String xpath, String text);
	
	/**
	 * This method will verify the given text with partial match
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTextContainsById(String id, String text);
	
	/**
	 * This method will verify the given text with partial match
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Basha - LibertyTestingCenter
	 */
	public void verifyTextContainsByXpath(String xpath, String text);


	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickById(String id) ;

	/**
	 * This method will click the element using ClassName as locator
	 * @param class  The class (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 * @throws Exception 
	 */
	public void clickByClassName(String classVal);
	
	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByName(String name) ;
	

	/**
	 * This method will click the element using link name as locator and do take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByLink(String name);
	
	/**
	 * This method will click the element using link name as locator and do not take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByLinkNoSnap(String name);

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByXpath(String xpathVal);
	
	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Basha - LibertyTestingCenter
	 */
	public void clickByXpathNoSnap(String xpathVal);
	
	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 * @author Basha - LibertyTestingCenter
	 */
	public String getTextById(String idVal);

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Basha - LibertyTestingCenter
	 */
	public String getTextByXpath(String xpathVal);

	/**
	 * This method will select the drop down  text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (text) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectVisibileTextById(String id, String value);
	
	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectIndexById(String id, int value);
	
	/**
	 * This method will select the drop down using value as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectValueById(String id, String value);
	
	/**
	 * This method will select the drop down  text using xpat as locator
	 * @param xpath The xpath (locator) of the drop down element
	 * @param value The value to be selected (text) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectVisibileTextByXpath(String xpath, String value);
	
	/**
	 * This method will select the drop down using index as xpath locator
	 * @param xpath The xpath (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectIndexByXpath(String xpath, int value);
	
	/**
	 * This method will select the drop down using value as xpath locator
	 * @param xpath The xpath (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectValueByXpath(String xpath, String value);
	
	/**
	 * This method will select the drop down using index as name locator
	 * @param name The name (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectIndexByName(String name, int value);
	
	/**
	 * This method will select the drop down  text using name as locator
	 * @param name The name (locator) of the drop down element
	 * @param value The value to be selected (text) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectVisibileTextByName(String name, String value);
	
	/**
	 * This method will select the drop down using value as name locator
	 * @param name The name (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 * @author Basha - LibertyTestingCenter
	 */
	public void selectValueByName(String name, String value);
	
	/**
	 * This method will hover the mouse pointer by xpath
	 * @author Basha - LibertyTestingCenter
	 */
	public void mouseHoverByXpath( String xpath);
	
	/**
	 * This method will switch to the parent Window
	 * @author Basha - LibertyTestingCenter
	 */
	public void switchToParentWindow();
	
	/**
	 * This method will move the control to the last window
	 * @author Basha - LibertyTestingCenter
	 */
	public void switchToLastWindow();
	
	/**
	 * This method will switch the frame by xapth
	 * @author Basha - LibertyTestingCenter
	 */
	public void switchFrameByxpath(String xpath);
	
	/**
	 * This method will switch the frame by index
	 * @author Basha - LibertyTestingCenter
	 */
	public void switchFrameByIndex(int value);
	
	/**
	 * This method will switch the frame by id
	 * @author Basha - LibertyTestingCenter
	 */
	public void switchFrameById(String id);
	
	/**
	 * This method will switch to the parent frame
	 * @author Basha - LibertyTestingCenter
	 */
	public void switchMainFrame();
	
	/**
	 * This method will accept the alert opened
	 * @author Basha - LibertyTestingCenter
	 */
	public void acceptAlert();
	
	/**
	 * This method will dismiss the alert opened
	 * @author Basha - LibertyTestingCenter
	 */
	public void dismissAlert();
	
	/**
	 * This method will return the text of the alert
	 * @author Basha - LibertyTestingCenter
	 */
	public String getAlertText();
	
	/**
	 * This method will enter the text in the alert
	 * @author Basha - LibertyTestingCenter
	 */
	public void enterTextInAlert(String text);
		
	/**
	 * This method will close the active window
	 * @author Basha - LibertyTestingCenter
	 */
	public void closeBrowser();
	
	/**
	 * This method will close all the browsers
	 * @author Basha - LibertyTestingCenter
	 */
	public void closeAllBrowsers();
	
	/**
	 * This method will wait for the time provided
	 * @author Basha - LibertyTestingCenter
	 */
	public void waittime(long time);
	
	/**
	 * This method will refresh the window
	 * @author Basha - LibertyTestingCenter
	 */
	public void refreshWindow();
 

}
