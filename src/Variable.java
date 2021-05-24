  
public class Variable {

	public static void main(String[] args) {
		
		//truncation 
		
//        double div = 5/2.0; //2.0 nagari 2 matrai lekheko bhaye truncation error aaucha so we did 2.0 since varibale type double lekhecha
//		
//		System.out.println("output- "+ div);
		
		// int casting( converting double into int)
		
		double current =17;
		double rate= 1.5;
		
		double futureWorth = current * rate;
		
		System.out.println(futureWorth);
		
    	int intWorth= (int)futureWorth;
		System.out.println(intWorth);
		
		//double casting
		
		int x=5;
		int y=2;
		double div= x/y;
		System.out.println(div);
		 
		double accurate= (double) x/y;
		System.out.println(accurate);
		
	}

}
