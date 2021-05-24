package Stack;


	public class Stack2 {
	
	int size;
	char stk[];
	int top=-1;
	
	Stack2(int size){
		this.size=size;
		stk= new char[this.size];
		
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	
	boolean isFull() {
		return top==size-1;
	}
	
	void push(char data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
		}else {
			top = top+1;
			stk[top]= data;   
		}
	}
	
	char pop() {
		return stk[top--];
	}
	
	int peak() {
		return top;
	}
	

}
