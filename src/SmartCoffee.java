
import java.util.Scanner;
public class SmartCoffee {  //class name starts in uppercase
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // new allocates memory
	//class<obj nam>=new class();
		
		System.out.println("Enter the passcode:");
		int passcode = sc.nextInt(); //nextInt--->scanner class ko object lai call gareko
		sc.close();
		String coffeeType;
		
//		if(passcode==555) {
//			coffeeType="Expresso";
//			
//		}else if(passcode==312){
//			coffeeType="Drip coffee";
//		}else if(passcode==629) {
//			coffeeType="Black Coffee";
//		}else {
//			coffeeType="Unknown";
//		}
		
		switch(passcode) {
			case 555:
				coffeeType="Expresso";
				break;
			case 312:
				coffeeType="Vanilla Latte";
				break;
			case 629:
				coffeeType="Americano";
				break;
			default:
				coffeeType="Unknown";
				//break in this line is optional
			
		}
		System.out.println("you have ordered "+ coffeeType);
	}
}


// int   ===> sc.nextInt()
//double ===> sc.nextDouble()
//
