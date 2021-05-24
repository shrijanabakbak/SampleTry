package array;

public class RubicCubeChampion {
	public static void main(String[] args) {
		double speed[]= {3.9,10,12,8.8,6.9,7.7,5.5};
		double result = findChampion(speed);
		System.out.println("Min speed is "+ result);
	}
	
	public static double findChampion(double speed[]) {
		int size = speed.length;
		double min= speed[0];
		for(int i=1; i<size;i++) {
			if (speed[i]<min) {
				min= speed[i];
			}
			
		}
		return min;
	}
}
