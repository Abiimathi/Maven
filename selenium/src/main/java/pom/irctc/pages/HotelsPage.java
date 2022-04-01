package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class HotelsPage extends GenericWrrappers{

	public HotelsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public HotelsPage switchtoHotelWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelsPage clickLogin() {
		WebElement wb = driver.findElementByLinkText("Login");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
		clickByLink("Login");
		return this;
	}
	
	public HotelsPage clickGuesUserLogin() {
		clickById("profile-tab");
		return this;
	}
	
	public HotelsPage enterEmail(String email) {
		enterByName("email", email);
		return this;
	}
	
	public HotelsPage enterMobileNo(String mobile) {
		enterByName("mobileNo", mobile);
		return this;
	}
	
	public HotelsPage clickGuestLogin() {
		clickByXpath("(//button[@type='submit' and text() ='Login'])[2]");
		return this;
	}
	
	public HotelsPage enterAndSelectCity(String dest) {
		enterById("filterText", dest);
		WebElement wb = driver.findElementByXPath("(//span[text() = '"+dest+"'])[1]");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
		//waittime(2000);
		//clickByXpath("(//span[text() = '"+dest+"'])[1]");
		clickByXpath("//div[@class='left_city']");
		return this;
	}
	
	public HotelsPage clickChekInDate() {
		clickByName("dt12");
		return this;
	}
	
	public HotelsPage selectChekInDate() {
		clickByXpath("//button[@aria-label= 'Next month']");
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[2]/span");
		return this;
	}
	
	public HotelsPage clickChekOutDate() {
		WebElement element = driver.findElementByName("dt13");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		clickByName("dt13");
		return this;
	}
	
	public HotelsPage selectChekOutDate() {
		clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[5]/span");
		return this;
	}
	
	public HotelsPage clickGuest() {
		clickByName("guest");
		return this;
	}
	
	public HotelsPage selectRoom(String room) {
		int rooms = Integer.parseInt(room);
		selectIndexByName("hotelRoom", rooms);
		return this;
	}
	
	public HotelsPage selectAdult(String adult) {
		int adults = Integer.parseInt(adult);
		selectIndexByName("hotelAdult", adults);
		return this;
	}
	
	public HotelsPage clickDone() {
		clickByXpath("//button[@type = 'button' and text() = 'Done']");
		return this;
	}
	
	public HotelsListPage clickFindHotel() {
		clickByXpath("//button[@type = 'button' and text() = 'Find Hotel ']");
		return new HotelsListPage(driver, test);
	}
	
	
}
