package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {
	
    public AccomodationPage switchToNewWindow() {
    	switchToLastWindow();
    	return this;
    }
	public FindHotelHomePage clickOnHotelsIcon() {
		clickByXpath(prop.getProperty("AccomodationPage.HotelsIcon.Xpath"));
		return new FindHotelHomePage();
	}
	
	public AccomodationPage clickOnMenu() {
		clickByXpath(prop.getProperty("AccomodationPage.Menu.Xpath"));
		return this;
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccomodationPage.Charter.Xpath"));
		return new CharterPage();
	}
	
	public FTRHomePage clickOnBookYourTrainOrCoach() {
		clickByXpath(prop.getProperty("AccomodationPage.BookYourTrainOrCoach.Xpath"));
		return new FTRHomePage();
	}
	

	
}
