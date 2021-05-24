package TwoDArray;
import java.util.Scanner;


public class UserDefinedMatrixSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start");
		
		int matrixAobj[][] =  UserInputA();
		int matrixBobj[][] = UserInputB();
		
		int sumRow = matrixAobj.length;
		int sumColumn = matrixBobj[0].length;
		
		int sumMatrix[][] = new int[sumRow][sumColumn];

		for(int i=0; i<sumRow; i++) {
			for(int j=0; j<sumColumn; j++) {
				sumMatrix[i][j]= matrixAobj[i][j]+ matrixBobj[i][j];
				
			}
			
		}
		
		for(int row[] :sumMatrix) {
			for(int col:row) {
				System.out.print(col + " ");
				
			}
			System.out.println();
		}
		
		
	}
	
	public static int[][] UserInputA(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For Matrix A Start");
		
		System.out.println("Enter length of row for matrix A");
		int Arow = sc.nextInt();
		
		System.out.println("Enter length for column for matrix A");
		int Acolumn = sc.nextInt();
		int matrixA[][] = new int[Arow][Acolumn];
		
		for(int i=0; i<Arow; i++) {
			for(int j=0; j<Acolumn; j++) {
				System.out.println("Please Enter value for Matrix A at position A["+i+"]["+j+"]");
				matrixA[i][j] = sc.nextInt();
			}
		}
		return matrixA;
	} // end of function matrix A#
	
	
	public static int[][] UserInputB(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For Matrix B Start");
		
		System.out.println("Enter length of row for matrix B");
		int Brow = sc.nextInt();
		
		System.out.println("Enter length for column for matrix B");
		int Bcolumn = sc.nextInt();
		int matrixB[][] = new int[Brow][Bcolumn];
		
		for(int i=0; i<Brow; i++) {
			for(int j=0; j<Bcolumn; j++) {
				System.out.println("Please Enter value for Matrix B at position B["+i+"]["+j+"]");
				matrixB[i][j] = sc.nextInt();
			}
		}
		return matrixB;
	} // end of function matrix B

}
