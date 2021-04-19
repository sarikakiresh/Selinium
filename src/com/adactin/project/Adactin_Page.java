package com.adactin.project;

public class Adactin_Page extends Adactin_Base {

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");

		getUrl("http://adactinhotelapp.com/");

		Login_Page login = new Login_Page(driver);

		inputvalueElement(login.getUsername(), "sarika14");
		inputvalueElement(login.getPassword(), "sarika@2014");
		clickonelement(login.getLogin());

		Home_Page home = new Home_Page(driver);

		dropdown(home.getLocation(), "byvalue", "Melbourne");
		dropdown(home.getHotels(), "byvalue", "Hotel Cornice");
		dropdown(home.getRoomtype(), "byvalue", "Super Deluxe");
		dropdown(home.getRoomnos(), "byvalue", "4");
		clear(home.getDateinset());
        inputvalueElement(home.getDateinset(),"20/01/2021");
        clear(home.getDateoutset());
        inputvalueElement(home.getDateoutset(), "24/01/2021");
        inputvalueElement(home.getAdultsperroom(), "4");
        inputvalueElement(home.getChildrenperroom(), "4");
        clickonelement(home.getSubmit());
        thread();
        
        Check_Boxpage checkbox = new Check_Boxpage(driver);
        
        clickonelement(checkbox.getCheck_box());
        clickonelement(checkbox.getSubmit());
        
        Book_Hotelpage booking = new Book_Hotelpage(driver);
        
        inputvalueElement(booking.getFirstname(), "Sarika");
        inputvalueElement(booking.getLastname(), "B");
        inputvalueElement(booking.getAddress(), "12,midtown,california");
        inputvalueElement(booking.getCc(), "01234567890123456");
        dropdown(booking.getCctype(), "byvalue", "VISA");
        dropdown(booking.getCcmonth(), "byindex", "5");
        dropdown(booking.getCcyear(), "byvisibletext", "2017");
        inputvalueElement(booking.getCvv(), "201");
        clickonelement(booking.getBooknow());
        thread();
        thread();
        
        Booking_Confirmation confirm= new Booking_Confirmation(driver);
        clickonelement(confirm.getMyitinerary());
        Booked_Itinerary logout = new Booked_Itinerary(driver);
        clickonelement(logout.getLogout());
        
        
	};

}
