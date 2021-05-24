//
//public class Finonnaci {
//	static int n1=0, n2=1, n3=0;
//	static void printFibo( int count) {
//		
//	}
//	public static void main(String[] args) {
//		int count=10;
//		System.out.println(" ");
//	}
//}

//------recursion relation-------
//tree method, master theorem, (back) substitution
// T(n)=T(n-1)+T(n-2)+c (c for constant time)
// t(n)=t(n-1)+t(n-1)+c (t-2) lai we can ignore since it runs 1 time less

//t(n)=2t(n-1)+c----------- eqn i
//putting n=n-1 in eqn i

//t(n-1)=2t(n-1-1)+c
//t(n-1)=2t(n-2)+c)

//putting value of t in eqn i
//t(n)=2*2t(n-2)+c
//t(n)=4t(n-2)+c-------eqn ii
//t(n-2)=2t(n-2-1) + c 
//t(n-2)=2t(n-3)+c

//putting value of t(n-2) in eqn ii
//t(n)=4*2t(n-3)+c+c
//t(n)=8t(n-3)+c----------eqn iii


//n=n-3 eqn 1
//t(n-3)=2t(n-3-1)+c
//t(n-3)=2t(n-3)+c
// putting value of t(n-3) in eqn iii

//t(n)=8*2t(n-4)+c+c
//t(n)=16t(n-4)+c

// for kth term
//t(n)=2^k(n-k)+c
// t(n)= 2^nt(n-n)+c
//t(n)= 2^nt(0)+c is the worst time complexity


public class Finonnaci{
	public static void main (String[] args) {
		int n1=0, n2=1, n3,i, count=10;
		System.out.println(n1+" "+n2);
		
		for (i=2; i<count; i++) {
			n3=n1+n2;
			System.out.println(" "+ n3);
			n1=n2;
			n2=n3;
		}
		
	}
}