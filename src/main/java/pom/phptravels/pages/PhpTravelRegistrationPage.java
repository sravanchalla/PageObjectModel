package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpTravelRegistrationPage extends GenericWrappers{

	public PhpTravelRegistrationPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public PhpTravelRegistrationPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public PhpTravelRegistrationPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public PhpTravelRegistrationPage clickOnCountry() {
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.Country1.Xpath"));
		return this;
	}
	
	public PhpTravelRegistrationPage selectCountryCode(String countryName1) {
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.CountryCode.Xpath"),countryName1);
		return this;
	}    
	
	public PhpTravelRegistrationPage enterPhoneNo(String phoneNo) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.PhoneNo.Xpath"), phoneNo);
		return this;
	}
	
	public PhpTravelRegistrationPage enterCompanyName(String companyName) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.CompanyName.Xpath"), companyName);
		return this;
	}
	
	public PhpTravelRegistrationPage enterStreetAddress(String addressFirstLine) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.StreetAddress.Xpath"), addressFirstLine);
		return this;
	}
	
	public PhpTravelRegistrationPage enterStreetAddress2(String addressSecondLine) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.StreetAddress2.Xpath"), addressSecondLine);
		return this;
	}
	
	public PhpTravelRegistrationPage enterCity(String cityName) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.City.Xpath"), cityName);
		return this;
	}
	
	public PhpTravelRegistrationPage enterState(String stateName) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.State.Xpath"), stateName);
		return this;
	}
	
	public PhpTravelRegistrationPage enterPostCode(String postCode) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.PostCode.Xpath"), postCode);
		return this;
	}
	
	public PhpTravelRegistrationPage tabAccess() {
		tabKey();
		return this;
	}
	
	public PhpTravelRegistrationPage selectCountry(String countryCode) {
		selectValueByXpath(prop.getProperty("PhpTravelRegistrationPage.Country.Xpath"), countryCode);
		return this;
	}    
	
/*	public PhpTravelRegistrationPage clickOnEarthIcon() {
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.EarthIcon.Xpath"));
		return this;
	}
	
	public PhpTravelRegistrationPage clickOnChooseCountry(String countryCode) {
		clickByXpath("PhpTravelRegistrationPage.ChooseCountry.Xpath", countryCode);
		return this;
	}    */
	
	public PhpTravelRegistrationPage enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.MobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public PhpTravelRegistrationPage enterPassword(String passwordOne) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.Password.Xpath"), passwordOne);
		return this;
	}
	
	public PhpTravelRegistrationPage enterConfirmPassword(String passwordTwo) {
		enterByXpath(prop.getProperty("PhpTravelRegistrationPage.ConfirmPassword.Xpath"), passwordTwo);
		return this;
	}
	
	public GeneratePasswordPage clickOnGeneratePassword() {
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.GeneratePassword.Xpath"));
		return new GeneratePasswordPage();
	}
	
	public PhpTravelRegistrationPage clickOnReceiveEmails() {
		clickByXpath(prop.getProperty("PhpTravelRegistrationPage.ReceiveEmails.Xpath"));
		return this;
	}
	
	public PhpTravelRegistrationPage pageDownAccess() {
		pageScrollDown();
		return this;
	}
	
	public PhpTravelRegistrationPage waitTime() {
		waitProperty(2000);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
