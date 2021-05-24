package array;

import java.util.Scanner;

public class mainbTod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digit binary number:");
		int array[]=new int[3];
//		array[0]=1;
//		array[1]=1;
//		array[2]=0;
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		binary_decimal bc= new binary_decimal();
		int eq=bc.Conversion(array);
		System.out.println("The decimal equivalent of the number is "+eq);
	}

}
