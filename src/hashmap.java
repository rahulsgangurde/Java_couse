import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap <String,Integer> map =new HashMap<>();
		
		map.put("Rahul", 45);
		map.put("Virat", 18);
		map.put("Rohit", 5);
		map.put("Rohit", 5);

		
		System.out.println("Map is:" + map.size());
		
		System.out.println("Map is:" + map);
		
		if(map.containsKey("Rohit")) {
			
			Integer rohit =map.get("Rohit");
			
		System.out.println( "the vale of map:"  + rohit  );
			
		for (String key : map.keySet()) {
			
			System.out.println("Key: "+key+" , value:"  +map.get(key));
			
		
		}
			
			
		}
		
		}
		
		
		
	}

}
