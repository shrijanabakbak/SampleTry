package array;

public class Temperature {
	public static void main(String[] args) { //args is array name
		double temp[]=  {66, 65.5, 77.5,77,88};
		
		//use of single dimensional array
		int size= temp.length;
		for (int i=0; i<size; i++) {
			System.out.println(temp[i]);
		}
		
		//using for each
		
		for(double i:temp) {
			System.out.println(i);
			
		}
		
	}
}
