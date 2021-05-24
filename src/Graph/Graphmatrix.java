package Graph;

public class Graphmatrix {
	int size=4;
	int matrix[][]=new int[size][size];
	
	String City[]= {"Kathmandu","Pokhara","Chitwan","Nuwakot"};
	
	void addEdge(int source, int destination) { // defining function nodes bich connection dekhauna
		
		matrix[source][destination]=1;
		matrix[destination] [source]=1;
	}
	
	void printMatrix() {
		System.out.println("pritning graph as matrix");
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
			System.out.print(City[i]+ " is connected to ");
			for(int j=0; j<size; j++) {
				if(matrix[i][j]==1) {
					System.out.print(City[j]+ " ");
				}
				
			}
			System.out.println();
			
		}
		
	
	}
	public static void main(String [] args) {
		Graphmatrix obj= new Graphmatrix();
		obj.addEdge(0, 1);
		obj.addEdge(0, 3);
		obj.addEdge(1, 2);
		obj.addEdge(1, 3);
		obj.printMatrix();
		obj.printEdges();
	}
	
}
