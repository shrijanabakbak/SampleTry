package array;

import java.util.Scanner;

public class binary_decimal {
	
	public static int Conversion(int array[]) {
		int number = 0;
		int multiplier=4;
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) {
				number+=multiplier;	
			}else {
				number+=0;
			}
			multiplier/=2;
		}
		return number;
	}
	
	
	
//	public static void main (String[]args) {
//	Scanner obj=new Scanner(System.in);
//	System.out.println("Enter the size of the array::");
//	int size=obj.nextInt();
//	int array[] =new int[size];
//    System.out.println("Enter the data inside array::");
//	
//	for(int i=0; i<size;i++) {
//		array[i]=obj.nextInt();
//	}
//	
//	System.out.println("Actual array is::");
//	for(int j:array) {
//		System.out.print(j+ ",");
//	}
	
	

}
	
	


