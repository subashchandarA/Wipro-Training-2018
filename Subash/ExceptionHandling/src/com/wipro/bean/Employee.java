package com.wipro.bean;

public class Employee {
	private int employeeID;
	private String employeeName;
	private int age;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID)throws InvalidEmployeeID {
		
		if(employeeID>0)
			this.employeeID = employeeID;
		else
		{
			InvalidEmployeeID e = new InvalidEmployeeID();
			throw (e ); 
		}
		
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age)throws InvalidAgeException {
		
		if(age>=18 && age <=58)
			this.age=age;
		else {
			InvalidAgeException e= new InvalidAgeException("error in setage -");		
			throw(e); 
				}
		    
	}
	public Employee(int employeeID, String employeeName, int age) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.age = age;
	}
	

}
