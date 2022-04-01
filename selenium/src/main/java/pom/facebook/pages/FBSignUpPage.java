package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class FBSignUpPage extends GenericWrrappers{
	
	public FBSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public FBSignUpPage enterFirstName(String fname) {
		enterByName("firstname", fname);
		return this;
	}
	
	public FBSignUpPage enterSurName(String lname) {
		enterByName("lastname", lname);
		return this;
	}
	
	public FBSignUpPage enterEmail(String email) {
		enterByName("reg_email__", email);
		return this;
	}
	
	public FBSignUpPage enterCnfEmail(String confemail) {
		enterByName("reg_email_confirmation__", confemail);
		return this;
	}
	
	public FBSignUpPage enterPwd(String pwd) {
		enterByName("reg_passwd__", pwd);
		return this;
	}
	
	public FBSignUpPage selectDOBDate(String daydob) { 	
		selectValueById("day", daydob);
		return this;
	}
	
	public FBSignUpPage selectDOBMonth(String month) {
		selectValueById("month", month);
		return this;
	}	
	
	public FBSignUpPage selectDOBYear(String year) {
		selectVisibileTextById("year", year);
		return this;
	}	
	
	public FBSignUpPage selectSex(String gender) {
		int sex = Integer.parseInt(gender);
		clickByXpath("//*[@name='sex' and @value = '"+sex+"' ]");
		return this;
	}
	
}
	
