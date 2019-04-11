package com.subash.bean;

public class Employee {
	static int ID =0;
	int empId;
	float salary;
	String name;
	int gradePoint;
	
	public int getGradePoint() {
		return gradePoint;
	}
	public void setGradePoint(int gradePoint) {
		this.gradePoint = gradePoint;
	}
	public static int getID() {
		return ID;
	}
	public static void setID(int iD) {
		ID = iD;
	}
	public Employee(int empId, float salary, String name) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
