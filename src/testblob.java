
public class testblob {

	public void someFun() { //static- return type 
		System.out.println("HELLO WORLD");
		
	}
	
public static void main(String[] args) { //main method
	testblob aobj=new testblob(); //testblob is a class name, aobj is object that loads into memory and so that we can access 
	//	ReadingImage a = new ReadingImage
	
	aobj.someFun();
	}

}

//--- running java without making an object--------

//public class testblob{
//	public static void someFun() {
//		
//		System.out.println("hello world")
//		
//		someFun();
//	}
//}