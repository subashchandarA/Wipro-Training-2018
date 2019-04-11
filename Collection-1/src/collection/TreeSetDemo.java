package collection;
import java.util.*;
public class TreeSetDemo {
public static void main(String[] args) {
	// interface ref = new Class_implementing_interface();
	SortedSet<String> x = new TreeSet<String>();
	
	// 
	x.add("mi");
	x.add("nokia");
	x.add("samsung");
	x.add("asus");
	x.add("lenova");
	
	
	System.out.println(x.contains("motorola"));
	// loop 
for( Iterator<String> alldata = x.iterator();  alldata.hasNext(); )
{
		Object v= alldata.next();
		System.out.println(v);
}

//for (Iterator iterator = x.iterator(); iterator.hasNext();) {
//	String string = (String) iterator.next();
	
//}
	
	
	
}
}
