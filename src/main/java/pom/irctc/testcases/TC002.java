package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
	   testCaseName="TC002";
	   testCaseDescription="To verify coach Booking registration for new user";
	   author="Sravan";
	   category="Regression";
	   browserName="chrome";
	   url="https://www.irctc.co.in/nget/train-search";
	   sheetName="TC002";
	   
	}
    
	
	@Test(dataProvider="myData")
	public void bookYourCoach(String userId,String password,String confirmPassword,String securityQuestion,String securityAnswer,String dobmonth,String dobyear,String date,String gender,String martialStatus,String emailId,String occupation,String firstName,
 		   String middleName,String lastName,String natioanlity,String flatNo,String streetName,String areaName,String countryName,String mobileNo,String pincode,String postOfficeName,String officeFlatNo,String officeStreetName,String officeAreaName,String officeCountryName,String officeMobileNo,
 		   String officePincode,String officePostOfficeName) {
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnMenu()
		.clickOnBookYourTrainOrCoach()
		.switchToNewWindow()
		.clickOnNewUserSignUP()
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.selectSecurityQuestion(securityQuestion)
		.enterSecurityAnswer(securityAnswer)
		.clickOnDOB()
		.selectMonth(dobmonth)
		.selectYear(dobyear)
		.clickOnDate(date)
		.clickOnGender(gender)
		.clickOnMartialStatus(martialStatus)
		.enterEmailId(emailId)
		.selectOccupation(occupation)
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.selectNationality(natioanlity)
		.enterFlatNo(flatNo)
		.enterStreet(streetName)
		.enterArea(areaName)
		.pageDownAccess()
		.selectCountry(countryName)
		.enterMobileNo(mobileNo)
		.enterPincode(pincode)
		.pressTabKeyForCityAndState()
		.selectPostOffice(postOfficeName)
		.clickCommunicationAddressAsNo()
		.enterOfficeFlatNo(officeFlatNo)
		.enterOfficeStreet(officeStreetName)
		.enterOfficeAreaName(officeAreaName)
		.selectOfficeCountry(officeCountryName)
		.enterOfficeMobileNo(officeMobileNo)
		.enterOfficePincode(officePincode)
		.pressTabKeyForCityAndState()
		.selectOfficePostOffice(officePostOfficeName);
	}
	
}
