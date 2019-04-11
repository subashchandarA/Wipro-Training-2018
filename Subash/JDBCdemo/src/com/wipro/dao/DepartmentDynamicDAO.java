package com.wipro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wipro.bean.Department;
import com.wipro.util.DBConnection;

public class DepartmentDynamicDAO {

	Connection con =null;
	PreparedStatement psInsert=null;
    PreparedStatement psUpdate=null;
	
    
    public DepartmentDynamicDAO()throws SQLException {
		con = new DBConnection().getConnection();
		psInsert = con.prepareStatement("insert into dept values(?,?,?)");
		psUpdate = con.prepareStatement("update dept set loc=? where deptno=?");
	}
	public String updateDepartment(String loc,int deptno){
	try{
		psUpdate.setString(1,loc);
		psUpdate.setInt(2,deptno);
		int result = psUpdate.executeUpdate();
		if(result == 1)
			return "Update Success";
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return "update failed";
	}
	
	public String insertDepartment(Department obj){
		try{
			 psInsert.setInt(1, obj.getDeptno());
			 psInsert.setString(2, obj.getDname());
			 psInsert.setString(3,obj.getLoc());
			 int result = psInsert.executeUpdate();
			 if(result ==1)
				 return "success";
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return "fail";
	}
}
