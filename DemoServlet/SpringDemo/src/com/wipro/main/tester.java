package com.wipro.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.Employee;

public class tester {
public static void main(String[] args) {
	
//	Employee ob=new Employee(1111,"chandar");
//	ob.setEmpId(101);
//	ob.setEmpName("suabsh");
//	System.out.println(ob);
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	Employee o=(Employee) ac.getBean("emp");
	System.out.println(o);
	
	
}
	
	
	
}
