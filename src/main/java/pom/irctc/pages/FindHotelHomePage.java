package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FindHotelHomePage extends GenericWrappers {
     
	public FindHotelHomePage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
	public IRCTCGuestUserLoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("FindHotelHomePage.Login.Xpath"));
		return new IRCTCGuestUserLoginPage();
	}
}
