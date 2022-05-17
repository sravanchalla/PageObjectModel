package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AddressPage extends GenericWrappers {
   
	public AddressPage enterFlatNo(String flatNo) {
		enterByXpath(prop.getProperty("AddressPage.FlatNo.Xpath"), flatNo);
		return this;
	}
	
	public AddressPage enterStreetName(String streetName) {
		enterByXpath(prop.getProperty("AddressPage.StreetName.Xpath"), streetName);
		return this;
	}
	
	public AddressPage enterAreaName(String areaName) {
		enterByXpath(prop.getProperty("AddressPage.AreaName.Xpath"), areaName);
		return this;
	}
	
	public AddressPage enterPinCode(String pincode) {
		enterByXpath(prop.getProperty("AddressPage.PinCode.Xpath"), pincode);
		return this;
	}
	
	public AddressPage enterState(String stateName) {
		enterByXpath(prop.getProperty("AddressPage.State.Xpath"), stateName);
		return this;
	}
	
	public AddressPage enterCityName(String cityName) {
		enterByXpath(prop.getProperty("AddressPage.CityName.Xpath"), cityName);
		return this;
	}
	
	public AddressPage enterPostOfficeName(String postOfficeName) {
		enterByXpath(prop.getProperty("AddressPage.PostOfficeName.Xpath"), postOfficeName);
		return this;
	}
	
	public AddressPage enterPhone(String phoneNo) {
		enterByXpath(prop.getProperty("AddressPage.Phone.Xpath"), phoneNo);
		return this;
	}
	
	public AddressPage clickResidentialAddressAsNo() {
		clickByXpath(prop.getProperty("AddressPage.ResidentialAddressAsNo.Xpath"));
		return this;
	}
	
	public AddressPage enterOfficeFlatNo(String officeFlatNo) {
		enterByXpath(prop.getProperty("AddressPage.OfficeFlatNo.Xpath"), officeFlatNo);
		return this;
	}
	
	public AddressPage enterOfficeStreetName(String officeStreetName) {
		enterByXpath(prop.getProperty("AddressPage.OfficeStreetName.Xpath"), officeStreetName);
		return this;
	}
	
	public AddressPage enterOfficeAreaName(String officeAreaName) {
		enterByXpath(prop.getProperty("AddressPage.OfficeAreaName.Xpath"), officeAreaName);
		return this;
	}
	
	public AddressPage clickOnSelectCountry() {
		clickByXpath(prop.getProperty("AddressPage.SelectCountry.Xpath"));
		return this;
	}
	
	public AddressPage clickToChooseSelectCountry(String countryName) {
		clickByXpath(prop.getProperty("AddressPage.ChooseSelectCountry.Xpath"),countryName);
		return this;
	}
	
	public AddressPage enterOfficePincode(String officePincode) {
		enterByXpath(prop.getProperty("AddressPage.OfficePincode.Xpath"), officePincode);
		return this;
	}
	
	public AddressPage enterOfficeStateName(String officeStateName) {
		enterByXpath(prop.getProperty("AddressPage.OfficeStateName.Xpath"), officeStateName);
		return this;
	}
	public AddressPage pageDownAccess() {
		pageScrollDown();
		return this;
	}
	
	public AddressPage enterOfficeCityName(String officeCityName) {
		enterByXpath(prop.getProperty("AddressPage.OfficeCityName.Xpath"), officeCityName);
		return this;
	}
	
	public AddressPage enterOfficePostOfficeName(String officePostOfficeName) {
		enterByXpath(prop.getProperty("AddressPage.OfficePostOfficeName.Xpath"), officePostOfficeName);
		return this;
	}
	
	public AddressPage enterOfficePhoneNo(String officePhoneNo) {
		enterByXpath(prop.getProperty("AddressPage.OfficePhoneNo.Xpath"), officePhoneNo);
		return this;
	}
	
	public AddressPage clickOnTermsAndConditions() {
		clickByXpath(prop.getProperty("AddressPage.TermsAndConditions.Xpath"));
		return this;
	}
	
	public AddressPage waitTime() {
		waitProperty(2000);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
