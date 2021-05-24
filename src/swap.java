
public class swap {

	public static void main(String[] args) {
	    int a= 12;
		int b= 21;
		
		
	System.out.println("First number is "+ a);
	System.out.println("Second number is "+ b);

	
	int temporary= a;
	a= b;
	b=temporary;
	
	System.out.println("--After swap--");
	System.out.println("First number "+a);
	System.out.println("Second number "+b);
	}

}
