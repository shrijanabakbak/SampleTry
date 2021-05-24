import java.util.Scanner;

public class DiceRoll{ 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please select the dice you want to play");
		System.out.println("6 or 10");
		
		int choice = sc.nextInt();
		sc.close();
		
		int fin =gameStart(choice);
		if(fin==choice) {
			System.out.println("congts you won!! it is "+fin);
		}else {
			System.out.println("sorry you lose the game you got " + fin);
		}
	}
	public static int gameStart(int x) {
		int ranInt	=roll(x);
		System.out.println("random number is "+ ranInt);
		int i=1;
		while(ranInt!=x) { 
			ranInt = roll(x); 
				if(ranInt==x/2) {
					System.out.println("you got :"+ ranInt);
						break;
				}
			System.out.println(i+" Draw "+ranInt);
			i++;	
		}
		return ranInt;
		
	}
	
	public static int  roll(int x){
		int randomInt =  (int) (Math.random()* x +1);
		return randomInt;
		
	}
	
}

//import java.util.Scanner; 
//public class DiceRoll {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner (System.in);
//        System.out.println("Select a dice in between 6 & 10");
//        int val= sc.nextInt();
//        if (val==6){
//                  double randomint= Math.random();
//                  randomint = randomint * 6;
//                  int randomFace= (int) randomint;
//                  randomFace = randomFace + 1;
//                  if (randomFace == 6) {
//                      System.out.println("Congratulations!! You won !!");
//                  } else if (randomFace == 3) {
//                      System.out.println("OPPS!! You lose !!");
//                  } else {
//                      System.out.println("Keep going ");
//                  }
//                        
//        }else if(val==10){
//                  double randomint= Math.random();
//                  randomint = randomint * 10;
//                  int randomFace= (int) randomint;
//                  randomFace = randomFace + 1;
//                  if (randomFace == 10) {
//                      System.out.println("Congratulations!! You won !!");
//                  } else if (randomFace == 5) {
//                      System.out.println("OPPS!! You lose !!");
//                  } else {
//                      System.out.println("Keep going " + randomFace);
//                  }
//                  
//        
//    
//        }else {
//            System.out.println("Please, select a number among 6 and 10");
//        }
//
// 
//
//}
//}
