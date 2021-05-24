
public class Control {
	
	public static void main (String[] args) {
		
		//if statement
		
		boolean isGreen = false
				;
		if(isGreen) {
			System.out.println("You can drive");
		}
		
		//variable scope
		if(isGreen) {
			double bikeSpeed = 40.55 ;//is in km/hr
			
			System.out.println("you can drive");
			
			System.out.println("your speed limit is:"+ bikeSpeed);
		}
		
		// if-else statement
		if(isGreen) {
			System.out.println("You can drive");
		
		}else{
			System.out.println("Stop");
		}
		
		
		//nested if statement along with operators
		int rating= 3;
		if(rating>0 && rating<=5) {
			if (rating<=2) {
				System.out.println("Reason Please");
			}
			
			
			
			System.out.println("Thankyou");
		}
		
	}
	
}
