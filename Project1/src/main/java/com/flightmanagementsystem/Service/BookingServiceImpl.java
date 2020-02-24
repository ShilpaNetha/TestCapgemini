package com.flightmanagementsystem.Service;

import com.flightmanagementsystem.DAO.BookingDAOImpl;
import com.flightmanagementsystem.DTO.BookingDTO;

public class BookingServiceImpl implements Bookingservice
{
	int bookingId;
	BookingDAOImpl dao = new BookingDAOImpl();
	
	public int addBooking(BookingDTO dto) throws Exception
	{
		try 
		{
		   bookingId=dao.addBooking(dto);
		} 
		catch (Exception e) 
		{
		   System.out.println(e);
		}
		return bookingId;
	}
	
	public BookingDTO modifyBooking(int bid) 
	{
		bookingId=dao.modifyBooking(bid);
		return null;
	}
	
	public BookingDTO viewBookingByBookingId(int uid) 
	{
	    BookingDTO y = dao.viewBookingByBookingId(uid);
	    return y;
	}
	
	public BookingDTO viewBooking()
	{
		BookingDTO w = dao.viewBooking();
		return w;
	}
	
	public BookingDTO deleteBooking(int vid) 
	{
		BookingDTO z = dao.deleteBooking(vid);
		return z;
	}
}