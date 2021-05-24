package Stack;

//import com.sun.tools.sjavac.server.SysInfo;

public class Stack1 {
	
	//Stack1 a =new Stack1();
	int size=5;

	int [] stack=new int[size];
	int top=-1;
	
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull() {
		return top==size-1;   //if capacity is 5 then all stack is filled then top index 4 samma huncha so top+1 = isze check gareko
	}                         // top == size-1
	
	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack overflow");
			
		}else {
			top=top+1;
			stack[top]=val;  // instead of top+=1 we can write stack[++top]=val
			
		}
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return top;
		}else {
			int top_pop= top;
			System.out.println(" yoyo"+top_pop);
			top= top-1;
			return stack[top_pop];// paila top return garcha then top= top-1
			
		}
		
	}
	
	int peak() {
		return top;  //gives index ka sanga val insert bhacha top+1 gare posiiton dincha
	}
	void printstack() {
		if(isEmpty()) {
			System.out.println("no data to insert");
		}
		else {
			System.out.println("Stack value start");
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);	
		}
		System.out.println("Stack value print end");
		}
	}
	
	public static void main(String[] args) {
	Stack1 a= new Stack1();
	a.push(10);
	a.push(100);
	a.push(200);
	
	
	System.out.println("print element after push operation");
	a.printstack();
	int popedval= a.pop();
	System.out.println("the value poped is "+ popedval);
	a.pop();
	System.out.println("print element after pop operation");
	a.printstack();
	}

}
