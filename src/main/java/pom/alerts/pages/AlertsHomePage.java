package pom.alerts.pages;

import wrappers.GenericWrappers;

public class AlertsHomePage extends GenericWrappers {

	public AlertsHomePage switchNewWindow() {
		switchToLastWindow();
		return this;
	}
}
