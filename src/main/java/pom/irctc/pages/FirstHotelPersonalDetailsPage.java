package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FirstHotelPersonalDetailsPage extends GenericWrappers {
    
	public FirstHotelPersonalDetailsPage selectTitle(String title) {
		selectVisibleTextByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.Title.Xpath"), title);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage selectState(String stateName) {
		selectVisibleTextByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.State.Xpath"), stateName);
		return this;
	}
	
/*	public FirstHotelPersonalDetailsPage enterMobileNumber(String mobileNo) {
		enterByXpath("(//input[@name='mobileNo'])[2]", mobileNo);
		return this;
	}  
	
	public FirstHotelPersonalDetailsPage enterEmailId(String emailId) {
		enterByXpath("(//input[@name='email'])[2]", emailId);
		return this;
	}  */
	
	public FirstHotelPersonalDetailsPage selectGst(String gst) {
		selectVisibleTextByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.Gst.Xpath"), gst);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage getHotelName() {
		getTextByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.HotelName.Xpath"));
		return this;
	}
	
	public FirstHotelPersonalDetailsPage getHotelPrice() {
		getTextByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.HotelPrice.Xpath"));
		return this;
	}
	
	public FirstHotelPaymentPage clickOnContinueForGstNo() {
		clickByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.ContinueForGstNo.Xpath"));
		return new FirstHotelPaymentPage();
	}
	
	public FirstHotelPersonalDetailsPage enterGstNumber(String gstNo) {
		enterByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.GstNumber.Xpath"), gstNo);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage enterCompanyName(String companyName) {
		enterByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.CompanyName.Xpath"), companyName);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage enterCompanyAddress(String companyAddress) {
		enterByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.CompanyAddress.Xpath"), companyAddress);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage clickContinueForGstYes() {
		clickByExplicitWait(prop.getProperty("FirstHotelPersonalDetailsPage.ContinueForGstYes.Xpath"),10);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage verifyTextOfgstNumber(String text) {
		verifyTextContainsByXpath(prop.getProperty("FirstHotelPersonalDetailsPage.TextOfgstNumber.Xpath"), text);
		return this;
	}
	
	public FirstHotelPersonalDetailsPage waitTime() {
		waitProperty(1000);
		return this;
	}
	
	
}
