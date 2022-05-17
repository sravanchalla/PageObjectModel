package pom.panindia.pages;

import wrappers.GenericWrappers;

public class PanIndRegistrationPage extends GenericWrappers{

	public PanIndRegistrationPage selectTitle(String title) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.Title.Xpath"), title);
		return this;
	}
	
	public PanIndRegistrationPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public PanIndRegistrationPage enterMiddleName(String middleName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.MiddleName.Xpath"), middleName);
		return this;
	}
	
	public PanIndRegistrationPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public PanIndRegistrationPage enterFatherFirstName(String fatherFirstName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.FatherFirstName.Xpath"), fatherFirstName);
		return this;
	}
	
	public PanIndRegistrationPage enterFatherMiddleName(String fatherMiddleName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.FatherMiddleName.Xpath"), fatherMiddleName);
		return this;
	}
	
	public PanIndRegistrationPage enterFatherLastName(String fatherLastName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.FatherLastName.Xpath"), fatherLastName);
		return this;
	}
	
	public PanIndRegistrationPage enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.MobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public PanIndRegistrationPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public PanIndRegistrationPage selectSourceOfInCome(String incomeSource) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.SourceOfInCome.Xpath"), incomeSource);
		return this;
	}
	
	public PanIndRegistrationPage clickOnOfficeForCommunicationAddress() {
		clickByXpath(prop.getProperty("PanIndRegistrationPage.OfficeForCommunicationAddress.Xpath"));
		return this;
	}
	
	public PanIndRegistrationPage enterDOB(String dOB) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.DOB.Xpath"), dOB);
		return this;
	}
	
	public PanIndRegistrationPage enterResidenceHouseNo(String addressFirstLine) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.ResidenceHouseNo.Xpath"), addressFirstLine);
		return this;
	}
	
	public PanIndRegistrationPage enterResidenceArea(String addressSecondLine) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.ResidenceArea.Xpath"), addressSecondLine);
		return this;
	}
	
	public PanIndRegistrationPage enterResidenceCity(String cityName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.ResidenceCity.Xpath"), cityName);
		return this;
	}
	
	public PanIndRegistrationPage selectResidenceState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.ResidenceState.Xpath"), stateName);
		return this;
	}
	
	public PanIndRegistrationPage enterResidencePincode(String pincode) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.ResidencePincode.Xpath"), pincode);
		return this;
	}
	
	public PanIndRegistrationPage enterOfficeName(String officeName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.OfficeName.Xpath"), officeName);
		return this;
	}
	
	public PanIndRegistrationPage enterOfficeHouseNo(String officeAddressFirstLine) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.OfficeHouseNo.Xpath"), officeAddressFirstLine);
		return this;
	}
	
	public PanIndRegistrationPage enterOfficeArea(String officeAddressSecondLine) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.OfficeArea.Xpath"), officeAddressSecondLine);
		return this;
	}
	
	public PanIndRegistrationPage enterOfficeCity(String officeCityName) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.OfficeCity.Xpath"), officeCityName);
		return this;
	}
	
	public PanIndRegistrationPage selectOfficeState(String officeStateName) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.OfficeState.Xpath"), officeStateName);
		return this;
	}
	
	public PanIndRegistrationPage enterOfficePincode(String officePincode) {
		enterByXpath(prop.getProperty("PanIndRegistrationPage.OfficePincode.Xpath"), officePincode);
		return this;
	}
	
	public PanIndRegistrationPage selectIdentityProof(String identityProof) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.IdentityProof.Xpath"), identityProof);
		return this;
	}
	
	public PanIndRegistrationPage selectAddressProof(String addressProof) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.AddressProof.Xpath"), addressProof);
		return this;
	}
	
	public PanIndRegistrationPage selectDOBProof(String dOBProof) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.DOBProof.Xpath"), dOBProof);
		return this;
	}
	
	public PanIndRegistrationPage selectAdhaarProof(String aadhaarProof) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.AdhaarProof.Xpath"), aadhaarProof);
		return this;
	}
	
	public PanIndRegistrationPage selectOfficeAddressProof(String officeAddressProof) {
		selectVisibleTextByXpath(prop.getProperty("PanIndRegistrationPage.OfficeAddressProof.Xpath"), officeAddressProof);
		return this;
	}
	
	public PanIndRegistrationPage clickOnTermsAndConditions() {
		clickByXpath(prop.getProperty("PanIndRegistrationPage.TermsAndConditions.Xpath"));
		return this;
	}
	
	public PanIndRegistrationPage pageScrollDownAccess() {
		pageScrollDown();
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
