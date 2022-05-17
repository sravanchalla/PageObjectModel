package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IRCTCGuestUserLoginPage extends GenericWrappers {
    
	public IRCTCGuestUserLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("IRCTCLoginPage.GuestUserLogin.Xpath"));
		return this;
	}
	
	public IRCTCGuestUserLoginPage enterEmail(String emailId) {
		enterByXpath(prop.getProperty("IRCTCLoginPage.Email.Xpath"), emailId);
		return this;
	}
	
	public IRCTCGuestUserLoginPage enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("IRCTCLoginPage.MobileNo.Xpath"), mobileNo);
		return this;
	}
	
	public ChooseHotelCityPage clickOnLogin() {
		clickByXpath(prop.getProperty("IRCTCLoginPage.Login.Xpath"));
		return new ChooseHotelCityPage();
	}
}
