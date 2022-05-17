package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers {
      
	public EnquiryFormPage enterNameOfApplicant(String applicantName) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NameOfApplicant.Xpath"), applicantName);
		return this;
	}
	
	public EnquiryFormPage enterNameOfOrganisation(String organisationName) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NameOfOrganisation.Xpath"), organisationName);
		return this;
	}
	
	public EnquiryFormPage enterAddress(String addressName) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Address.Xpath"), addressName);
		return this;
	}
	
	public EnquiryFormPage enterMobileNo(String mobileNoEightDigit) {
		enterByXpath(prop.getProperty("EnquiryFormPage.MobileNo.Xpath"), mobileNoEightDigit);
		return this;
	}
	
	public EnquiryFormPage enterEmail(String emailId) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Email.Xpath"), emailId);
		return this;
	}
	
	public EnquiryFormPage selectRequestForSaloonCharter() {
		selectVisibleTextByXpath(prop.getProperty("EnquiryFormPage.RequestForSaloonCharter.Xpath"), "Saloon Charter");
		return this;
	}
	
	public EnquiryFormPage enterOriginatingStation(String originatingStationName) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OriginatingStation.Xpath"), originatingStationName);
		return this;
	}
	
	public EnquiryFormPage enterDestinationStation(String destinationStationName) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DestinationStation.Xpath"), destinationStationName);
		return this;
	}
	
	public EnquiryFormPage clickOnDateOfDeparture() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DateOfDeparture.Xpath"));
		return this;
	}
	
	public EnquiryFormPage selectDepartureYear(String departureYear) {
		selectVisibleTextByXpath(prop.getProperty("EnquiryFormPage.DepartureYear.Xpath"), departureYear);
		return this;
	}
	
	public EnquiryFormPage clickOnDepartureMonth() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DepartureMonth.Xpath"));
		return this;
	}
	
	public EnquiryFormPage clickOnDepartureDate(String departureDate) {
		clickByXpath(prop.getProperty("EnquiryFormPage.DepartureDate.Xpath"),departureDate);
		return this;
	}
	
	public EnquiryFormPage clickOnDateOfArrival() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DateOfArrival.Xpath"));
		return this;
	}
	
	public EnquiryFormPage selectArrivalYear(String arrivalYear) {
		selectVisibleTextByXpath(prop.getProperty("EnquiryFormPage.ArrivalYear.Xpath"), arrivalYear);
		return this;
	}
	
	public EnquiryFormPage clickOnArrivalMonth() {
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalMonth.Xpath"));
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalMonth.Xpath"));
		return this;
	}
	
	public EnquiryFormPage clickOnArrivalDate(String arrivalDate) {
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalDate.Xpath"),arrivalDate);
		return this;
	}
	
	public EnquiryFormPage enterDurationOfTour(String noOfDays) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DurationOfTour.Xpath"), noOfDays);
		return this;
	}
	
	public EnquiryFormPage enterNumberAndTypeOfCoaches(String noAndTypeOfCoaches) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NumberAndTypeOfCoaches.Xpath"), noAndTypeOfCoaches);
		return this;
	}
	
	public EnquiryFormPage enterNoOfPassengers(String noOfPassengers) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NoOfPassengers.Xpath"), noOfPassengers);
		return this;
	}
	
	public EnquiryFormPage enterPurposeOfCharter(String purposeOfCharter) {
		enterByXpath(prop.getProperty("EnquiryFormPage.PurposeOfCharter.Xpath"), purposeOfCharter);
		return this;
	}
	
	public EnquiryFormPage enterAdditionalServicesRequired(String servicesRequired) {
		enterByXpath(prop.getProperty("EnquiryFormPage.AdditionalServicesRequired.Xpath"), servicesRequired);
		return this;
	}
	
	public EnquiryFormPage clickOnSubmit() {
		clickByXpath(prop.getProperty("EnquiryFormPage.Submit.Xpath"));
		return this;
	}
	
	public EnquiryFormPage verifyTextBelowMobileNoField(String text) {
		verifyTextContainsByXpath(prop.getProperty("EnquiryFormPage.TextBelowMobileNoField.Xpath"), text);
		return this;
	}
	
	public EnquiryFormPage pageDownAccess() {
		pageScrollDown();
		return this;
	}
	
	public EnquiryFormPage waitTime() {
		waitProperty(2000);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
