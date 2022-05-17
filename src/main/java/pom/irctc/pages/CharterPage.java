package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
    public CharterPage clickOnCloseMenu() {
    	clickByXpath(prop.getProperty("CharterPage.CloseMenu.Xpath"));
    	return this;
    }
	public EnquiryFormPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.Xpath"));
		return new EnquiryFormPage();
	}
}
