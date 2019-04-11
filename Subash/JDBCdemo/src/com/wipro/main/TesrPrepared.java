package com.wipro.main;

import java.util.Scanner;

import com.wipro.bean.Department;
import com.wipro.dao.DepartmentDynamicDAO;

public class TesrPrepared {

	public static void main(String []args)
	{
		/* for tesing insert of three sets
		try
		{
			DepartmentDynamicDAO dao = new DepartmentDynamicDAO();
			Scanner sc= new Scanner(System.in);
			
			for(int i=0;i<3;i++)
			{
				System.out.println("Enter the Dept no");
				int deptno= sc.nextInt();
				System.out.println("Enter the Dept nmae");
				String deptname = sc.next();
				System.out.println("Enter the :Location");
				String deptloc = sc.next();
				Department ob= new Department(deptno,deptname,deptloc);
				String res=dao.insertDepartment(ob);
				System.out.println("insert of "+deptno+"was"+res);
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	*/
		try {
		
		    DepartmentDynamicDAO dao=    new DepartmentDynamicDAO();
			String result = dao.updateDepartment("CSE JPR", 63);
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        
	}
	
	
	
	
}
