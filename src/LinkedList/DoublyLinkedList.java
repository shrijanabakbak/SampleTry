package LinkedList;

public class DoublyLinkedList {
	DoublyNode head;
	DoublyNode temp;
	
	public void insert(int value) {
		DoublyNode newnode= new DoublyNode();
		
		newnode.data= value;
		newnode.prev=null;
		newnode.next=null;
		   
		
		if(head==null) {
			temp=head=newnode;
			
		}else {
			  newnode=temp.next;
			  temp=newnode.prev;
			  temp=newnode;
		}
	}
		
	public void display() {
		DoublyNode n = head;

      while(n.next!=null) {
    	  System.out.println(n.prev);
    	  System.out.print(n.data+"|");
          System.out.print(n.next);
          System.out.print("->");
          System.out.println();
          
          n=n.next;
      }
      System.out.println(n.prev);
	  System.out.print(n.data+"|");
      System.out.print(n.next);
      

  
		
	}
		
		
		
	

}
