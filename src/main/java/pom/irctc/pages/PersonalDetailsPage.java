package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers{
     
	public PersonalDetailsPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public PersonalDetailsPage enterMiddleName(String middleName) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.MiddleName.Xpath"), middleName);
		return this;
	}
	
	public PersonalDetailsPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public PersonalDetailsPage clickOnSelectOccupation() {
		clickByXpath(prop.getProperty("PersonalDetailsPage.SelectOccupation.Xpath"));
		return this;
	}
	
	public PersonalDetailsPage clickToChooseSelectOccupation(String occupation) {
		clickByXpath(prop.getProperty("PersonalDetailsPage.ChooseSelectOccupation.Xpath"),occupation);
		return this;
	}
	
	public PersonalDetailsPage clickOnDOB() {
		clickByXpath(prop.getProperty("PersonalDetailsPage.DOB.Xpath"));
		return this;
	}
	
	public PersonalDetailsPage selectMonth(String month) {
		selectVisibleTextByXpath(prop.getProperty("PersonalDetailsPage.Month.Xpath"), month);
		return this;
	}
	
	public PersonalDetailsPage selectYear(String year) {
		selectVisibleTextByXpath(prop.getProperty("PersonalDetailsPage.Year.Xpath"), year);
		return this;
	}
	
	public PersonalDetailsPage clickOnDate(String date) {
		clickByXpath(prop.getProperty("PersonalDetailsPage.Date.Xpath"),date);
		return this;
	}
	
	public PersonalDetailsPage clickOnMartialStatus(String martialStatus) {
		clickByXpath(prop.getProperty("PersonalDetailsPage.MartialStatus.Xpath"),martialStatus);
		return this;
	}
	
	public PersonalDetailsPage selectCountry(String country) {
		selectVisibleTextByXpath(prop.getProperty("PersonalDetailsPage.Country.Xpath"), country);
		return this;
	}
	
	public PersonalDetailsPage clickOnGender(String gender) {
		clickByXpath(prop.getProperty("PersonalDetailsPage.Gender.Xpath"),gender);
		return this;
	}
	
	public PersonalDetailsPage enterEmail(String emailId) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.Email.Xpath"), emailId);
		return this;
	}
	
	public PersonalDetailsPage enterISD(String isd) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.ISD.Xpath"), isd);
		return this;
	}
	
	public PersonalDetailsPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.Mobile.Xpath"), mobile);
		return this;
	}
	
	public PersonalDetailsPage selectNationality(String nationality) {
		selectVisibleTextByXpath(prop.getProperty("PersonalDetailsPage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public AddressPage clickOnContinue() {
		clickByXpath(prop.getProperty("PersonalDetailsPage.Continue.Xpath"));
		return new AddressPage();
	}
}
