package Stack;

import java.util.Stack;

public class Algo {
	boolean isBalanced(String data) {
		
		
		String openbracket="[{(";
		String closedbracket="]})";
		int size=data.length();
		
		Stack2 stk=new Stack2(size);
		
		for(int i=0;i<size;i++) {
			char bracket=data.charAt(i);
			if (openbracket.indexOf(bracket)!=-1) {
				stk.push(bracket);
				
			}else {
				int index= closedbracket.indexOf(bracket);
				char opening=openbracket.charAt(index);
				if(stk.pop()!=opening) {
					return false;
					
				}
			}
			
		}
				
		if(stk.peak()==-1) {
			return true;
		}
		return false;
		
	}
	
	
public static void main(String[] args) {
	String data="{()}";
	Algo a= new Algo();
	System.out.println(a.isBalanced(data)); 
	
}

}
