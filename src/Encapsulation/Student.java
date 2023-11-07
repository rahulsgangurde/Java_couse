package Encapsulation;

public class Student {

	String name;
	int age;
	String add;
	
	public Student (String name, int age, String add) {
		this.name= name;
		this.age=age;
		this.add= add;

}
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setage(int age) {
		this.age = age;
		
	}
	
	public void setage(String add) {
		
		this.add= add;
		
	}
	
	public String getname() {
		
		return name;
	}
	
	
	public int getage() {
		return age;	
	}
	
	public String getadd() {
		
		return add;	
	}
	
}

