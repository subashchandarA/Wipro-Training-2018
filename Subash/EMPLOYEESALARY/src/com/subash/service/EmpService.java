package com.subash.service;

import com.subash.bean.Employee;
import com.subash.exception.NullObjectException;

public class EmpService {
	public double calculateSalary(Employee empObj) {
		double newSalary;
		if(empObj.getGradePoint()>8)
			newSalary =empObj.getSalary()+empObj.getSalary()*0.25f;
		else
			if(empObj.getGradePoint() >5)
				newSalary = empObj.getSalary()+empObj.getSalary()*0.15f;
			else
				if(empObj.getGradePoint() >3)
					newSalary = empObj.getSalary()+empObj.getSalary()*0.10f;
				else
					newSalary = empObj.getSalary()+empObj.getSalary()*0.05f;
	 return newSalary;
		}
public void displayEmployee(Employee empObj)throws NullObjectException
{
	if(empObj == null )
	{
		NullObjectException e = new NullObjectException();
		throw e;
	}
	System.out.println("EMPLOYEE DETAILS");
	System.out.println("Name :"+empObj.getName()+" , Salary : "+empObj.getSalary());
		
}
}