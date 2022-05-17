package pom.userregformc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.userregformc.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify form C new user registration";
		author="Sravan";
		category="Regression";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
	}
	
	
    @Test(dataProvider="myData")
	public void formC(String userId,String password,String confirmPassword,String securityQuestion,String securityAnswer,String name,String gender,String dOB,
			String designation,String emailId,String mobileNo,String phoneNo,String nationality,String hotelName,String capacity,String address,String stateName,String district,
			String accomodationType,String grade,String guestHouseMailId,String guestHouseMobileNo,String guestHousePhoneNo,String nameOne,String addressOne,String stateOne,
			String districtOne,String mailOne,String phoneOne,String mobileOne,String nameTwo,String addressTwo,String stateTwo,String districtTwo,String mailTwo,String phoneTwo,String mobileTwo,
			String nameThree,String addressThree,String stateThree,String districtThree,String mailThree,String phoneThree,String mobileThree) {
		new FormCHomePage()
		.clickOnSignUp()
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.selectSecurityQuestion(securityQuestion)
		.enterSecurityAnswer(securityAnswer)
		.enterName(name)
		.selectGender(gender)
		.enterDOB(dOB)
		.enterDesignation(designation)
		.enterEmailId(emailId)
		.enterMobile(mobileNo)
		.enterPhoneNo(phoneNo)
		.selectNationality(nationality)
		.enterHotelName(hotelName)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(stateName)
		.waitTime()
	    .selectCity(district)
		.selectAccomodationType(accomodationType)
		.selectAccomodationGrade(grade)
		.enterHotelEmailId(guestHouseMailId)
		.waitTime()
		.enterHotelMobileNo(guestHouseMobileNo)
		.enterHotelPhoneNo(guestHousePhoneNo)
		.enterFirstOwnerName(nameOne)
		.enterFirstOwnerAddress(addressOne)
		.selectFirstOwnerState(stateOne)
		.selectFirstOwnerDistrict(districtOne)
		.enterFirstOwnerEmailId(mailOne)
		.enterFirstOwnerPhoneNo(phoneOne)
		.enterFirstOwnerMobileNo(mobileOne)
		.clickOnAdd()
		.enterSecondOwnerName(nameTwo)
		.enterSecondOwnerAddress(addressTwo)
		.selectSecondOwnerState(stateTwo)
		.waitTime()
		.selectSecondOwnerDistrict(districtTwo)
		.enterSecondOwnerEmailId(mailTwo)
		.enterSecondOwnerPhoneNo(phoneTwo)
		.enterSecondOwnerMobileNo(mobileTwo)
		.clickOnAdd()
		.enterThirdOwnerName(nameThree)
		.enterThirdOwnerAddress(addressThree)
		.selectThirdOwnerState(stateThree)
		.waitTime()
		.selectThirdOwnerDistrict(districtThree)
		.enterThirdOwnerEmailId(mailThree)
		.enterThirdOwnerPhoneNo(phoneThree)
		.enterThirdOwnerMobileNo(mobileThree)
		.clickOnAdd();
	}
}
