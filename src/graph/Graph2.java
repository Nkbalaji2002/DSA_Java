/*
 * Adjency List Represenctation (Undirected Graph)
 */

package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {

	LinkedList<Integer>[] adj;
	private int V;
	private int E;

	@SuppressWarnings("unchecked")
	public Graph2(int nodes) {
		this.adj = new LinkedList[nodes];

		for (int i = 0; i < nodes; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int u, int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
		V++;
		E++;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " Vertices " + E + " Edges \n");

		for (int i = 0; i < V; i++) {
			sb.append(i + " : ");
			for (int n : adj[i]) {
				sb.append(n + " --> ");
			}
			sb.append("null \n");
		}

		return sb.toString();
	}

	/*
	 * Breath First Search Traversal of an Undirected Graph
	 */
	public void bfs(int s) {
		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList<>();

		visited[s] = true;
		q.offer(s);

		while (!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");

			for (int v : adj[u]) {
				if (!visited[v]) {
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}

	/*
	 * Depth First Search (Iterative)
	 */
	public void dfs(int s) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		stack.push(s);

		while (!stack.isEmpty()) {
			int u = stack.pop();
			if (!visited[u]) {
				visited[u] = true;
				System.out.print(u + " ");

				for (int v : adj[u]) {
					if (!visited[v]) {
						stack.push(v);
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Graph2 g = new Graph2(5);

		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 0);

		g.dfs(0);
//		g.bfs(0);
		// System.out.println(g);
	}

}
