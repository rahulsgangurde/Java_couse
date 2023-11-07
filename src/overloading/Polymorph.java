package overloading;

public class Polymorph {

	public int multiply (int x, int y) {
		
		return (x*y);
		
	}
	
	public int multiply (int x, int y,int z) {
		return (x*y*z);
		
	
	}
	
	
	public double multiply (double x, double y) {
		return(x*y);
		
	}
	
	public static void main(String[] arg) {
		
		Polymorph demo = new Polymorph();
			
			System.out.println("new:" +demo.multiply(10, 20));
			System.out.println(demo.multiply(4.2,1.5));
			System.out.println(demo.multiply(5, 5, 5));
			
		}
	
}
