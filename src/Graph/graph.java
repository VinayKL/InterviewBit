package Graph;

import java.util.LinkedList;

public class graph {
	int V;
	LinkedList<Integer> A[];
	
	public graph(int V){
		this.V = V;
		for( int i=0 ; i < V ; i++){
			A[i] = new LinkedList<Integer>();
		}
	}
	
	public void addedge( int source, int destination){
		A[source].add(destination);
	}
}
