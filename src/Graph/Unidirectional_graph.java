package Graph;

public class Unidirectional_graph {
	int size=3;
	int matrix[][]=new int[size][size];
	
	
	
	void addEdge(int source, int destination ) { // defining function nodes bich connection dekhauna
		
			matrix[source][destination]=1;
		
	}
	
	void printMatrix() {
		System.out.println("priting graph as matrix");
		for(int i=0; i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void printEdges() {
		
			System.out.println("printing edges");
			for(int i=0; i<size;i++) {
			System.out.print(i+ " is connected to ");
			for(int j=0; j<size; j++) {
				if(matrix[i][j]==1) {
					System.out.print(j+ " ");
				}
				
			}
			System.out.println();
			
		}
		
	
	}
	public static void main(String [] args) {
		Unidirectional_graph obj= new Unidirectional_graph();
		obj.addEdge(0, 1);
		obj.addEdge(2, 0);

		obj.printMatrix();
		obj.printEdges();
	}
}
