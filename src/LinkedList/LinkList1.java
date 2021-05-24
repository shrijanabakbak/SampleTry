package LinkedList;


public class LinkList1 {
	
	public static class Node{ // Node ko satta j lekhe ne huncha  , class call garne bitikai constructor call huncha 
		int data;
		Node next; // stores memory address
		
		
		Node(int data)  {//  node is a constructor
			this.data=data;
			this.next=null;
			
		}
		
	}
	Node head=null;
	Node tail=null;  // tail le last ko address store garcha
	
	public void addNode(int data) {
		Node newnode= new Node(data);   // newnode is/holds an address
		
		
		if(head==null) {
			head=newnode;
			tail=head;
			
			
		}else {
			tail.next=newnode;
			tail=newnode;
		}
	}
		 
//		if(head==null) {
//			head=newnode;  // newnoad ma bhayeko data n address head lai assign garcha
//			
//			
//		}
//		else
//		{
//			Node current= head;
//			while(current.next!=null) {
//				current=current.next;
//			}
//			current.next=newnode;
//		}
//		 
		
		public void printList()
		{
			Node current=head;
			while(current!=null){
				System.out.println(current.data);
				current=current.next;
		}
		}
		
		public int size() {
			int count=0;  // size count garna lai count lekheko
			Node current=head;
			while(current!=null) {
				count++;
				current=current.next;
			}
			return count;
			
			
		}
			
		
		
		public int get(int i) {
			Node current=head;
			if(size()>0 && i<size()) {
				
				for(int j=0;j<i;j++) {
					current=current.next;
					
					
				}
				return current.data;
				
			}
			return -1;
		}
	
		
	
	
		
	
}

