package LinkedList;

public class LinkedList1main {
	public static void main(String[] args) {
		LinkList1 list= new LinkList1();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.printList();
		System.out.println("the data is " +list.get(1)); 
		System.out.println("the size of list is " +list.size());
		
	}

}
