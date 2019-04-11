package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemov2 {
public static void main(String[] args) {
	
	Set<String> s = new HashSet<String>();// C
	String x = "aaaabbbaa";
	// set ==> no duplicates allowed 
	// interface ref = new Class_implementing_interface();
	//<datatype>
	for (int i = 0; i < x.length(); i++) {
		s.add(x.charAt(i)+"");
	}
	System.out.println(s.size());//
	
}
}
