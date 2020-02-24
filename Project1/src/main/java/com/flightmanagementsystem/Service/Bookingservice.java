package com.flightmanagementsystem.Service;

import com.flightmanagementsystem.DTO.BookingDTO;

public interface Bookingservice 
{
	public int addBooking(BookingDTO dto) throws Exception;
	
	public BookingDTO modifyBooking(int uid);
	
	public BookingDTO viewBookingByBookingId(int uid);
	
	public BookingDTO viewBooking();
	
	public BookingDTO deleteBooking(int vid);
	
}