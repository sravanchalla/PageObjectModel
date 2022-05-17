package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify hotel booking by otp validation";
		author="Sravan";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in";
		sheetName="TC004";
		
	}
	
	@Test(dataProvider="myData")
	public void bookHotelsOTPValidation(String emailId,String mobileNo,String destinationName,String checkInYear,String checkInMonth,String checkInDate,String checkOutYear,String checkOutMonth,String checkOutDate,String title,String firstName,String lastName,String stateName,String gst,String text) {
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnHotelsIcon()
		.switchToNewWindow()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmail(emailId)
		.enterMobileNo(mobileNo)
		.clickOnLogin()
		.waitTime()
		.enterCityOrHotelName(destinationName)
		.waitTime()
		.clickOnDestination()
		.clickCheckInDate()
		.waitTime()
		.clickOnselectYear()
		.clickOnCheckInYear(checkInYear)
		.waitTime()
		.clickOnCheckInMonth(checkInMonth)
		.clickOnCheckInDate(checkInDate)
		.waitTime()
		.clickCheckOutDate()
		.waitTime()
		.clickOnselectYear()
		.waitTime()
		.clickOnCheckOutYear(checkOutYear)
	//	.waitTime()
		.clickOnCheckOutMonth(checkOutMonth)
		.clickOnCheckOutDate(checkOutDate)
		.clickOnRoomAndGuest()
		.selectGuestAs3()
		.clickOnDone()
		.clickOnFindHotel()
		.getNameOfFirstHotel()
		.getPriceOfFirstHotel()
		.clickOnFirstHotel()
		.switchToNewWindow()
		.waitTime()
		.clickOnContinueToBook()
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectState(stateName)
		.selectGst(gst)
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueForGstNo()
		.clickOnTermsAndConditions()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyOtpRequiredText(text);
		
	}
}
