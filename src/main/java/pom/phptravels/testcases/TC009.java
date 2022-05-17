package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelRegistrationPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify Php travels registration for new user";
		author="Sravan";
		category="Smoke";
		browserName="chrome";
		url="https://www.phptravels.org/register.php";
		sheetName="TC009";
	}

	@Test(dataProvider="myData")
	public void pHPTravelsRegistration(String firstName,String lastName,String emailId,String countryName,String phoneNo,String companyName,String addressFirstLine,String addressSecondLine,String cityName,String stateName,String postCode,
			String countryCode,String mobileNo,String passwordOne,String passwordTwo) {
		new PhpTravelRegistrationPage()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailId(emailId)
		.clickOnCountry()
		.pageDownAccess()
		.waitTime()
		.selectCountryCode(countryName)
		.enterPhoneNo(phoneNo)
		.enterCompanyName(companyName)
		.enterStreetAddress(addressFirstLine)
		.enterStreetAddress2(addressSecondLine)
		.enterCity(cityName)
		.enterState(stateName)
		.enterPostCode(postCode)
		.pageDownAccess()
		.waitTime()
		.selectCountry(countryCode)
/*		.clickOnEarthIcon()
		.waitTime()
		.clickOnChooseCountry(countryCode)  */
		.enterMobileNo(mobileNo)
		.enterPassword(passwordOne)
		.enterConfirmPassword(passwordTwo)
		.clickOnGeneratePassword()
		.waitTime()
		.clickOnClose()
		.clickOnReceiveEmails();
		
	}
}
