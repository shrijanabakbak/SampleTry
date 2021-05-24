package array;
import java.util.*;

public class UserArray {
	
	public static void main(String[] args) {
		//take size of array frm user
		Scanner sc= new Scanner(System.in);
		System.out.println("please insert size of array");
		int n= sc.nextInt();
		//create array
		int distance[]= new int[n];
		
		//take input frm user into array
		for(int i=0; i<distance.length;i++) {
			System.out.println(distance.length);
			
			System.out.println("Insert the value for distance["+i+"]=");
			distance[i]= sc.nextInt();			
		}
		//display created array
		
		for(int j: distance) {
			System.out.println("our array value is :" +j);
		}
		
		
	}
}
