package com.wipro.bean;

public class Tester {
	public static void main(String[] args) throws InvalidEmployeeID {
		Employee e =new Employee(20,"subash",20);
		
		try {
			e.setAge(0);
		} catch (InvalidAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		e.setEmployeeID(0);
	}
}
