package pom.panindia.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.pages.PanIndRegistrationPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify the new Pan registration";
		author="Sravan";
		category="Smoke";
		browserName="chrome";
		url="https://panind.com/india/new_pan/";
		sheetName="TC008";
	}

	
	@Test(dataProvider="myData")
	public void panIndApplication(String title, String firstName, String middleName, String lastName, String fatherFirstName, String fatherMiddleName, String fatherLastName,
			String mobileNo, String emailId, String incomeSource, String dOB, String addressFirstLine, String addressSecondLine, String cityName, String stateName, String pincode,
			String officeName,String officeAddressFirstLine,String officeAddressSecondLine,String officeCityName,String officeStateName,String officePincode,String identityProof,
			String addressProof, String dOBProof, String aadhaarProof, String officeAddressProof) {
		new PanIndRegistrationPage()
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.enterFatherFirstName(fatherFirstName)
		.enterFatherMiddleName(fatherMiddleName)
		.enterFatherLastName(fatherLastName)
		.enterMobileNo(mobileNo)
		.enterEmailId(emailId)
		.pageScrollDownAccess()
		.selectSourceOfInCome(incomeSource)
		.clickOnOfficeForCommunicationAddress()
		.enterDOB(dOB)
		.pageScrollDownAccess()
		.enterResidenceHouseNo(addressFirstLine)
		.enterResidenceArea(addressSecondLine)
		.enterResidenceCity(cityName)
		.selectResidenceState(stateName)
		.enterResidencePincode(pincode)
		.enterOfficeName(officeName)
		.enterOfficeHouseNo(officeAddressFirstLine)
		.enterOfficeArea(officeAddressSecondLine)
		.enterOfficeCity(officeCityName)
		.selectOfficeState(officeStateName)
		.enterOfficePincode(officePincode)
		.pageScrollDownAccess()
		.selectIdentityProof(identityProof)
		.selectAddressProof(addressProof)
		.selectDOBProof(dOBProof)
		.selectAdhaarProof(aadhaarProof)
		.selectOfficeAddressProof(officeAddressProof)
		.clickOnTermsAndConditions();
	}
}
