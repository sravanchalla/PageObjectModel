package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookSignUpPage extends GenericWrappers {

	public FaceBookSignUpPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public FaceBookSignUpPage enterSurName(String surName) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.SurName.Xpath"), surName);
		return this;
	}
	
	public FaceBookSignUpPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public FaceBookSignUpPage enterConfirmEmailId(String emailId) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.ConfirmEmailId.Xpath"), emailId);
		return this;
	}
	
	public FaceBookSignUpPage enterNewPassword(String password) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.NewPassword.Xpath"), password);
		return this;
	}
	
	public FaceBookSignUpPage selectDate(String date) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.Date.Xpath"), date);
		return this;
	}
	
	public FaceBookSignUpPage selectMonth(String month) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.Month.Xpath"), month);
		return this;
	}
	
	public FaceBookSignUpPage selectYear(String year) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.Year.Xpath"), year);
		return this;
	}
	
	public FaceBookSignUpPage clickOnGender(String gender) {
		clickByXpath(prop.getProperty("FaceBookSignUpPage.Gender.Xpath"),gender);
		return this;
	}
}
