package com.wipro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.wipro.bean.Employee;

public class EmployeeDAO {

	Connection con;
	PreparedStatement psInsert;
	public EmployeeDAO(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","wipro123");
			psInsert = con.prepareStatement("insert into emp_test values(?,?,?)");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public String insertEmployee(Employee emp){
		try{
		psInsert.setInt(1,emp.getEmpno());
		psInsert.setString(2,emp.getEname());
		System.out.println("date: "+emp.getHiredate().getTime());
		java.sql.Date sqlDate =
				new java.sql.Date(emp.getHiredate().getTime());
		psInsert.setDate(3,sqlDate);
		int res = psInsert.executeUpdate();
		if(res==1)
			return "success";
		else
			return "fail";
		}catch(Exception e){
			e.printStackTrace();
		}
		return "fail";
	}
}
