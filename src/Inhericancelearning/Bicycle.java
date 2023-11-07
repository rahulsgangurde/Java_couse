package Inhericancelearning;

class Bicycle {
	
	protected int gear;
	protected int speed;
	
	public Bicycle (int startspeed, int startgear ) {
		
		speed=startspeed;
		gear=startgear;
			
	}
	public void setgear(int newvalue) {
		gear= newvalue;
		
	}
	
	public void applybreake(int decrement) {
		speed -= decrement;
		
}
	public void removebreake(int increment) {
		speed += increment;
		
	}
}
		