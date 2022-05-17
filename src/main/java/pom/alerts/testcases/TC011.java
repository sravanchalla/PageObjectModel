package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.AlertMainPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify the confirmation alert";
		author="Sravan";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		sheetName="TC011";
	}

	@Test(dataProvider="myData")
	public void confirmationAlert(String verifyText1,String verifyText2,String idText) {
		new AlertMainPage()
		.switchToFrame()
		.clickOnTryIt()
		.getTextFromAlert()
		.acceptTheAlert()
		.verifyPrintedText(verifyText1)
		.refreshPage()
		.switchToFrame()
		.clickOnTryIt()
		.dismissTheAlert()
		.verifyPrintedText(verifyText2)
		.switchDefaultContent()
		.clickOnHome(idText);
	}
}
