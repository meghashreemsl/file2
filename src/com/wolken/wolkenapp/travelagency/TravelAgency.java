package com.wolken.wolkenapp.travelagency;

import com.wolken.wolkenapp.agency.IMakeMyTrip;
import com.wolken.wolkenapp.agency.vrlImpl;

public class TravelAgency {
	
	IMakeMyTrip bus;
	
	public TravelAgency() {
		this.bus = new vrlImpl();
	}
	public void  acceptBooking() {
		
		boolean warranty = bus.warranty();
		
		if(warranty) {
			int bookings = bus.minbookings();
			if(bookings >0 && bookings > 15) {
				System.out.println("Bus booked succesfully!");
			}
			else {
				System.out.println("Bus not booked");
			}
		}
		else {
			System.out.println("No warranty avaialble");
		}
			
	}
	
}
