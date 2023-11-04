
public class switch_class {

	public static void main(String[] args) {
		
		int month=56;
		String months;
		
		switch(month){
			case 1: 
				months="Jan";
			break;
			case 2: 
				months="Feb";
			break;
			case 3: 
				months="mar";
			break;
			case 4: 
				months="apr";
			break;
			case 5: 
				months="may";
			break;
			case 6: 
				months="Jn";
			break;
			
			case 7: 
				months="July";
			break;
			default:
				months="invalid";
			break;	
		}
		
		System.out.println(months);
		
	}

}
