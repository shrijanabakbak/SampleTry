package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Queue.Queue;

public class ShortPath {
	
	public void shortestPath(int source, int destination) {
		int[] prevPath= new int [vertex]; // by default 0
		boolean[] visited= new boolean[vertex];  // by default false
		int[] minDistance= new int [vertex]; //will hold distance
		
		for(int i=0; i<vertex; i++) {
			minDistance[i]= Integer.MAX_VALUE;
			prevPath[i]=-1;
			
		}
		
		minDistance[source]=0;
		visited[0]=true;
		
		Queue q= new Queue();
		q.enqueue(source);
		
		while(q.vertex!=0) {
			int u = q.dequeue(); // for 1st time it will get 0
			Iterator<Integer> iterator= getAdjacentNodes(u).iterator();
			
			while(iterator.hasNext()) {
				int v= iterator.next();
				if(!visited[v]) {
					int newDistance= minDistance[u]+1;
				}
			}
		}
	}
	
	public List<Integer>getAdjacentNodes(int val){
		java.util.List<Integer> adjList= new ArrayList<Integer>();
		for(int i=0; i)
		
	}

}
