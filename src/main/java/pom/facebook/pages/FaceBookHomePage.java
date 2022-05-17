package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookHomePage extends GenericWrappers{

	public FaceBookSignUpPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("FaceBookHomePage.CreateNewAccount.Xpath"));
		return new FaceBookSignUpPage();
	}
	
}
