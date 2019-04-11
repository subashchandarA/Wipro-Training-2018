package com.wipro.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.wipro.bean.Department;
import com.wipro.util.DBConnection;

public class DepartmentDAO {
	
	public String  insertDepartment(Department depart){
	
		try
		{		
		DBConnection o =new DBConnection();
		Connection con =o.getConnection();
		
		Statement st = con.createStatement();
		String str="insert into dept values("+depart.getDeptno()+",'"+depart.getDname()+"','"+depart.getLoc()+"')";
		int result = st.executeUpdate(str);		
				
		if(result == 1 )
			System.out.println("Success ");
		else
			System.out.println("Fail");
		
		}
		catch (Exception e){
		      e.printStackTrace();	
		}
			return " ";
}
	
	public Department getDepartment (int deptno){
		Department dobj = null;
		try
		{		
		DBConnection o =new DBConnection();
		Connection con =o.getConnection();
		Statement st = con.createStatement();
		
		String qry="select * from dept where deptno = "+deptno ;
		
		ResultSet rs = st.executeQuery(qry);		
		
		if(rs.next())
		{	int dno=rs.getInt("deptno");
		    String dname = rs.getString(2);
		    String loc= rs.getString(3);
		    dobj = new Department(dno,dname,loc);
 		}
		}
		catch (Exception e){
		      e.printStackTrace();	
		}
		return dobj;
	}
	public ArrayList<Department> getDepartments (){
		ArrayList<Department>  al = new ArrayList<Department>();
		try
		{		
		DBConnection o =new DBConnection();
		Connection con =o.getConnection();
		Statement st = con.createStatement();
		
		String qry="select * from dept";
		
		ResultSet rs = st.executeQuery(qry);		
		
		while(rs.next())
		{	Department dobj;
			int dno=rs.getInt(1);
		    String dname = rs.getString(2);
		    String loc= rs.getString(3);
		    dobj = new Department(dno,dname,loc);
		    al.add(dobj);	    
		    
 		}
		}
		catch (Exception e){
		      e.printStackTrace();	
		}
		return al;
	}
	
	
}	
