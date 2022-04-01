package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class AccommodationPage extends GenericWrrappers{

	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public AccommodationPage switchtoAccWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AccommodationPage clickSidebar() {
		clickById("sidebarCollapse");
		return this;
	}
	
	public BookCoachPage clickBookCoach() {
		clickByLink("Book Your Coach/Train");
		return new BookCoachPage(driver, test);
	}
	
	public CharterPage clickCharter() {
		clickByLink("Charter");
		return new CharterPage(driver, test);
	}
	
	public HotelsPage clickHotels() {
		clickByLink("Hotels");
		return new HotelsPage(driver, test);
	}


}
