package TwoDArray;
import java.util.*;

public class Matrix2Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows for matrix A:");
		int rowsA=sc.nextInt();
		System.out.println("Enter the number of columns for matrix A:");
		int columnsA=sc.nextInt();
		System.out.println("Enter the number of rows for matrix B:");
		int rowsB=sc.nextInt();
		System.out.println("Enter the number of columns for matrix B:");
		int columnsB=sc.nextInt();
		int a[][]=SetData(rowsA,columnsA);
		int b[][]=SetData(rowsB,columnsB);
		int s[][]=Sum(a,b);
		Display(s);
	}
	public static int[][] SetData(int rows,int columns) {
		Scanner sc=new Scanner(System.in);
		int matrix[][]=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter the data at matrix["+i+"]["+j+"]");
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int row[]:matrix) { 
			for(int column:row) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
		return matrix;	
	}
	public static int[][] Sum(int a[][],int b[][]){
		int rows= a.length;
		int columns= a[0].length;
		int matrixSum[][]= new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrixSum[i][j]=a[i][j]+b[i][j];
			}
		}
		return matrixSum;
	}
	public static void Display(int matrixSum[][]){
		System.out.println("The sum of two matrices is: ");
		for(int row[]:matrixSum) {
			for(int col:row) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}
}
	
	
	

		
		
		