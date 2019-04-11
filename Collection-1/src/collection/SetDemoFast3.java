package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoFast3 {
public static void main(String[] args) {
	
	char sal[] = { 'c','b','a'};

	//Set<Integer> s = new HashSet<Integer>();
	Set<Character> s = new TreeSet<Character>();
	
	for (int i = 0; i < sal.length; i++) {
		s.add(sal[i]);
	}
	
	System.out.println(s);	
	
	s.remove('c');
	//s.remove(3); // NOT WORKING
	Iterator<Character>  alldata = s.iterator();
	// alldata =     { a,b,c } 
	            //            ^   
	System.out.println(" printing all elements ");
	for(;alldata.hasNext(); )
	{
		System.out.println(alldata.next());
	}
	System.out.println(" printing all elements using for each loop");
	
	//for ( datatype   temp:  collection)
	for( Character t : s)
		System.out.println(t);
	
	System.out.println(" printing all elements using index");
	Object[] all= s.toArray();
	System.out.println(all[0]);
	System.out.println(all[1]);
	//System.out.println(all[2]);
	
	
}
	
}
