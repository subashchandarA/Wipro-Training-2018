package collection;

import java.util.Hashtable;
import java.util.Map;

public class MapDemoV2 {
public static void main(String[] args) {
	Hashtable<String,String> hm=new Hashtable<String,String>();
	hm.put("Amitabh", "1");
	hm.put("Hritik", "2");
	hm.put("Kareena", "3");
	hm.put("Amir", "4");
	hm.put("Anushka", "5");
	// KEY--> 1st Column
	// Value==> 2nd Column
	// Key is Mapped to Value
	System.out.println(hm.containsKey("Amir"));
	System.out.println(hm.containsValue("BigB"));
	System.out.println(hm.get("Amitabh"));
	System.out.println(" printing all the values ");
	//loop a Map
	//
	for (Map.Entry<String, String> entry : hm.entrySet()) {
		System.out.println("Key : " + entry.getKey() +
				" Value : " + entry.getValue());
	}

	
}


}
