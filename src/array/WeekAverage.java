package array;

public class WeekAverage {
	public static void main(String args[]) { 
		double temp[]=  {66, 65.5, 77.5,77,88,55,68};
	double avgTemp = (int) calAverageTemp(temp);
	
	System.out.println("average temp of weeek is:" +avgTemp);
	
	}
		
	public static double calAverageTemp(double temp[]) {


		int size= temp.length;
		double total= 0;
		for (int i=0; i<size; i++) {
			total= total+ temp[i];
			
		}
		
		return total/size;
	}
	
}
