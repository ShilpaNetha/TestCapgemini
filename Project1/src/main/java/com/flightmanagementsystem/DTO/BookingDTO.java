package com.flightmanagementsystem.DTO;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Random;

public class BookingDTO implements Serializable
{
	private int bookingId;
	int userId;
	String bookingDate;
	//double ticketCost;
	String flight;
	private int noOfPassengers;
	private String passengername;
	private String gender;
	private int age;
	private BigInteger phoneno;
	private BigInteger idNumber;
	private int p;
	private String departureLocation;
	private String destinationLocation;
	
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public int getBookingId() { 
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	/*public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}*/
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigInteger getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(BigInteger phoneno) {
		this.phoneno = phoneno;
	}
	public BigInteger getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(BigInteger idNumber) {
		this.idNumber = idNumber;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	
public BookingDTO( int userId, int noOfPassengers, String passengername, String gender, int age, BigInteger phoneno,
		BigInteger idNumber, String flight, String bookingDate, String departureLocation, String destinationLocation) {
	super();
	Random r = new Random();
	
	this.noOfPassengers = noOfPassengers;
	this.bookingId = r.nextInt(9999);
	this.passengername = passengername;
	this.gender = gender;
	this.age = age;
	this.phoneno = phoneno;
	this.idNumber = idNumber;
	this.bookingDate = bookingDate;
	this.flight = flight;
	this.userId = userId;
	this.departureLocation = departureLocation;
	this.destinationLocation = destinationLocation;
}
@Override
public String toString() {
	return "BookingDTO [userId=" + userId + ", bookingDate=" + bookingDate + ", flight=" + flight + ", noOfPassengers="
			+ noOfPassengers + ", passengername=" + passengername + ", gender=" + gender + ", age=" + age + ", phoneno="
			+ phoneno + ", idNumber=" + idNumber + ", departureLocation=" + departureLocation
			+ ", destinationLocation=" + destinationLocation + "]";
}
public BookingDTO() {
	super();
}


}
	
