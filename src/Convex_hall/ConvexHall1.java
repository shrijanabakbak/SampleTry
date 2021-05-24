package Convex_hall;

import java.util.Stack;

public class ConvexHall1 {
	public int direction(Coordinate1 p, Coordinate1 q, Coordinate1 r ) {
		int area=(q.x - p.x)*(r.y - q.y)-(q.y - p.y)*(r.x-q.x);
				return 0;
	}
	
	public void convexHull(Coordinate1 point[]) {
		Stack<Coordinate1> stack= new Stack <Coordinate1>();
		int left=0;
		int n=point.length;
		for(int i=1; i<n;i++) { 
			if(point[i].x < point[left].x) {
				left=i;
			}
		}
		
		int p=left;
		System.out.println("Leftmost=(" +point[p].x+ ","+point[p].y+")");
		do {
			stack.add(point[p]);
			int q=(p+1)%n;
			for(int r=0; r<n; r++) {
				if(direction(point[p],point[q], point[r])>0) {
					q=r;
				}
				
			}
			p=q;
		}while(p!=left);
		
		for(Coordinate1 i: stack) {
			System.out.println("Convex hall point=(" + i.x +"," + i.y + ")");
			
		}
		
	}

}
