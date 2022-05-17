package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRHomePage extends GenericWrappers {

	     public FTRHomePage switchToNewWindow() {
	    	 switchToLastWindow();
	    	 return this;
	     }
	     
	     
	     public FTRRegistrationPage clickOnNewUserSignUP() {
    	 clickByXpath(prop.getProperty("FTRHomePage.NewUserSignUP.Xpath"));
    	 return new FTRRegistrationPage();
     }
}
