package array;

public class ArrayAdd {
	public void insert(int a[], int size, int pos, int value) {
		for(int i=size-1;i>=pos-1;i--) {
			a[i+1]=a[i];
			
		}
		
		a[pos-1]=value;
		size++;
		
		
		System.out.println(" ");
		System.out.println("after inserting");
		for(int i=0; i<size; i++) {
			System.out.println(a[i]+" ");
			
		}
		
		
	}

	public static void main(String[] args) {
		ArrayAdd sc= new ArrayAdd();
		int arr[]= new int[50];
		arr[0]= 7;
		arr[1]=8;
		arr[2]=9;
		arr[3]=10;
		int size =4;
		
		System.out.println("before inserting");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]+" ");
			
		}
		sc.insert(arr, size, 2, 100);
		
		
		
		
	}

}
