package com.wipro.test;
	
public class Tester {
	public static void main(String[] args) {
 	try	{
 			int var1 =Integer.parseInt(args[0]);
 			int var2= Integer.parseInt(args[1]);
 			int res= var1/var2;
 			System.out.println(res);
 		}
 	catch(ArithmeticException e){
 		System.out.println("Please enter non zero value");
 	}
 	catch(NumberFormatException e){
 		System.out.println("Please enter only number ");
 	}
 	catch(ArrayIndexOutOfBoundsException e)
 	{
 		System.out.println("Array Out of  bound");
 		e.printStackTrace();
 	}
 	catch (Exception e){
 		System.out.println("General Error Occured"+e);
 		e.printStackTrace();
 	}
 	finally{
 		System.out.println("******** End of program **********");
 	}
 	
 	}

	
	
	
	
}
