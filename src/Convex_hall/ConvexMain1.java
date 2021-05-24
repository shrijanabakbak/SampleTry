package Convex_hall;

import java.util.Scanner;

public class ConvexMain1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of points you want to print: ");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		Coordinate1 point[]= new Coordinate1[size];
		for(int i=0; i<size;i++) {
			int x=(int) (Math.random()*100+1);
			int y= (int)(Math.random()*100+1);
			point[i]= new Coordinate1(x,y);			
			
			
			
			
		}
 
        ConvexHall1 gfw = new ConvexHall1();
        gfw.convexHull(point);
	}

}
