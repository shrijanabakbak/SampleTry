package Queue;

public class Queue {
	int queue[]= new int[6];
	int size;
	int rear;
	int front;
	
	public void enqueue(int value) {
		queue[rear]=value;
		rear=rear+1;
		size=size+1;
	}
	
	public void dequeue() {
		front= front+1;
		size=size-1;
	}
	
	public void display() {
		System.out.println("Rear "+rear);
		System.out.println("Front "+front);
		System.out.println("Size "+size);
		
		System.out.print("element in queue is ");
		for(int i=0; i<size;i++) {
			System.out.print(queue[front + i] +" ");
			
		}
		
		System.out.println("\nAcutal array");
		for(int i:queue) {
			System.out.print(i + " ");
		}
	}
	
}
