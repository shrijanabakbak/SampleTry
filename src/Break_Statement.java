
public class Break_Statement {

	public static void main(String[] args) {
		int i=0;
		int counter=0;
		while(true) {
			if(i%2!=0) {
				System.out.println(i);
				counter++;
			}
			if(counter>5) {
				break; 
			}
			i++;
		}

	}

}
