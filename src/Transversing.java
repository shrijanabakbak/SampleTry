
public class Transversing {
	public void insert(int a[], int size, int pos, int val) {
		for (int i=size-1; i>=pos-1;i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=val;
		size++;
		System.out.println("");
		System.out.println("after inserting");
		for(int i=0; i<=size-1;i++) {
			System.out.println(a[i]+",");
		}
	}
	public static void main(String[] args) {
		Transversing ab = new Transversing();
		int arr[]= new int[50];
		arr[0]=3;
		arr[1]=2;
		arr[2]=5;
		arr[3]=9;
		int size=4;
		System.out.println("before inserting");
		for (int i=0; i<=size-1;i++) {
			System.out.println(arr[i]+",");
			
		}
		ab.insert(arr,size,2,100);
		

	}

}
