package com.wipro.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.wipro.bean.Department;
import com.wipro.dao.DepartmentDAO;
import com.wipro.util.DBConnection;

public class Tester {

	public static void main(String[] args) {
		
		
		//BConnection dbcon = new DBConnection();
		//dbcon.getConnection();
		
		DepartmentDAO dao = new DepartmentDAO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dept no");
		int deptno= sc.nextInt();
		System.out.println("Enter the Dept nmae");
		String deptname = sc.next();
		System.out.println("Enter the :Location");
		String deptloc = sc.next();
			
		Department dobj= new Department(deptno,deptname,deptloc);

		String res= dao.insertDepartment(dobj);
		System.out.println(res);

		ArrayList <Department> alist =dao.getDepartments();
		for(Department ob: alist)
			System.out.println(ob);
			}
}
