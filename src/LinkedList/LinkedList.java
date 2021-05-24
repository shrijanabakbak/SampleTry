package LinkedList;

public class LinkedList {
    Node head;
    
    //insert into linklist
    public void insert(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        
         
        if(head==null) {   
            head = newNode;  
        }
        else {
            Node n = head;
            while(n.next!=null) { 
                n=n.next;
            }
            n.next =newNode; 
        }
    }
    
//    at the start
    public void insertAtStart(int value) {
        Node newNode = new Node();
        newNode.data=value;
        newNode.next=null;
        
        newNode.next=head;
        head=newNode;
    }
//    
    //at any position
    public void insertAtAnyPosition(int index, int value) {
        Node newNode = new Node();
        newNode.data=value;
        newNode.next=null;
        
        if(index==0) {
            insertAtStart(value);
        }else {
            Node n = head;
            for(int i=0; i<index-1; i++) {
                n=n.next;
            }
            newNode.next=n.next;
            n.next=newNode;
        }
    }
    
    public void delete(int ind) {
    	if(ind==0) {
    		head=head.next;
    	
    	}else {
    		Node n = head;
    		Node delete;
    		for(int i=0; i<ind-1;i++) {
    			n=n.next;
    		}
    		delete= n.next;
    		n.next= delete.next;
    		delete.next=null;
    		
    	}
    	
    } 
    
    
    public void display() {
        Node n = head;
//        System.out.println(n.next+"|");
        while(n.next!=null) {
            System.out.print(n.data+"|");
//            System.out.println(n.next);
            System.out.print("->");
            
            n=n.next;
        }
        System.out.print(n.data+"|");
        System.out.println(n.next);
//        System.out.println(n.next);
    }
} 
