package ds.nonlinear.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Graph{
	private LinkedList<Integer> adj[];
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[source].add(source);
	}
	
 public int bfs(int source, int destination) {
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur == destination) break;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = cur;
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		
		
		while(parent[cur] != -1) {
			System.out.print(cur+" -> ");
			cur = parent[cur];
			distance++;
		}
		
		return distance;
	}
	
	private boolean dfsUtil(int source, int destination, boolean vis[]) {
		if(source == destination) return true;
		
		for(int neighbor: adj[source]) {
			if(!vis[neighbor]) {
				vis[neighbor] = true;
				boolean isConnected = dfsUtil(neighbor, destination, vis);
				if(isConnected) return true;
			}
		}
		
		return false;
	}
	
	public boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer>stack = new Stack<>();
		stack.push(source);
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			if(cur == destination) return true;
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		
		
		return false;
	}
	
	public boolean dfs(int source,int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		return dfsUtil(source,destination,vis);
	}
}
public class BSFAndDFS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println( "Enter number of vertices and edages");
		int v = input.nextInt();
		int e = input.nextInt();
		Graph graph = new Graph(v);
		System.out.println("Enter "+e+" edges");
		for (int i = 0; i < e; i++) {
			int source = input.nextInt();
			int destination = input.nextInt();
			graph.addEdge(source,destination);
		}
		System.out.println("Enter source and destination");
		int source = input.nextInt();
		int destination = input.nextInt();
		int distance = graph.bfs(source, destination);
		System.out.println("min distance is "+distance);
		
		//using dfs
		//System.out.println("Possible:"+graph.dfs(source, destination));
		//System.out.println("Possible:"+graph.dfsStack(source, destination));
		input.close();
	}
}
