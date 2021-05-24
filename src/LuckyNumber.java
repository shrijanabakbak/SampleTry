
public class LuckyNumber {
	public static void main(String[] args) {
		
		//random number 0 to almost 1
		double randomNumber = Math.random();
		
		System.out.println("Initial random number "+randomNumber);
		
		
		//changing the range 0 - almost 6
		randomNumber = randomNumber *6;
				
		System.out.println("Random number after changing the range "+ randomNumber);
		
		//casting
		int randomInt = (int) randomNumber;
		
		System.out.println("Random number after casting "+ randomInt);
		
	    //shifting the range by one
		randomInt= randomInt + 1;
		
		System.out.println("Final Random Number "+ randomInt);
	}
	
	
}

// lucky number bhanera function banaune n user input