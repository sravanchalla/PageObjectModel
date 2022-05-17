package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {
	
   public IRCTCHomePage clickOnOK() {
	   clickByXpath(prop.getProperty("CovidAlertPage.OK.Xpath"));
	   return new IRCTCHomePage();
   }
}