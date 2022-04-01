package pom.alert.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class HomePage extends GenericWrrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public HomePage switchHomewindow() {
		switchToLastWindow();
		return this;
	}
	
	public HomePage verifyText() {
		verifyTextByXpath("//*[@id=\"main\"]/div[1]/div/h1", "Learn to Code");
		return this;
	}
}
