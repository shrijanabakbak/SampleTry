package Queue;

public class Main1 {
	public static void main(String[] args) {
		Queue1 soft= new Queue1(); //queue class ko objec banayeko
		
		soft.enqueue(10);
		soft.enqueue(20);
		soft.enqueue(30);

		
		soft.enqueue(40);
		soft.enqueue(50);
		soft.enqueue(60);

		
		
		System.out.println(soft.isFull());
		
		soft.dequeue();
		soft.dequeue();
		soft.dequeue();
		soft.dequeue();
		soft.dequeue();
//		soft.dequeue();
//		soft.dequeue();
		
		System.out.println(soft.isEmpty());
		
		soft.display();
		
	}
}
