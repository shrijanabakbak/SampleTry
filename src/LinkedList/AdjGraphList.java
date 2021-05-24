package LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Queue.Queue;
import Queue.linkl_queue;

//import Graph.LinkedList;

public class AdjGraphList {
	int vertex=5;
	LinkList1 list[]=new LinkList1 [vertex];
	
	AdjGraphList() {
		for(int i=0; i<vertex;i++) {
			list[i]=new LinkList1(); // new linkedlist dyanamically call gareko, not using any library 
		}
	}
	
	public void addEdge(int source, int destination) {
		list[source].addNode(destination);
		list[destination].addNode(source);
	}
	
	
	
	public void printGraph() {
		System.out.println("printing graph");
		for(int i=0; i<vertex;i++) {
			if(list[i].size()>0) {
				System.out.println(i+" is connected to ");
				for(int j=0;j<list[i].size();j++) {
					System.out.print(list[i].get(j) +" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public List<Integer> getAdjacentNodes(int val){
		List<Integer> adjlist= new  ArrayList<Integer>();
		for(int i=0; i<list[val].size();i++) {
			adjlist.add(list[val].get(i));
		}
		return adjlist;
	
		
		
	}
	
	public void BFS(int rootnode) {
		System.out.println(rootnode);
		boolean [] visited = new boolean[vertex]; // boolean type ko array banayeko
		visited[rootnode]=true;
		linkl_queue q = new linkl_queue();
		q.enqueue(rootnode);
		
		while(q.size()!=0) {
			int x= q.dequeue();
			System.out.println(x);
		Iterator<Integer> iterator =getAdjacentNodes(x).iterator();
		while(iterator.hasNext()) {  // returns either true or false
			int val=iterator.next(); //returns next value [1,2] returns 1
			if(!visited[val]) {
				q.enqueue(val);
				visited[val]=true;
			}
			
		}
	}
	}
	
	public void DepthFirstSearch(int rootnode) {
		boolean [] visited= new boolean [vertex];
		DFS(rootnode,visited);
	
		}
	
	
	public void DFS(int rootnode, boolean visited[]) {
		visited[rootnode]=true;
		System.out.println(rootnode);
		Iterator<Integer> iterator=getAdjacentNodes(rootnode).iterator();    //provides adjacent nodes in list which need to be iterated. this is a class 
		while(iterator.hasNext()) {
			int adjval= iterator.next();
			if(!visited[adjval]) {
				DFS(adjval,visited);
				
			}
		}
			
		
	}
	
// shortest path using BFS 
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
			
			linkl_queue q= new linkl_queue();
			q.enqueue(source);
			
			while(q.size()!=0) {
				int u = q.dequeue(); // for 1st time it will get 0
				Iterator<Integer> iterator= getAdjacentNodes(u).iterator();
				
				while(iterator.hasNext()) {
					int v= iterator.next();
					if(!visited[v]) {
						int newDistance= minDistance[u]+1;
						minDistance[v]= newDistance;
						prevPath[v]=u;
						visited[v]= true;
						q.enqueue(v);
					}
				}
			}
			System.out.println(minDistance[destination] +" is minimum distance to destination");
			
			LinkList1 path= new LinkList1();
			path.addNode(destination);
			int crawl = destination;
			
			while(prevPath[crawl]!=-1) {
				crawl= prevPath[crawl];
				path.addNode(crawl);
			}
			
			System.out.println("Printing shortest path");
			for(int i=path.size()-1; i>=0;i--) {
				System.out.println(path.get(i));
			}
		}
			
			
		
	
	public static void main(String[]args) {
		AdjGraphList a= new AdjGraphList();
		a.addEdge(0,1);
		a.addEdge(0,2);
		a.addEdge(1,3);
		a.addEdge(2,4);
		a.addEdge(3, 4);
		a.printGraph();
//		a.DepthFirstSearch(0);
		a.shortestPath(0, 4);
//		a.BFS(0);
	
		
	}
	
	
}
