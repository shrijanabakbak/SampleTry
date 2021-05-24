package TwoDArray;

public class Iteration {
	public static void main(String[] args) {
		int route[][]= {{3,5,6,7,8},{5,6,7,8,10},{2,3,4,5,8}};
		int rows=route.length;
//		System.out.println(rows);
		int columns=route[0].length;
//		System.out.println(columns);
		
		for(int i=0; i<rows; i++) { //route.length
			for(int j=0; j<columns;j++) { //route[0].length
				System.out.print(route[i][j] + " ");
//				System.err.print(columns+ " ");
			}
			System.out.println();
			
		}
	
	}

}
