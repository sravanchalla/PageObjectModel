package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IRCTCRegistrationPage extends GenericWrappers{
   
	public IRCTCRegistrationPage enterUserName(String userName) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.UserName.Xpath"), userName);
		return this;
	}
	
	public IRCTCRegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public IRCTCRegistrationPage enterConfirmPassword(String confirmPassword) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	
	public IRCTCRegistrationPage clickOnPreferredLanguage() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.PreferredLanguage.Xpath"));
		return this;
	}
	
	public IRCTCRegistrationPage clickOnChooseLanguage() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.ChooseLanguage.Xpath"));
		return this;
	}
	
	public IRCTCRegistrationPage clickOnSecurityQuestion() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.SecurityQuestion.Xpath"));
		return this;
	}
	
	public IRCTCRegistrationPage clickOnChooseSecurityQuestion(String securityQuestion) {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.ChooseSecurityQuestion.Xpath"),securityQuestion);
		return this;
	}
	public IRCTCRegistrationPage pageDownAccess() {
		pageScrollDown();
		return this;
	}
	public IRCTCRegistrationPage waitTime() {
		waitProperty(2000);
		return this;
	}
	public IRCTCRegistrationPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath(prop.getProperty("IRCTCRegistrationPage.SecurityAnswer.Xpath"), securityAnswer);
		return this;
	}
	
	public PersonalDetailsPage clickOnContinue() {
		clickByXpath(prop.getProperty("IRCTCRegistrationPage.Continue.Xpath"));
		return new PersonalDetailsPage();
	}
	
}
