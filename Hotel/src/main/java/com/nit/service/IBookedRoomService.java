package com.nit.service;

import java.util.List;

import com.nit.model.BookedRoom;

public interface IBookedRoomService {
	
	//for getting all bookedRoom
		List<BookedRoom> getAllBookings();
	
	//to get all booking by room id
	List<BookedRoom> getAllBookingsByRoomId(Long roomId);
	
	//for saving booking (to book the room)
	String saveBooking(Long roomId, BookedRoom bookingRequest);
	
	//to find booking by conformation code
	BookedRoom findByBookingConfirmationCode(String confirmationCode);
	
	//to get booking by useremail
	List<BookedRoom> getBookingsByUserEmail(String email);
	
	//delete bookings
		void cancelBooking(Long bookingId);

}
