package TwoDArray;
import java.util.*;

public class Iteration1 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the rows");
			int rows= sc.nextInt();
			System.out.println("enter the columns");
			int columns= sc.nextInt();
			int route[][]= new int [rows][columns];
			
			
			for(int i=0; i<rows; i++) { //route.length
				for(int j=0; j<columns;j++) { //route[0]
					System.out.print("Enter the data at route["+i+"]["+j+"]");
					route[i][j]= sc.nextInt();
				}//end j loop
				
			}//end i loop
			for(int row[] : route) {
				for(int column: row) {
					System.out.print(column+ " ");
				}
				System.out.println();
			}
		}
}
