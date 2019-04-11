package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoFast2 {
public static void main(String[] args) {
	
	int sal[] = { 11,12,3,1,1,1,2,3,4,5};

	//Set<Integer> s = new HashSet<Integer>();
	Set<Integer> s = new TreeSet<Integer>();
	
	for (int i = 0; i < sal.length; i++) {
		s.add(sal[i]);
	}
	System.out.println(s);	
	
}
	
}
