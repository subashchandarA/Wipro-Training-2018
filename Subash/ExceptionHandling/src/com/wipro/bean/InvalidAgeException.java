package com.wipro.bean;
public class InvalidAgeException extends Exception {

	public String toString()
	{
		return ("Invalid age , within toString");
	}

	public InvalidAgeException(String message){
		super(message);	
	}
	public InvalidAgeException(){
		super("Invalid Age from user defined exception msg");	
	}
	

}
