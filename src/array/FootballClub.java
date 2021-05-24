package array;

public class FootballClub {
	public static void main(String[] args) {
		String array[]= {"Manchester United","Manchester City","Liverpool","WestHame United","Leeds United","Fulham","Everton","SouthHamtom","WestBrom"};
		String result=findLongest(array);
		System.out.println("lonest name with football club is "+ result+" with length " + result.length());
	}
	
	public static String findLongest(String array[]) {
		int size= array.length;
		
		String longest= array[0];
		for(int i=1;i<size; i++) {
			if(array[i].length() > longest.length()) {
				longest= array[i];
			}
			
		}
		return longest;
		
		
	}
}
