package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Selenium.ProjectImplementation.GenericWrrappers;

public class Registration extends GenericWrrappers{
	
		public Registration(RemoteWebDriver driver, ExtentTest test) {
			this.driver = driver;
			this.test = test;
		}

		public Registration enterUserName(String uname) {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			enterById("userName",uname);
			return this;
		}
		
		public Registration enterPswd(String pwd) {
			enterById("usrPwd",pwd);
			return this;
		}
		
		public Registration enterCnfpwd(String cnfPwd) {
			enterById("cnfUsrPwd",cnfPwd);
			return this;
		}	
		
		public Registration clickPreferredLanguage() {
			clickByXpath("//span[text()= 'Preferred Language']");
			return this;
		}
		
		public Registration selectPrefferedLanguage() {
			clickByXpath("//li[@aria-label = 'English']");
			return this;
		}	
		
		public Registration clickSequrityQuestion() {
			clickByXpath("//span[text()= 'Security Question']");
			return this;
		}
		
		public Registration selectSecurityQuestion(String secquest) {
			clickByXpath("//span[text()= '"+secquest+"']");
			return this;
		}
		
		public Registration enterSecurityAnswer(String secans) {
			enterByXpath("//input[@formcontrolname= 'secAns']", secans);
			return this;
		}
		
		public Registration clickContinue() {
			clickByXpath("//button[@label= 'Continue']");
			return this;
		}
		
		public Registration enterFirstName(String fname) {
			enterById("firstName", fname);	
			return this;
		}
		
		public Registration enterMiddleName	(String mname) {
			enterById("middleName", mname);
			return this;
		}
		
		public Registration enterLastName(String lname) {
			enterById("lastname", lname);
			return this;
		}
		
		public Registration selectGender(String gender) {
			clickByXpath("//div[@aria-label= '"+gender+"']");
			return this;
		}
		
		public Registration clickDOB() {
			clickByXpath("//input[@placeholder= 'Date Of Birth']");
			return this;
		}
		
		public Registration selectYear(String year) {
			selectVisibileTextByXpath("//select[starts-with(@class,'ui-datepicker-year')]", year);
			return this;
		}
		
		public Registration selectMonth(String month) {
			int dmonth= Integer.parseInt(month);
			selectIndexByXpath("//select[starts-with(@class,'ui-datepicker-month')]", dmonth);
			return this;
		}	
		
		public Registration selectDate(String date) {
			clickByXpath("//a[text()= '"+date+"']");
			return this;
		}
		
		public Registration clickOccupation() {
			clickByXpath("//span[text()= 'Select Occupation']");
			return this;
		}
		
		public Registration selectOccupation(String occupation) {
			clickByXpath("//li[@aria-label= '"+occupation+"']");
			return this;
		}
		
		public Registration selctMaritalStatus(String marstatus) {
			clickByXpath("//*[@id= '"+marstatus+"']");
			return this;
		}
		
		public Registration selectCountry(String country) {
			selectVisibileTextByXpath("//select[@formcontrolname= 'resCountry']", country);
			return this;
		}
		
		public Registration enterEmail(String email) {
			enterById("email",email);
			return this;
		}
		
		public Registration enterMobile(String phone) {
			enterById("mobile",phone);
			return this;
		}	
		
		public Registration selectNationality(String nationality) {
			selectVisibileTextByXpath("//select [@formcontrolname= 'nationality']", nationality);
			return this;
		}
		
		public Registration clickContinue2() {
			clickByXpath("//button [@label = 'Continue']");
			return this;
		}
		
		public Registration enterResAdd1(String resadd1) {
			enterById("resAddress1", resadd1);
			return this;
		}
		
		public Registration enterResAdd2(String resadd2) {
			enterById("resAddress2", resadd2);
			return this;
		}
		
		public Registration enterResAdd3(String resadd3) {
			enterById("resAddress3", resadd3);
			return this;
		}
		
		public Registration enterResPin(String respin) {
			enterByName("resPinCode", respin);
			return this;
		}
		
		public Registration enterResState(String resstate) {
			enterById("resState", resstate);
			return this;
		}	
		
		public Registration clickcity() {
			clickByXpath("//select[@formcontrolname= 'resCity']");
			return this;
		}
		
		public Registration selectCity(int rescity) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//int rc = Integer.parseInt(rescity);
			selectIndexByXpath("//select[@formcontrolname= 'resCity']", rescity);
			return this;
		}
		
		public Registration selectPost(int respost) {
			//int rp = Integer.parseInt(respost);
			selectIndexByXpath("//select[@formcontrolname= 'resPostOff']", respost);
			return this;
		}
		
		public Registration enterResPhone(String resphone) {
			enterById("resPhone", resphone);
			return this;
		}
		
		public Registration clickCopyResToOffAdd() {
			clickByXpath("//label[text()= 'No']");
			return this;
		}
		
		public Registration enteroffAdd1(String offadd1) {
			enterById("offAddress1",offadd1);
			return this;
		}
		
		public Registration enteroffAdd2(String offadd2) {
			enterById("offAddress2",offadd2);
			return this;
		}
		
		public Registration enteroffAdd3(String offadd3) {
			enterById("offAddress3",offadd3);
			return this;
		}	
		
		public Registration clickOnOffCountry() {
			clickByXpath("//*[@formcontrolname= 'offCountry']");
			return this;
		}
		
		public Registration selectOffCountry(String offcountry) {
			clickByXpath("//li[@aria-label= '"+offcountry+"']");
			return this;
		}
		
		public Registration enterOffPin(String offpin) {
			enterByName("offPinCode", offpin);
			return this;
		}	
		
		public Registration enterOffState(String offstate) {
			enterById("offState", offstate);
			return this;
		}
		
		public Registration enteroffCity(String offcity) {
			enterById("offCity", offcity);
			return this;
		}	
		
		public Registration enterOffPost(String offpost) {
			enterById("offPostOff", offpost);
			return this;
		}
		
		public Registration enterOffPhone(String offphone) {
			enterById("offPhone", offphone);
			return this;
		}	
		
	
}



