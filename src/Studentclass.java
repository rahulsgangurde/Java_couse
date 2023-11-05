
public class Studentclass {

	
		
		String name;
		int age;
		String add;
		
		public Studentclass(String name, int age, String add) {
			this.name= name;
			this.age=age;
			this.add= add;
			
		}
		
		public static void main(String[] args) {
			
		Studentclass Student = new Studentclass("John",25,"Nashik");
		
		System.out.println("name: " +Student.name);
		System.out.println("age: " +Student.age);
		System.out.println("add: " +Student.add);
	}

}
