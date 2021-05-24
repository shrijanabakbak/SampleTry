//
//public class If_Statement1 {
//	public static void main(String[] args) {
//		int year=2020;
//		if (year%4==0 && year%400==0 || year%100 !=0) {
//			System.out.println("It is leap year");
//		}else {
//			System.out.println("comman year");
//				
//			}
//	} 
//		
//	}
//	
//above program using ternary operators(?:)
public class If_Statement1{
	public static void main(String[] args) {
		int num=13;
		String output=(num%2==0)?"even number":"odd number";
		System.out.println(output);
		
	}
}