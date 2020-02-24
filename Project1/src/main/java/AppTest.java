import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.flightmanagementsystem.DTO.BookingDTO;
import com.flightmanagementsystem.Service.BookingServiceImpl;

import junit.framework.TestCase;

public class AppTest extends TestCase 
{
	static BookingServiceImpl service;
	static BookingDTO dto;
	
	@BeforeAll
	public static void Add() {
		service = new BookingServiceImpl(); 
		dto = new BookingDTO();
		dto = new BookingDTO();
		dto.setUserId(1234);
		dto.setAge(21);
		dto.setGender("Female");
		dto.setFlight("Indigo");
	}

	@Test
	void testDeleteBooking() {
		dto.setBookingId(7567);
		HashMap<Integer,BookingDTO> hm=new HashMap<Integer,BookingDTO>();
		hm.put(dto.getBookingId(), dto);
		//dto.setListOfTheaters(hm);
		BookingDTO x = service.deleteBooking(dto.getBookingId());
		assertEquals(true, x);

	}
	
	
}
