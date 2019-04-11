package com.wipro.util;

import java.util.ArrayList;
import java.util.Collections;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1= new Person("Subash",123,'M',2);
		Person p2= new Person("Chandar",12,'F',25);
		Person p3= new Person("Ayyappan",49,'M',125);
		
	    /*System.out.println(p.getPersonAge()) ;
	    
	        
	    try {
	    	
	    	int age =-1;
		    if (age<0)
		    	throw new ArithmeticException("Age cannot be negative");
	    	p.setPersonAge(25);
			System.out.println(" The age of the person is : "+p.getPersonAge());
		} catch (Exception e) {
			
			System.out.println(e+ " The age is set to zero ");// TODO: handle exception
			p.setPersonAge(0);
		}
	    */
	    ArrayList<Person> al=new ArrayList<Person>();
	    
	    al.add(p1);
	    al.add(p2);
	    al.add(p3);
	    
	  //  Person p=al.get(0);
	   // System.out.println(p.getPersonName());
	    for(Person p: al)
	    	System.out.println(p.getPersonName());
	    Collections.sort(List<Person> al);
	    
	    
	}

}
