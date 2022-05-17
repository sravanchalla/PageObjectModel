package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IRCTCHomePage extends GenericWrappers {
	
    public IRCTCRegistrationPage clickOnRegister() {
    	clickByXpath(prop.getProperty("IRCTCHomePage.Register.Xpath"));
    	return new IRCTCRegistrationPage();
    }
    
    public IRCTCHomePage mouseHoverOnHolidays() {
    	mouseHoverByXpath(prop.getProperty("IRCTCHomePage.Holidays.Xpath"));
    	return this;
    }
    
    public IRCTCHomePage mouseHoverOnStays() {
    	mouseHoverByXpath(prop.getProperty("IRCTCHomePage.Stays.Xpath"));
    	return this;
    }
    
    public AccomodationPage clickOnLounge() {
    	clickByXpath(prop.getProperty("IRCTCHomePage.Lounge.Xpath"));
    	return new AccomodationPage();
    }
}
