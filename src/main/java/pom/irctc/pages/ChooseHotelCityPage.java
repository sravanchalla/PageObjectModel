package pom.irctc.pages;


import wrappers.GenericWrappers;

public class ChooseHotelCityPage extends GenericWrappers{
     
	public ChooseHotelCityPage enterCityOrHotelName(String destinationName) {
		enterByXpath(prop.getProperty("ChooseHotelCityPage.CityOrHotelName.Xpath"), destinationName);
		return this;
	}
	
	public ChooseHotelCityPage clickOnDestination() {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.Destination.Xpath"));
		return this;
	}
	
	public ChooseHotelCityPage waitTime() {
		waitProperty(4000);
		return this;
	}
	
	public ChooseHotelCityPage clickCheckInDate() {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckInDateField.Xpath"));
		return this;
	}
	
	public ChooseHotelCityPage clickOnselectYear() {
		clickByExplicitWait(prop.getProperty("ChooseHotelCityPage.selectYear.Xpath"), 10);
		return this;
	}  
	
	public ChooseHotelCityPage clickOnCheckInYear(String checkInYear) {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckInYear.Xpath"),checkInYear);
		return this;
	}  
	
	 public ChooseHotelCityPage clickOnCheckInMonth(String checkInMonth) {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckInMonth.Xpath"),checkInMonth);
		return this;
	}
	
	public ChooseHotelCityPage clickOnCheckInDate(String checkInDate) {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckInDate.Xpath"),checkInDate);
		return this;
	}
	
/*	public ChooseHotelCityPage clickCheckOutDate() {
		clickByExplicitWait("//label[text()='Check-out Date']/following-sibling::input", 10);
		return this;
	}     */
	
	public ChooseHotelCityPage clickCheckOutDate() {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckOutDateField.Xpath"));
		return this;
	} 
	
	public ChooseHotelCityPage clickOnCheckOutYear(String checkOutYear){
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckOutYear.Xpath"),checkOutYear);
		return this;
	}
	
	public ChooseHotelCityPage  clickOnCheckOutMonth(String checkOutMonth) {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckOutMonth.Xpath"),checkOutMonth);
		return this;
	}
	
	public ChooseHotelCityPage clickOnCheckOutDate(String checkOutDate) {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.CheckOutDate.Xpath"),checkOutDate);
		return this;
	}
	
	public ChooseHotelCityPage clickOnRoomAndGuest() {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.RoomAndGuest.Xpath"));
		return this;
	}
	
	public ChooseHotelCityPage selectGuestAs3() {
		selectVisibleTextByXpath(prop.getProperty("ChooseHotelCityPage.GuestAs3.Xpath"), "3");
		return this;
	}
	
	public ChooseHotelCityPage clickOnDone() {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.Done.Xpath"));
		return this;
	}
	
	public HotelsListPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.FindHotel.Xpath"));
		return new HotelsListPage();
	}
	
	
	
	
	
	
}
