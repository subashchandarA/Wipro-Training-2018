import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class ArrayListDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList arrayList = new LinkedList();
		arrayList.add(23);
		arrayList.add("subash");
		arrayList.add(25);
         
//		ArrayList al= new ArrayList();
//		al.add("kjdsf");
//		al.add("ayyappan");
//		arrayList.add(al);
		
		arrayList.add(2,"newval");
		arrayList.add(10);
                
		//System.out.println(arrayList);
		///arrayList.remove(1); 
		//System.out.println(arrayList);
	 
		ListIterator it = arrayList.listIterator(2); 
        
		while (it.hasNext())
		{
			//	it.remove();
			System.out.println(it.next());
			//it.remove();
			//System.out.println(it.next());
		}
		System.out.println("after first iteration");
		
		
		
		
		
		
	}

}
