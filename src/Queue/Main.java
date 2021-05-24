package Queue;

public class Main {
	public static void main(String[] args) {
		Queue soft= new Queue(); //queue class ko objec banayeko
		
		soft.enqueue(10);
		soft.enqueue(20);
		soft.enqueue(30);
		soft.dequeue();
		soft.dequeue();
		
		soft.enqueue(40);
		soft.enqueue(50);
		soft.enqueue(60);
		
		soft.dequeue();
		soft.dequeue();
		soft.dequeue();
		soft.dequeue();
		
		soft.display();
		
	}
}
