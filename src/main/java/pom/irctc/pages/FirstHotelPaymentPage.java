package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FirstHotelPaymentPage extends GenericWrappers {
 
	public FirstHotelPaymentPage clickOnTermsAndConditions() {
		clickByXpath(prop.getProperty("FirstHotelPaymentPage.TermsAndConditions.Xpath"));
		return this;
	}
	
	public OTPVerificationPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("FirstHotelPaymentpage.MakePayment.Xpath"));
		return new OTPVerificationPage();
	}
}
