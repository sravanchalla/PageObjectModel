package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.AlertMainPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify the simple alert";
		author="Sravan";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		sheetName="TC010";
	}

	@Test(dataProvider="myData")
	public void simpleAlert(String idText) {
		new AlertMainPage()
		.switchToFrame()
		.clickOnTryIt()
		.getTextFromAlert()
		.waitTime()
		.acceptTheAlert()
		.switchDefaultContent()
		.clickOnHome(idText)
		.switchNewWindow();
	}
}
