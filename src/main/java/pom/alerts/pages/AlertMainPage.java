package pom.alerts.pages;

import wrappers.GenericWrappers;

public class AlertMainPage extends GenericWrappers {

	public AlertMainPage switchToFrame() {
		switchToFrameByWebElement(prop.getProperty("AlertMainPage.switchToFrame.Xpath"));
		return this;
	}
	
	public AlertPage clickOnTryIt() {
		clickByXpathNoSnap("//body[@contenteditable='false']/button");
		return new AlertPage();
	}
	
	public AlertMainPage switchDefaultContent() {
		switchToDefaultContent();
		return this;
	}
	
	public AlertsHomePage clickOnHome(String idText) {
		clickByXpath(prop.getProperty("AlertMainPage.Home.Xpath"),idText);
		return new AlertsHomePage();
	}
	
	public AlertMainPage verifyPrintedText(String verifyText1) {
		verifyTextByXpath(prop.getProperty("AlertMainPage.PrintedText.Xpath"), verifyText1);
		return this;
	}
	
	public AlertMainPage refreshPage() {
		refreshThePage();
		return new AlertMainPage();
	}
	
	public AlertMainPage verifyText(String verifyText2) {
		verifyTextContainsByXpath(prop.getProperty("AlertMainPage.Text.Xpath"), verifyText2);
		return this;
	}
	
	
	public AlertMainPage waitTime() {
		waitProperty(2000);
		return this;
	}
}
