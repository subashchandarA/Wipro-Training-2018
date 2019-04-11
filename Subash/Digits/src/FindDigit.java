
import java.io.*;
import  java.util.*;

// Read only region start
class FindDigit
{

	public int digitSum(int input1){
		// Read only region end
		// Write code here...
			if(input1<10)
			 return input1;
		else
			return digitSum(findsum(input1));			
		
	}
   public int findsum(int num)
   {
	   int rem;
	   rem = num % 10;
	   num = num / 10;
	   if(num < 10)
		   return rem + num;
	      else 
		   return rem + findsum(num);  
   }


}