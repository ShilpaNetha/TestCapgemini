package com.flightmanagementsystem.DAO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.flightmanagementsystem.DTO.BookingDTO;

public class BookingDAOImpl implements BookingDAO
{
	static HashMap<Integer,BookingDTO> hm=new HashMap<Integer,BookingDTO>();
	
	public int addBooking(BookingDTO dto) 
	{
        hm.put(dto.getBookingId(),dto);
		int bookingId=dto.getBookingId();
		//hm.containsKey(bookingId));
		return bookingId;
    }
	
	public int modifyBooking(int bookingId)
	{
		BookingDTO dto = new BookingDTO();
		BookingDTO k;
		if(hm.containsKey(bookingId))
		{
			k = hm.replace(bookingId,dto);
			
		return bookingId;
		}
		return bookingId;
	}

	public BookingDTO viewBookingByBookingId(int bookingId) 
	{
		BookingDTO y = new BookingDTO();
		if(hm.containsKey(bookingId))
		{
			y = hm.get(bookingId);
			return y;
		}
        else
        {
		return y;
	    }
	}
	public BookingDTO viewBooking()
	{
	  Set<Entry<Integer,BookingDTO>> setOfEntries = hm.entrySet();
	
	  Iterator<Entry<Integer,BookingDTO>> itr = setOfEntries.iterator();
    
      for(Entry<Integer,BookingDTO> entry : setOfEntries)
      {
        System.out.println("BookingId : "+entry.getKey() +" "+ "Details : "+entry.getValue());
	  }
	return null;
    }

	public BookingDTO deleteBooking(int bookingId) 
	{
		BookingDTO z = new BookingDTO();
		if(hm.containsKey(bookingId))
		{
			z = hm.remove(bookingId);
			return z;
		}
        else
        {
		return z;
        }
	}
}