package constuctorinjava;

public class cuboid {


	int height();
	int width();
	int depth();
		
	cuboid (int height,int width,int depth){
		
		this.height=height;
		this.width= width;
		this.depth= depth;
	}
	
	cuboid (int height,int width,){
		
		this.height=height;
		this.width= width;
		this.depth= 10;
		
	}
	
	 cuboid(int dimensions){
		 
		    this.height=dimensions;
			this.width= dimensions;
			this.depth= dimensions;
		 
	 }
	 
	  cuboid(){
		  this.height= 10;
		  this.width 10;
		  this.depth= 10;
	  }
	 
	  
	 int volume() {
		 
		 return height*width*depth;
	 }
	 
	 
	 public static void main(String[] arg) {
		 
		 int volume;
		 
		 cuboid stdcuboid = new cuboid(10,20,30);
		 volume = stdcuboid.volume();
		 System.out.println("volume of stscuboid:" +volume);
		 
		 cuboid defaultstdcuboid = new cuboid(10,20);
		 volume = defaultcuboid.volume();
		 System.out.println("volume of defaultcuboid:" +volume);
		 
	 }
	 
	 
		
	
	
	
}
