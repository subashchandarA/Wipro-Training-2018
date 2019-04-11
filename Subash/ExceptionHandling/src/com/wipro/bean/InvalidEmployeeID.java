package com.wipro.bean;

public class InvalidEmployeeID extends Exception {

	public String toString(){
		return ("Invalid Employee Id , should be greater than zero");
	}
	
}
