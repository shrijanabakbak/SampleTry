package LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		
		list.insertAtStart(5);
		list.insertAtStart(80);
//		
//		list.insert(100);
		list.insertAtAnyPosition(3, 22);
		list.insertAtAnyPosition(4, 102);
		
		list.delete(2);
		
		list.delete(2);
		list.delete(0);
		list.display();
		
		
		
		
		
	}
}
	
//	public void main(int value) {
//		Node newNode= new Node();
//		newNode.data=value;
//		newNode.next=null;
//		
//		newNode.next=head;
//		head=newNode;
		
	
 

