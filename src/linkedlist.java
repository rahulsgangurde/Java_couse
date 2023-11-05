import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
	LinkedList<String>list= new LinkedList<String>();{
		
		list.add("a");
		list.add("b");
		
		System.out.println(list);
		
		list.addLast("C");
		System.out.println(list);
		
		list.addFirst("D");
		
		System.out.println(list);
		
		list.add(2,"E");
		
		System.out.println(list);
		
		list.remove("b");
		
		System.out.println(list);
	}
	
	
	
	
	

	}

}
