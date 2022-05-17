package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsListPage extends GenericWrappers {
    
	public HotelsListPage getNameOfFirstHotel() {
		getTextByXpath(prop.getProperty("HotelsListPage.NameOfFirstHotel.Xpath"));
		return this;
	}
	
	public HotelsListPage getPriceOfFirstHotel() {
		getTextByXpath(prop.getProperty("HotelsListPage.PriceOfFirstHotel.Xpath"));
		return this;
	}
	
	public FirstHotelPage clickOnFirstHotel() {
		clickByExplicitWait(prop.getProperty("HotelsListPage.FirstHotel.Xpath"), 10);
		return new FirstHotelPage();
	}
	
}
