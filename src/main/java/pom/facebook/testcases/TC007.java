package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FaceBookHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify Facebook Signup for new user registration";
		author="Sravan";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC007";
	}
	
	@Test(dataProvider="myData")
	public void facebookSignUp(String firstName,String lastName,String emailId,String confirmEmailId,String password,String day,String month,String year,String gender) {
		new FaceBookHomePage()
		.clickOnCreateNewAccount()
		.enterFirstName(firstName)
		.enterSurName(lastName)
		.enterEmailId(emailId)
		.enterConfirmEmailId(confirmEmailId)
		.enterNewPassword(password)
		.selectDate(day)
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender(gender);
	}
}
