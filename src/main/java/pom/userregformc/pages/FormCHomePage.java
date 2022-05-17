package pom.userregformc.pages;
import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers{

	public FormCRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FormCHomePage.SignUp.Xpath"));
		return new FormCRegistrationPage();
	}
}
