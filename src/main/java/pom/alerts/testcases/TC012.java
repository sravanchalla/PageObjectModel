package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.AlertMainPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To verify the prompt alert";
		author="Sravan";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		sheetName="TC012";
	}

	@Test(dataProvider="myData")
	public void promptAlert(String text1,String verifyText1,String text2,String verifyText2,String idText) {
		new AlertMainPage()
		.switchToFrame()
		.clickOnTryIt()
		.waitTime()
		.sendKeysInAlert(text1)
		.getTextFromAlert()
		.acceptTheAlert()
		.verifyText(verifyText1)
		.refreshPage()
		.switchToFrame()
		.clickOnTryIt()
		.waitTime()
		.sendKeysInAlert(text2)
		.getTextFromAlert()
		.dismissTheAlert()
		.verifyText(verifyText2)
		.switchDefaultContent()
		.clickOnHome(idText);
	}
}
