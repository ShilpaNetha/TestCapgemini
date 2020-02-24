package com.flightmanagementsystem.UI;

import java.math.BigInteger;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.flightmanagementsystem.DTO.BookingDTO;
import com.flightmanagementsystem.Service.BookingServiceImpl;
import com.flightmanagementsystem.Service.InValidException;

public class BookingUI 
{
	public static void main(String[] args) 
	{
		int a=1,b;
		String passengername;
		int age;
		String gender;
		BigInteger phoneno;
		BigInteger idNumber;
		int noOfPassengers;
		int userId;
		String bookingDate;
		String flight;
		String departureLocation;
		String destinationLocation;
		
		Scanner s = new Scanner(System.in);
		
		BookingServiceImpl serv = new BookingServiceImpl();
		
		while(a!=0)
		{
            System.out.println("1.addBooking");
			System.out.println("2.modifyBooking");
			System.out.println("3.viewBooking");
			System.out.println("4.viewAllBooking");
			System.out.println("5.deleteBooking");
			System.out.println("6.Exit");
			System.out.println("Enter Choice");
			b=s.nextInt();
			switch(b)
			{
			case 1:
			
				System.out.println("Enter your UserId");
				userId = s.nextInt();
				
				System.out.println("Number of Passengers");
				noOfPassengers = s.nextInt();

				int i;
				for(i=1;i<=noOfPassengers;i++)
				{
				System.out.println("Enter Name");
				passengername = s.next()+s.nextLine();

				System.out.println("Enter Age");
				age = s.nextInt();
				
				System.out.println("Gender");
				gender = s.next();
				
			    System.out.println("Enter phone number");
				phoneno = s.nextBigInteger();
				if(phoneno.toString().length()!=10) 
				try
		        {
				     s.nextLine();
				}
				catch (Exception e) 
			    {
				   System.err.println("The mobile number should contain 10 digits only");
				   s.nextLine();
			    }
				
				System.out.println("Enter Id number");
				idNumber = s.nextBigInteger();
				
				System.out.println("Enter the Flight");
				flight = s.next();
				
				System.out.println("Enter the Departure Date");
				bookingDate = s.next();
				
				System.out.println("Enter the Departure location");
				departureLocation = s.next();
				
				System.out.println("Enter the Destination location");
				destinationLocation = s.next();
				
				BookingDTO dto = new BookingDTO(userId, noOfPassengers, passengername, gender, age,  phoneno, idNumber, flight, bookingDate, 
						departureLocation, destinationLocation);	
				
				System.out.println(i+"Ticket has been succesfully booked.");
				
				try 
				{
					int r= serv.addBooking(dto);
					System.out.println(passengername+ " your BookingId is " +r);
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
				}
				break;
			
			case 2:

				   System.out.println("Enter the bookingId");
					int bid = s.nextInt();
					BookingDTO dto1 = new BookingDTO();
		
					int e; 
					
		     		System.out.println("Which details are to be modified");
					System.out.println("1.passengername");
					System.out.println("2.age");
					System.out.println("3.gender");
					System.out.println("4.phoneno");
					System.out.println("5.Idnumber");
					System.out.println("6.No of Passengers");
					System.out.println("7.Flight");
					System.out.println("8.Departure Date");
					System.out.println("9.Departure Location");
					System.out.println("10.Destination Location");
					e=s.nextInt();		
			    	switch(e)
					{
					 case 1:
						System.out.println("Enter Name");
						passengername = s.next()+s.nextLine();
	                    dto1.setPassengername(passengername);
						break;
					 
					 case 2:
						System.out.println("Enter Age");
						age = s.nextInt();
						dto1.setAge(age);
						break;
					
					 case 3:
						System.out.println("Gender");
						gender = s.nextLine();
						dto1.setGender(gender);
						break;
						
					 case 4:
						System.out.println("Enter phone number");
						phoneno = s.nextBigInteger();
						dto1.setPhoneno(phoneno);
						
						if(phoneno.toString().length()!=10)
						{
							 try 
							 {
								throw new InValidException("Invalid Number");
							 }
							 catch (InValidException x) 
							 {
								System.out.println(x);
							 }
						}
						break;
						
					 case 5:
						System.out.println("Enter Id number");
						idNumber = s.nextBigInteger();
	                    dto1.setIdNumber(idNumber);
	    				
						break;
						
					case 6:
						 System.out.println("Enter the number of passenegers");
						 noOfPassengers = s.nextInt();
						 dto1.setNoOfPassengers(noOfPassengers);
						 
					     break;
					     
					case 7:
						System.out.println("Enter the Flight Name");
						flight = s.next();
						dto1.setFlight(flight);
						
						break;
						
					case 8: 
						System.out.println("Enter the Departure Date");
						bookingDate = s.next();
						dto1.setBookingDate(bookingDate);
						
						break;
						
					case 9:
						System.out.println("Enter the Departure Location");
						departureLocation = s.next();
						dto1.setDepartureLocation(departureLocation);
						
						break;
						
					case 10:
						System.out.println("Enter the Destinatin Location");
						destinationLocation = s.next();
						dto1.setDestinationLocation(destinationLocation);
						
						break;
					}
					System.out.println("Details has been successfully modified");
				    
					 break;
				
			case 3:
				
				System.out.print("Enter Your BookingId : ");
				int uid=s.nextInt();
				 try 
				 {
					  BookingDTO y = serv.viewBookingByBookingId(uid);
					  
					  if(y.getBookingId()==uid)
					  {
					  System.out.println("Booking Details : UserId = " +y.getUserId()+ " Passengername = " +y.getPassengername()+ " Gender = " +y.getGender()+ 
							  " Age = " +y.getAge()+ " Phoeneno = " +y.getPhoneno()+ " IdNumber = " +y.getIdNumber()+ " Flight = " +y.getFlight()+ 
							  " Departure Date = " +y.getBookingDate()+ " Departure Location = " +y.getDepartureLocation()+ 
							  " Destination Location = " +y.getDestinationLocation());
					  }
					  else{
							System.out.println("Sorry No details Found...");
						}
				 }
					  catch(Exception y) 
				      {
						  System.out.println("ERROR 404");
					  }
			    break;
			
			case 4:
				 
			    serv.viewBooking();
				   
	        break;
			
			case 5: 
				System.out.println("enter the bookingId to delete the ticket details");
				int vid = s.nextInt();
				 try {
					  BookingDTO z = serv.deleteBooking(vid);
					  if(z.getBookingId()==vid)
					  {
					  System.out.println(vid+"booking details are deleted succesfully");
					  }
					  else{
							System.out.println("Sorry No details Found...");
						}
				 }
					  catch(Exception z) {
						  System.out.println("ERROR 404: BookingId not found");
					  }
			    break;
			    
			case 6: 
				System.exit(0);
				
				break;
			
			}
	    }
	}
}