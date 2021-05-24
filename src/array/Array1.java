package array;

public class Array1 {
	
	public void insert(int a[],int size, int pos ) {
		for(int i= pos-1; i<=size-1; i++) {
			a[i]=a[i+1];
		}
//		size=size-1;
		
		
		System.out.println("after deleting");
		for(int i=0; i<=size-1; i++ ) {
			System.out.println(a[i]+",");
		}
		
		size--;
		
		
	}
	

	public static void main(String[] args) {
		Array1 ab = new Array1();
		int arr[]= new int[40];
		arr[0]=7;
		arr[1]=8;
		arr[2]=9;
		arr[3]=10;
		arr[4]=11;
		arr[5]=12;
		arr[6]=13;
		int size =7;
		System.out.println("before deleting");
		for(int i=0; i<= size-1; i++) {
			System.out.println(arr[i]+",");
			
		}
		ab.insert(arr, size, 3);
	}

}
