import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>(5);
		
		boolean r= hashSet.add("B");
		System.out.println(r);
		
		boolean g= hashSet.add("B");
		
		System.out.println(g);
		
		hashSet.add("J");
		hashSet.add("N");
		

		System.out.println(hashSet);
		
		
		
		System.out.println("set contains b or not: " + hashSet.contains("B"));
		
		hashSet.remove("J");
		
		System.out.println("set after removing j: " + hashSet);
		
		for (String num:hashSet) {
			
			System.out.println("Print values:" + num );
		}
		
	}

}
