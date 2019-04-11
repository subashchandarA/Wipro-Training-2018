package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.entity.Employee;

public class EmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO ob = new EmployeeDAO();
		ob.addEmployee();
		int id=1001;
		Employee e = ob.getEmployee(id);
		
		if(e!=null)
		{
		System.out.println(" Emp Name : " + e.getEmpName());
		}
		else
		{
			System.out.println("No such employee id :"+id);
		}
		
	}
    public void addEmployee()
    {
    	Configuration cfg= new Configuration();
    	SessionFactory sf= cfg.configure().buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	Transaction transcation = session.beginTransaction();
    	
    	Employee e=new Employee();
    //	e.setEmpNo(101);
    	e.setEmpName("subash");
    	e.setEmpGender('M');
    	e.setEmpSalary(20000.50);
    	e.setEmpDoj(new java.util.Date());
    	
    	session.save(e);
    	
    	Employee e2=new Employee();
    //	e2.setEmpNo(102);
    	e2.setEmpName("Chandar");
    	e2.setEmpGender('M');
    	e2.setEmpSalary(234000.50);
    	e2.setEmpDoj(new java.util.Date());
    	
    	session.save(e2);
    	   	
    	transcation.commit();
    //	session.close();
    	
    	
    }
	
	public Employee getEmployee(int eNo){
		
		Configuration config = new Configuration();
		SessionFactory sf =config.configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		Employee emp = (Employee)session.get(com.wipro.entity.Employee.class,eNo);
		
		session.close();
		return emp;
		
	}
	
	
}
