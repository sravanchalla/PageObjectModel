package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FirstHotelPage extends GenericWrappers {
	
	public FirstHotelPage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
	
	public FirstHotelPage waitTime() {
		waitProperty(2000);
		return this;
	}
    
	public FirstHotelPersonalDetailsPage clickOnContinueToBook() {
		clickByXpath(prop.getProperty("FirstHotelPage.ContinueToBook.Xpath"));
	//	clickByExplicitWait("FirstHotelPage.ContinueToBook.Xpath", 10);
		return new FirstHotelPersonalDetailsPage();
	}
}
