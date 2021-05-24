//import java.lang.*;
//import java.util.*;
public class Prime {
	public int isPrime (int n){
		int flag=1;
		for (int i=2;i<=n/2;i++){
			if (n%i==0) {
				flag=0;  
				break;
			}
		}
		return flag;
			
	}
	
	public static void main (String[] args) {
		Prime a= new Prime();
		int flagval= a.isPrime(3);
		if (flagval==1) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
}


//	public int isPrime(int n) {
//		int flag=1;//False
//		for (int i=2; i<=Math.sqrt(n); i++) {
//		if(n%2==0) {
//			flag=0;
//			break;
//			}
//		
//		}
//		return flag;
//		
//	}
//		
//	public static void main (String[] args) {
//		Prime aobj= new Prime();
//		if (aobj.isPrime(11)==1) {
//			System.out.println("num is prime");
//		}else {
//			System.out.println("num is not prime");
//		}
//		
//		
//	}
//	}