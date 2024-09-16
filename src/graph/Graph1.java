/*
 * Adjency Matrix Representation (Undirected Graph)
 */

package graph;

public class Graph1 {

	private int[][] adjMatrix;
	private int V; // vertices
	private int E; // Edges

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " Vertices " + E + " Edges \n");

		for (int i = 0; i < V; i++) {
			sb.append(i + " ");
			for (int n : adjMatrix[i]) {
				sb.append(n + " ");
			}
			sb.append("\n");
		}

		return sb.toString();
	}

	public Graph1(int nodes) {
		this.adjMatrix = new int[nodes][nodes];
	}

	public void addEdge(int u, int v) {
		this.adjMatrix[u][v] = 1;
		this.adjMatrix[v][u] = 1;
		E++;
		V++;
	}

	public static void main(String[] args) {
		Graph1 g = new Graph1(4);

		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);

		System.out.println(g);
	}

}
