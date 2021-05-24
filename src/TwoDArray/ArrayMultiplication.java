package TwoDArray;

public class ArrayMultiplication {
	public static void main(String[] args) {
		int matrixA[][]= {{1,2,3},{4,5,6}};
		int matrixB[][]= {{1,2},{3,4},{5,6}};
		
		int rows= matrixA.length;
		System.out.println(rows  );
		int columns= matrixB[0].length;
		System.out.println(columns);
		
		
		int commonIndex= matrixB.length;
		System.out.println(commonIndex);
		int mul[][] = new int[rows] [columns];
		
		//multiplication logic
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				mul[i][j]=0; //sum=0
				for(int k=0; k<commonIndex; k++) {
				mul[i][j] += matrixA[i][k]*matrixB[k][j];
				}// k loop ends
			}//j loop ends
		}// i loop ends
		for(int row[]: mul) {
			for(int col: row) {
				System.out.println(col+" ");
				
			}
			System.out.println();
		}
		
	}
}
