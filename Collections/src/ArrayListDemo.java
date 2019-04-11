import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		System.out.println("Size of List = " + list.size());
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");		
		
		System.out.println("Size of List after filling = " + list.size());
		
		list.remove("F");
		
		System.out.println("Size of List after removing an element = " + list.size());
		
		list.add(0, "F");
		
		for (String string : list) {
			
			System.out.println(string);
		}

	}

}
