package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OTPVerificationPage extends GenericWrappers {

	public OTPVerificationPage clickOnVerify() {
		clickByXpath(prop.getProperty("OTPVerificationPage.Verify.Xpath"));
		return this;
	}
	
	public OTPVerificationPage verifyOtpRequiredText(String text) {
		verifyTextContainsByXpath(prop.getProperty("OTPVerificationPage.OtpRequiredText.Xpath"), text);
		return this;
	}
}
