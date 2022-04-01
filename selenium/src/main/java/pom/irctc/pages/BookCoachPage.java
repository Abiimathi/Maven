package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class BookCoachPage extends GenericWrrappers{

	public BookCoachPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public BookCoachPage switchtoBookCoachWindow() {
		switchToLastWindow();
		return this;
	}
	
	public FtrUserRegPage clickSignup() {
		clickByLink("New User? Signup");
		return new FtrUserRegPage(driver, test);
	}
	
}
