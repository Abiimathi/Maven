package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class FtrUserRegPage extends GenericWrrappers{

	public FtrUserRegPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	
	public FtrUserRegPage enterUserId(String userid) {
		enterById("userId", userid);
		return this;
	}
	
	public FtrUserRegPage enterPwd(String pwd) {
		enterById("password", pwd);
		return this;
	}
	
	public FtrUserRegPage enterCnfPwd(String cnfpwd) {
		enterById("cnfPassword", cnfpwd);
		return this;
	}
	
	public FtrUserRegPage selectSecQues(String secque) {
		int secretques = Integer.parseInt(secque);
		selectIndexById("secQstn", secretques);
		return this;
	}
	
	public FtrUserRegPage enterSecretAns(String secans) {
		enterById("secAnswer", secans);
		return this;
	}
	
	public FtrUserRegPage clickDOB() {
		clickById("dateOfBirth");
		return this;
	}
	
	public FtrUserRegPage selectYear(String year) {
		selectVisibileTextByXpath("//select[@data-handler= 'selectYear']", year);
		return this;
	}
	
	public FtrUserRegPage selectMonth(String month) {
		int monthdob = Integer.parseInt(month);
		selectIndexByXpath("//select[@data-handler= 'selectMonth']", monthdob);
		return this;
	}
	
	public FtrUserRegPage selectDate(String date) {
		clickByXpath("//a[@class='ui-state-default' and text() = '"+date+"']");
		return this;
	}
	
	public FtrUserRegPage selectGender(String gender) {
		clickByXpath("//input[@value = '"+gender+"']");
		return this;
	}
	
	public FtrUserRegPage selectMaritalStatus(String status) {
		clickByXpath("//input[@value='"+status+"']");
		return this;
	}
	
	public FtrUserRegPage enterEmail(String email) {
		enterById("email", email);
		return this;
	}
	
	public FtrUserRegPage enterOccupation(int occu) {
		//selectValueById("occupation", occu);
		selectIndexById("occupation", occu);
		return this;
	}
	
	public FtrUserRegPage enterFirstName(String fname) {
		enterById("fname", fname);
		return this;
	}
	
	public FtrUserRegPage enterMiddleName(String mname) {
		enterById("mname", mname);
		return this;
	}
	
	public FtrUserRegPage enterLastName(String lname) {
		enterById("lname", lname);
		return this;
	}
	
	public FtrUserRegPage selectNationality(String nationality) {
		selectValueById("natinality", nationality);
		return this;
	}
	
	public FtrUserRegPage enterFlatNo(String flat) {
		enterById("flatNo",flat);
		return this;
	}
	
	public FtrUserRegPage enterStreet(String street) {
		enterById("street", street);
		return this;
	}
	
	public FtrUserRegPage enterArea(String area) {
		enterById("area", area);
		return this;
	}
	
	public FtrUserRegPage clickCountry() {
		clickById("country");
		return this;
	}
	
	public FtrUserRegPage selectCountry(String country) {
		selectValueById("country", country);
		return this;
	}
	
	public FtrUserRegPage enterMobile(String mobile) {
		enterById("mobile", mobile);
		return this;
	}
	
	public FtrUserRegPage enterPincode(String pin) {
		enterById("pincode", pin);
		return this;
	}
	
	public FtrUserRegPage pressTab() {
		enterById("pincode", Keys.TAB, "Tab");
		return this;
	}
	
	public FtrUserRegPage selectPostOff(String post) {
		selectValueById("postOffice", post);
		return this;
	}
	
	public FtrUserRegPage clickComAddSameResAdd() {
		clickById("sameAddresses1");
		return this;
	}
	
	public FtrUserRegPage enterOffFlat(String offflat) {
		enterById("flatNoOffice", offflat);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this;
	}
	
	public FtrUserRegPage enterOffStreet(String offstreet) {
		enterById("streetOffice", offstreet);
		return this;
	}
	
	public FtrUserRegPage enterOffArea(String offarea) {
		enterById("areaOffice", offarea);
		return this;
	}
	
	public FtrUserRegPage selectOffCountry(String offcountry) {
		selectValueById("countryOffice", offcountry);
		return this;
	}
	
	public FtrUserRegPage enterOffMobile(String offmobile) {
		enterById("mobileOffice", offmobile);
		return this;
	}
	
	public FtrUserRegPage enterOffPin(String offpin) {
		enterById("pincodeOffice", offpin);
		return this;
	}
	
	public FtrUserRegPage selectOffPost(String offpost) {
		selectValueById("postOfficeOffice", offpost);
		return this;
	}
	
}

