package com.flightmanagementsystem.DAO;

import com.flightmanagementsystem.DTO.BookingDTO;

public interface BookingDAO 
{
	public int addBooking(BookingDTO dto);
	
	public int modifyBooking(int bookingId);
	
	public BookingDTO viewBookingByBookingId(int bookingId);
	
	public BookingDTO viewBooking();
	
	public BookingDTO deleteBooking(int bookingId);
	
}