package pom.alerts.pages;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers {

	public AlertPage getTextFromAlert() {
		getAlertTextByNoSnap();
		return this;
	}
	
	public AlertMainPage acceptTheAlert() {
		acceptAlert();
		return new AlertMainPage();
	}
	
/*	public AlertMainPage dismissTheAlert() {
		dismissAlert();
		return new AlertMainPage();
	}   */
	
	public AlertMainPage dismissTheAlert() {
		dismissAlert();
		return new AlertMainPage();
	}
	
	public AlertPage sendKeysInAlert(String text) {
	     sendKeysToAlertByNoSnap(text);
		return this;
	}
	
	public AlertPage waitTime() {
		waitProperty(6000);
		return this;
	}
}
