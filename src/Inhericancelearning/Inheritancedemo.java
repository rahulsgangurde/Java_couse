package Inhericancelearning;

 class Inheritancedemo {

	 public static void main (String[] arg) {
		 
		 Mountainbike mountainBike = new Mountainbike(10,20,30);
		 
		 System.out.println("gear is:  "+mountainBike.gear);
		 System.out.println("height is:  "+mountainBike.seatHeight);
		 System.out.println("speed is:  "+mountainBike.speed);
			
		 
		 mountainBike.applybreake(30);
		 System.out.println("speed after brakeis:  "+mountainBike.speed);
		 
	 }
	 
	
}
