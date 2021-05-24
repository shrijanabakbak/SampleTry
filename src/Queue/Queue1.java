package Queue;

public class Queue1 {
	int queue[]= new int[6];
	int size;
	int rear;
	int front;
	
	public void enqueue(int value) {
		if(!isFull()) {
			queue[rear]=value;
			rear=(rear+1)%6;
			size=size+1;
		}else {
			System.out.println("Queue is full");
		}
		
	}
	
	public void dequeue() {
		if (!isEmpty()) {
			front= (front+1)%6;
			size=size-1;
		}else {
			System.out.println("Queue is empty");
		}
		
	}
	
	
	public boolean isEmpty() {
		//return size==0;
		if (size==0) {
			return true;
		}else {
			return false;
		}
	}
		
	
	public boolean isFull() {
		return size==6;
	}
		
	
	public void display() {
		System.out.println("Rear "+rear);
		System.out.println("Front "+front);
		System.out.println("Size "+size);
		
		System.out.print("element in queue is ");
		for(int i=0; i<size;i++) {
			System.out.print(queue[(front + i)%6] +" ");
			
		}
		
		System.out.println("\nAcutal array");
		for(int i:queue) {
			System.out.print(i + " ");
		}
		
	}
}
