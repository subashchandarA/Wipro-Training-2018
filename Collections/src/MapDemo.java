import java.util.HashMap;

import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("1", "Amitabh");
		hm.put("2", "Hritik");
		
		System.out.println("hm.containsKey(1) ="+hm.containsKey("1")); 
		System.out.println("hm.get(1)"+hm.get("1"));
		System.out.println(" printing all the values ");
				
		
		for (Map.Entry<String, String> entry: hm.entrySet()) {
			
			System.out.println("Key : " + entry.getKey() + 	" ----> Value : " + entry.getValue());
		}
	}
}
