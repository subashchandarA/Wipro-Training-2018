package com.wipro.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestCallable {

	public static void main(String[] args) {
		try{
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		    
			CallableStatement cs = con.prepareCall("{call updateDept(?,?)}");
		    cs.setString(1,"GNDC");
		    cs.setInt(2, 60);
		    cs.execute();
		    System.out.println("Procedure done");
		  }
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
