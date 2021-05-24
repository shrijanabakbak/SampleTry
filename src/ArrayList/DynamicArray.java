package ArrayList;
import java.util.*;

public class DynamicArray {
	public static void main(String[] args) {
		ArrayList soft = new ArrayList(20); //default capacityarraylist // new le memory allocate garcha
		
		Object newSoftList;
//		ArrayList soft1 = new ArrayList(5); //initial capacity array list
//		ArrayList soft2 = new ArrayList(soft1);
//		
//		ArrayList<String> al = new ArrayList();
//		ArrayList<Integer> al2 = new Arraylist();
//		ArrayList<Double> al3 = new ArrayList();
		
		System.out.println("Size of softwarica "+ soft.size());
		
		soft.add("Batch 28");
		soft.add("Batch 29");
		soft.add("Batch 30");
		soft.add("Batch 31");
		soft.add(0,"Batch 27");
		
		
		System.out.println("Size of softwarica "+ soft.size());
		
		System.out.println("data inside softwarica "+ soft);
		
		//Get method
		System.out.println("data at index 0 :"+ soft.get(0));
		
		
		//indexof
		System.out.println("index of Batch28 :"+ soft.indexOf("Batch 28"));
		
		//loop in arrayList
		for(int i =0; i<soft.size(); i++) {
			System.out.println("Batches in Softwarica "+ soft.get(i));
			
		//remove one
			soft.remove("Batch 28");
			System.out.println(" size after removing:"+ soft.size());
			
		// to array
			Object softBatch[]= soft.toArray();
			
			System.out.println("Converted array:"+ softBatch[0]);
			System.out.println("Length of softBatchArray " + softBatch.length);
			
		//clone
			newSoftList = soft.clone();
		
		//trimtosize
			soft.trimToSize();
			System.out.println("size of soft after triming "+ soft.size());
		//clear
			soft.clear();
			System.out.println("Data after clearing "+ soft);
		}
		}

}
