package searching.depthFirstSearch;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 1);
        graph.addEdge(1, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 2);
        graph.addEdge(2, 3);
        graph.DFS(2);
    }

    private final LinkedList[] linkedLists;
    private final boolean[] visited;

    public Graph(int vertices) {
        linkedLists = new LinkedList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            linkedLists[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        linkedLists[src].add(dest);
    }

    public void DFS(int vertices) {
        visited[vertices] = true;
        System.out.println(vertices);
        for (Integer num : (Iterable<Integer>) linkedLists[vertices]) {
            if (!visited[num]) {
                DFS(num);
            }
        }
    }
}
