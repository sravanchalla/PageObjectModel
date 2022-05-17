package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
    @BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify saloon mandatory check submission for new user";
		author="Sravan";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
		
	}
    
    @Test(dataProvider="myData")
	public void saloonMandatoryCheck(String applicantName,String organisationName,String addressName,String mobileNoEightDigit,String emailId,String originatingStationName
			,String destinationStationName,String departureYear,String departureDate,String arrivalYear,String arrivalDate,String noOfDays,String noAndTypeOfCoaches,String noOfPassengers,String purposeOfCharter,String servicesRequired
			,String text) {
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnMenu()
		.clickOnCharter()
		.clickOnCloseMenu()
		.clickOnEnquiryForm()
		.enterNameOfApplicant(applicantName)
		.enterNameOfOrganisation(organisationName)
		.enterAddress(addressName)
		.pageDownAccess()
		.enterMobileNo(mobileNoEightDigit)
		.enterEmail(emailId)
		.selectRequestForSaloonCharter()
		.enterOriginatingStation(originatingStationName)
		.enterDestinationStation(destinationStationName)
		.clickOnDateOfDeparture()
		.selectDepartureYear(departureYear)
		.clickOnDepartureMonth()
		.waitTime()
		.clickOnDepartureDate(departureDate)
		.clickOnDateOfArrival()
		.selectArrivalYear(arrivalYear)
		.clickOnArrivalMonth()
		.waitTime()
		.clickOnArrivalDate(arrivalDate)
		.enterDurationOfTour(noOfDays)
		.enterNumberAndTypeOfCoaches(noAndTypeOfCoaches)
		.enterNoOfPassengers(noOfPassengers)
		.enterPurposeOfCharter(purposeOfCharter)
		.enterAdditionalServicesRequired(servicesRequired)
		.clickOnSubmit()
		.verifyTextBelowMobileNoField(text);
	}
}
