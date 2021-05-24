import java.util.Scanner;
public class Studentmarks {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the marks obtained:");
		int marks= sc.nextInt();
		sc.close();
		String result;
		
//		if (marks<40) {
//			result="fail";
//		}else if (marks>=50 && marks<=70) {
//			result="first division";
//		}else if(marks>=70){
//			result="distinction";
//		}else {
//			result="unknown";
//		}
		  if (marks<=40)marks=1;
	      if (marks>=50 && marks<70)marks=2;
	      if (marks>=70)marks=3;
	      switch(marks) {
			case 1:
				result="Fail";
				break;
			case 2:
				result="First Division";
				break;
			case 3:
				result="Distinction";
				break;
			default:
				result="Invalid";
				
	      }	
			System.out.println("you got "+ result);
		
	}
	
}
