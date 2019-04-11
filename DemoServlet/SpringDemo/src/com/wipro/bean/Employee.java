package com.wipro.bean;

public class Employee {

   int empId;
   String empName;
   Address address;
   
   
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, Address address) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}

	
 
}
