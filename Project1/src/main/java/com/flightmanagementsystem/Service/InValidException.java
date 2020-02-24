package com.flightmanagementsystem.Service;

public class InValidException extends Exception
{
	public InValidException(String excp)
	{
		System.out.println(excp);
    }
}