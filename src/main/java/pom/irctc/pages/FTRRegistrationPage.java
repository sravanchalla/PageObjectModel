package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRRegistrationPage extends GenericWrappers{
    public FTRRegistrationPage enterUserId(String userId) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.UserId.Xpath"), userId);
    	return this;
    }
    
    public FTRRegistrationPage enterPassword(String password) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.Password.Xpath"), password);
    	return this;
    }
    
    public FTRRegistrationPage enterConfirmPassword(String confirmPassword) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.ConfirmPassword.Xpath"), confirmPassword);
    	return this;
    }
    
    public FTRRegistrationPage selectSecurityQuestion(String securityQuestion) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.SecurityQuestion.Xpath"), securityQuestion);
    	return this;
    }
    
    public FTRRegistrationPage enterSecurityAnswer(String securityAnswer) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.SecurityAnswer.Xpath"), securityAnswer);
    	return this;
    }
    
    public FTRRegistrationPage clickOnDOB() {
    	clickByXpath(prop.getProperty("FTRRegistrationPage.DOB.Xpath"));
    	return this;
    }
    
    public FTRRegistrationPage selectMonth(String dobMonth) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.Month.Xpath"), dobMonth);
    	return this;
    }
    
    public FTRRegistrationPage selectYear(String dobYear) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.Year.Xpath"), dobYear);
    	return this;
    }
    
    public FTRRegistrationPage clickOnDate(String date) {
    	clickByXpath(prop.getProperty("FTRRegistrationPage.Date.Xpath"),date);
    	return this;
    }
    
    public FTRRegistrationPage clickOnGender(String gender) {
    	clickByXpath(prop.getProperty("FTRRegistrationPage.Gender.Xpath"),gender);
    	return this;
    }
    
    public FTRRegistrationPage clickOnMartialStatus(String martialStatus) {
    	clickByXpath(prop.getProperty("FTRRegistrationPage.MartialStatus.Xpath"),martialStatus);
    	return this;
    }
    
    public FTRRegistrationPage enterEmailId(String emailId) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.EmailId.Xpath"), emailId);
    	return this;
    }
    
    public FTRRegistrationPage selectOccupation(String occupation) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.Occupation.Xpath"), occupation);
    	return this;
    }
    
    public FTRRegistrationPage enterFirstName(String firstName) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.FirstName.Xpath"), firstName);
    	return this;
    }
    
    public FTRRegistrationPage enterMiddleName(String middleName) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.MiddleName.Xpath"), middleName);
    	return this;
    }
    
    public FTRRegistrationPage enterLastName(String lastName) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.LastName.Xpath"), lastName);
    	return this;
    }
    
    public FTRRegistrationPage selectNationality(String nationality) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.Nationality.Xpath"), nationality);
    	return this;
    }
    
    public FTRRegistrationPage enterFlatNo(String flatNo) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.FlatNo.Xpath"), flatNo);
    	return this;
    }
    
    public FTRRegistrationPage enterStreet(String streetName) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.Street.Xpath"), streetName);
    	return this;
    }
    
    public FTRRegistrationPage enterArea(String areaName) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.Area.Xpath"), areaName);
    	return this;
    }
    
    public FTRRegistrationPage pageDownAccess() {
    	pageScrollDown();
    	return this;
    }
    
    public FTRRegistrationPage selectCountry(String countryName) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.Country.Xpath"), countryName);
    	return this;
    }
    
    public FTRRegistrationPage enterMobileNo(String mobileNo) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.MobileNo.Xpath"), mobileNo);
    	return this;
    }
    
    public FTRRegistrationPage enterPincode(String pincode) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.Pincode.Xpath"), pincode);
    	return this;
    }
    
    public FTRRegistrationPage pressTabKeyForCityAndState() {
    	tabKey();
    	return this;
    }
    
    public FTRRegistrationPage selectPostOffice(String postOfficeName) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.PostOffice.Xpath"), postOfficeName);
    	return this;
    }
    
    public FTRRegistrationPage clickCommunicationAddressAsNo() {
    	clickByXpath(prop.getProperty("FTRRegistrationPage.CommunicationAddressAsNo.Xpath"));
    	return this;
    }
    
    public FTRRegistrationPage enterOfficeFlatNo(String officeFlatNo) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.OfficeFlatNo.Xpath"), officeFlatNo);
    	return this;
    }
    
    public FTRRegistrationPage enterOfficeStreet(String officeStreetName) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.OfficeStreet.Xpath"), officeStreetName);
    	return this;
    }
    
    public FTRRegistrationPage enterOfficeAreaName(String officeAreaName) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.OfficeAreaName.Xpath"), officeAreaName);
    	return this;
    }
    
    public FTRRegistrationPage selectOfficeCountry(String officeCountryName) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.OfficeCountry.Xpath"), officeCountryName);
    	return this;
    }
    
    public FTRRegistrationPage enterOfficeMobileNo(String officeMobileNo) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.OfficeMobileNo.Xpath"), officeMobileNo);
    	return this;
    }
    
    public FTRRegistrationPage enterOfficePincode(String officePincode) {
    	enterByXpath(prop.getProperty("FTRRegistrationPage.OfficePincode.Xpath"), officePincode);
    	return this;
    }
    
    public FTRRegistrationPage selectOfficePostOffice(String officePostOfficeName) {
    	selectVisibleTextByXpath(prop.getProperty("FTRRegistrationPage.OfficePostOffice.Xpath"), officePostOfficeName);
    	return this;
    }
    
    public FTRRegistrationPage waitTime() {
    	waitProperty(2000);
    	return this;
    }
    
    
    
  }
