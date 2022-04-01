package pom.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class CharterPage extends GenericWrrappers{

	public CharterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public CharterPage switchtoCharterWindow() {
		switchToLastWindow();
		return this;
	}
	
	public CharterPage clickEnqForm() {
		clickByLink("Enquiry Form");
		return this;
	}
	
	public CharterPage minimizeSidBar() {
		clickById("dismiss");
		return this;
	}
	
	public CharterPage enterName(String name) {
		enterByName("name", name);
		return this;
	}
	
	public CharterPage enterOrg(String org) {
		enterByName("organization", org);
		return this;
	}
	
	public CharterPage enterAddress(String add) {
		enterByName("address", add);
		return this;
	}
	
	public CharterPage enterMobile(String mobile) {
		enterByName("mobile", mobile);
		return this;
	}
	
	public CharterPage enterEmail(String email) {
		enterByName("email", email);
		return this;
	}
	
	public CharterPage reqFor(String request) {
		int req = Integer.parseInt(request);
		selectIndexByName("requestFor", req);
		return this;
	}
	
	public CharterPage orginStation(String orgstate) {
		enterByName("originStation", orgstate);
		return this;
	}
	
	public CharterPage destination(String deststate) {
		enterByName("destnStation", deststate);
		return this;
	}
	
	public CharterPage clickDateOfDep() {
		clickByName("checkInDate");
		return this;
	}
	
	public CharterPage clickNextDepMonth() {
		clickByXpath("//*[starts-with(@class,'fa fa-angle-right')]");;
		return this;
	}
	
	public CharterPage selectDepDate(String date) {
		clickByXpath("//span[@class= 'act' and text()='"+date+"']");
		return this;
	}
	
	public CharterPage clickDateOfArr() {
		clickByName("checkOutDate");
		return this;
	}
	
	public CharterPage clickNextArrMonth() {
		clickByXpath("(//*[starts-with(@class,'fa fa-angle-right')])[2]");;
		return this;
	}
	
	public CharterPage selectArrDate(String date) {
		clickByXpath("(//span[@class= 'act' and text()='"+date+"'])[2]");
		return this;
	}
	
	public CharterPage enterDuration(String days) {
		enterByName("durationPeriod", days);
		return this;
	}
	
	public CharterPage enterCoachDetais(String coach) {
		enterByName("coachDetails", coach);
		return this;
	}
	
	public CharterPage enterNoOfPass(String passno) {
		enterByName("numPassenger", passno);
		return this;
	}
	
	public CharterPage enterCharter(String charter) {
		enterByName("charterPurpose", charter);
		return this;
	}
	
	public CharterPage enterService(String service) {
		enterByName("services", service);
		return this;
	}
	
	public CharterPage clickSubmit() {
		clickByXpath("//button[@type = 'Submit']");
		return this;
	}
	
	public CharterPage verifyMobileNoError(String text) {
		verifyTextByXpath("//input[@name= 'mobile']//following-sibling::span", text);
		return this;
	}
	

}
