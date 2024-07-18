package sel.bootcamp.part1_DifficultSection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class F_dijkstraShortestPath {
    private int vertices;
    private List<List<Node>> adjList;

    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    F_dijkstraShortestPath(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
  //          adjList.add(new LinkedList<>());
        }
    }

    void addEdge(int source, int destination, int weight) {
        adjList.get(source).add(new Node(destination, weight));
        adjList.get(destination).add(new Node(source, weight)); // If the graph is undirected
    }

    void dijkstra(int startVertex) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;
        pq.add(new Node(startVertex, 0));

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;

            for (Node neighbor : adjList.get(currentVertex)) {
                int newDist = distances[currentVertex] + neighbor.weight;
                if (newDist < distances[neighbor.vertex]) {
                    distances[neighbor.vertex] = newDist;
                    pq.add(new Node(neighbor.vertex, newDist));
                }
            }
        }

        printShortestPaths(distances, startVertex);
    }

    void printShortestPaths(int[] distances, int startVertex) {
        System.out.println("Shortest paths from vertex " + startVertex + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To vertex " + i + " - Distance: " + distances[i]);
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        F_dijkstraShortestPath graph = new F_dijkstraShortestPath(vertices);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);

        graph.dijkstra(0);
    }
}
