package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	
	Set<String> s = new HashSet<String>();// C
	// set ==> no duplicates allowed 
	// interface ref = new Class_implementing_interface();
	//<datatype>
	s.add("kumar");// 
	s.add("kumar");
	s.add("kumar");
	System.out.println(s.size());//
	
}
}
