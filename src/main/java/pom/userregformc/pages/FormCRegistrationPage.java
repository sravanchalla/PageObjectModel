package pom.userregformc.pages;

import wrappers.GenericWrappers;

public class FormCRegistrationPage extends GenericWrappers {
  
	public FormCRegistrationPage enterUserId(String userId) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.UserId.Xpath"), userId);
		return this;
	}
	
	public FormCRegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public FormCRegistrationPage enterConfirmPassword(String confirmPassword) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	
	public FormCRegistrationPage selectSecurityQuestion(String securityQuestion) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.SecurityQuestion.Xpath"), securityQuestion);
		return this;
	}
	
	public FormCRegistrationPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecurityAnswer.Xpath"), securityAnswer);
		return this;
	}
	
	public FormCRegistrationPage enterName(String name) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Name.Xpath"), name);
		return this;
	}
	
	public FormCRegistrationPage selectGender(String gender) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.Gender.Xpath"), gender);
		return this;
	}
	
	public FormCRegistrationPage enterDOB(String dOB) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.DOB.Xpath"), dOB);
		return this;
	}
	
	public FormCRegistrationPage enterDesignation(String designation) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Designation.Xpath"), designation);
		return this;
	}
	
	public FormCRegistrationPage enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public FormCRegistrationPage enterMobile(String mobileNo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Mobile.Xpath"), mobileNo);
		return this;
	}
	
	public FormCRegistrationPage enterPhoneNo(String phoneNo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.PhoneNo.Xpath"), phoneNo);
		return this;
	}
	
	public FormCRegistrationPage selectNationality(String nationality) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public FormCRegistrationPage enterHotelName(String hotelName) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelName.Xpath"), hotelName);
		return this;
	}
	
	public FormCRegistrationPage enterCapacity(String capacity) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Capacity.Xpath"), capacity);
		return this;
	}
	
	public FormCRegistrationPage enterAddress(String address) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Address.Xpath"), address);
		return this;
	}
	
	public FormCRegistrationPage selectState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.State.Xpath"), stateName);
		return this;
	}
	
	public FormCRegistrationPage waitTime() {
		waitProperty(2500);
		return this;
	}
	
	public FormCRegistrationPage selectCity(String district) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.City.Xpath"), district);
		return this;
	}  
	
	public FormCRegistrationPage selectAccomodationType(String accomodationType) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.AccomodationType.Xpath"), accomodationType);
		return this;
	}
	
	public FormCRegistrationPage selectAccomodationGrade(String grade) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.AccomodationGrade.Xpath"), grade);
		return this;
	}
	
	public FormCRegistrationPage enterHotelEmailId(String guestHouseMailId) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelEmailId.Xpath"), guestHouseMailId);
		return this;
	}
	
	public FormCRegistrationPage enterHotelMobileNo(String guestHouseMobileNo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelMobileNo.Xpath"), guestHouseMobileNo);
		return this;
	}
	
	public FormCRegistrationPage enterHotelPhoneNo(String guestHousePhoneNo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelPhoneNo.Xpath"), guestHousePhoneNo);
		return this;
	}
	
	public FormCRegistrationPage enterFirstOwnerName(String nameOne) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.FirstOwnerName.Xpath"), nameOne);
		return this;
	}
	
	public FormCRegistrationPage enterFirstOwnerAddress(String addressOne) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.FirstOwnerAddress.Xpath"), addressOne);
		return this;
	}
	
	public FormCRegistrationPage selectFirstOwnerState(String stateOne) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.FirstOwnerState.Xpath"), stateOne);
		return this;
	}
	
	public FormCRegistrationPage selectFirstOwnerDistrict(String districtOne) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.FirstOwnerDistrict.Xpath"), districtOne);
		return this;
	}
	
	public FormCRegistrationPage enterFirstOwnerEmailId(String mailOne) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.FirstOwnerEmailId.Xpath"), mailOne);
		return this;
	}
	
	public FormCRegistrationPage enterFirstOwnerPhoneNo(String phoneOne) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.FirstOwnerPhoneNo.Xpath"), phoneOne);
		return this;
	}
	
	public FormCRegistrationPage enterFirstOwnerMobileNo(String mobileOne) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.FirstOwnerMobileNo.Xpath"), mobileOne);
		return this;
	}
	
	public FormCRegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("FormCRegistrationPage.Add.Xpath"));
		return this;
	}
	
	public FormCRegistrationPage enterSecondOwnerName(String nameTwo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecondOwnerName.Xpath"), nameTwo);
		return this;
	}
	
	public FormCRegistrationPage enterSecondOwnerAddress(String addressTwo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecondOwnerAddress.Xpath"), addressTwo);
		return this;
	}
	
	public FormCRegistrationPage selectSecondOwnerState(String stateTwo) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.SecondOwnerState.Xpath"), stateTwo);
		return this;
	}
	
	public FormCRegistrationPage selectSecondOwnerDistrict(String districtTwo) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.SecondOwnerDistrict.Xpath"), districtTwo);
		return this;
	}
	
	public FormCRegistrationPage enterSecondOwnerEmailId(String mailTwo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecondOwnerEmailId.Xpath"), mailTwo);
		return this;
	}
	
	public FormCRegistrationPage enterSecondOwnerPhoneNo(String phoneTwo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecondOwnerPhoneNo.Xpath"), phoneTwo);
		return this;
	}
	
	public FormCRegistrationPage enterSecondOwnerMobileNo(String mobileTwo) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecondOwnerMobileNo.Xpath"), mobileTwo);
		return this;
	}
	
	public FormCRegistrationPage enterThirdOwnerName(String nameThree) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ThirdOwnerName.Xpath"), nameThree);
		return this;
	}
	
	public FormCRegistrationPage enterThirdOwnerAddress(String addressThree) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ThirdOwnerAddress.Xpath"), addressThree);
		return this;
	}
	
	public FormCRegistrationPage selectThirdOwnerState(String stateThree) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.ThirdOwnerState.Xpath"), stateThree);
		return this;
	}
	
	public FormCRegistrationPage selectThirdOwnerDistrict(String districtThree) {
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.ThirdOwnerDistrict.Xpath"), districtThree);
		return this;
	}
	
	public FormCRegistrationPage enterThirdOwnerEmailId(String mailThree) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ThirdOwnerEmailId.Xpath"), mailThree);
		return this;
	}
	
	public FormCRegistrationPage enterThirdOwnerPhoneNo(String phoneThree) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ThirdOwnerPhoneNo.Xpath"), phoneThree);
		return this;
	}
	
	public FormCRegistrationPage enterThirdOwnerMobileNo(String mobileThree) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ThirdOwnerMobileNo.Xpath"), mobileThree);
		return this;
	}
	
	
}
