package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<String,String>();
	//  1----> Amitabh
	// 2----> Hritik
	//  key -is mapped to-> Value
	// key is a String; 	// value is a Sstring
	hm.put("1", "Amitabh");
	hm.put("2", "Hritik");
	// KEY--> 1st Column
	// Value==> 2nd Column
	// Key is Mapped to Value
	System.out.println("hm.containsKey(1) ="+hm.containsKey("1")); //
	System.out.println("hm.get(1)"+hm.get("1"));
	System.out.println(" printing all the values ");
	//loop a Map
	// enhanced for loop
		// datatype         t       :  collection
	for (Map.Entry<String, String> entry : hm.entrySet()) {
		System.out.println("Key : " + entry.getKey() +
				" ----> Value : " + entry.getValue());
	}

	
}


}
