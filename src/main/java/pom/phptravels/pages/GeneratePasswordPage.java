package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class GeneratePasswordPage extends GenericWrappers {
	
	public GeneratePasswordPage waitTime() {
		waitProperty(2000);
		return this;
	}

	public PhpTravelRegistrationPage clickOnClose() {
		clickByXpath(prop.getProperty("GeneratePasswordPage.Close.Xpath"));
		return new PhpTravelRegistrationPage();
	}
}
