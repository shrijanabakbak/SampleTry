package Queue;

public class linkl_queue {
	public static class Node{
		int data;
		Node next;
		Node(int data){ // int data is a function then Node is a constructor //Node ab= new Node( 10) 
			this.data=data;
			this.next=next; 
		}
	}
	
	Node head= null;
	Node tail=null;
	
	public void enqueue(int data) {
		Node newnode= new Node(data); //naya node ko address newnode le rakhcha
		if(head==null) {
			head= newnode;
			tail=head;
		}else {
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	public int dequeue() {
		int val=head.data;
		head=head.next;
		return val;
	}
	
	public void printQueue() {
		Node current=head;
		while (current!=null) {
			System.out.println(current.data);
			current=current.next;
			
		}
	}
	
	public int size() {
		int count=0;
		Node current=head;
		while (current!=null) {
			count++;
			
			current=current.next;
		}
		return count;
	}
	
	public static void main (String[] args) {
		linkl_queue obj= new linkl_queue();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.dequeue();
		obj.dequeue();
		obj.printQueue();
		System.out.println("the sice of the linked list is "+obj.size());
		
		
		
	}
	

}
