package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify irctc signup for new user registration";
		author="Sravan";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
	}
	
	
	@Test(dataProvider="myData")
	public void irctcSignUp(String userName,String password,String confirmPassword,String securityQuestion,String securityAnswer,String firstName,String middleName,String lastName,String occupation,String month,String year,String date,String martialStatus,String country,String gender,String emailId,String isd,String mobile,String nationality
			,String flatNo,String streetName,String areaName,String pincode,String stateName,String cityName,String postOfficeName,String phoneNo,String officeFlatNo,String officeStreetName,String officeAreaName,String countryName,String officePincode
			,String officeStateName,String officeCityName,String officePostOfficeName,String officePhoneNo) {
		new CovidAlertPage()
		.clickOnOK()
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.clickOnPreferredLanguage()
		.clickOnChooseLanguage()
		.clickOnSecurityQuestion()
		.clickOnChooseSecurityQuestion(securityQuestion)
		.enterSecurityAnswer(securityAnswer)
		.clickOnContinue()
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.clickOnSelectOccupation()
		.clickToChooseSelectOccupation(occupation)
		.clickOnDOB()
		.selectMonth(month)
		.selectYear(year)
		.clickOnDate(date)
		.clickOnMartialStatus(martialStatus)
		.selectCountry(country)
		.clickOnGender(gender)
		.enterEmail(emailId)
		.enterISD(isd)
		.enterMobile(mobile)
		.selectNationality(nationality)
		.clickOnContinue()
		.enterFlatNo(flatNo)
		.enterStreetName(streetName)
		.enterAreaName(areaName)
		.enterPinCode(pincode)
		.enterState(stateName)
		.enterCityName(cityName)
		.enterPostOfficeName(postOfficeName)
		.enterPhone(phoneNo)
		.clickResidentialAddressAsNo()
		.enterOfficeFlatNo(officeFlatNo)
		.enterOfficeStreetName(officeStreetName)
		.enterOfficeAreaName(officeAreaName)
		.clickOnSelectCountry()
		.clickToChooseSelectCountry(countryName)
		.enterOfficePincode(officePincode)
		.enterOfficeStateName(officeStateName)
		.enterOfficeCityName(officeCityName)
		.enterOfficePostOfficeName(officePostOfficeName)
		.pageDownAccess()
		.enterOfficePhoneNo(officePhoneNo)
		.waitTime()
		.clickOnTermsAndConditions();
	}

}
