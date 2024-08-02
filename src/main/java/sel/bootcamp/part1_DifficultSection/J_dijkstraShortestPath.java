package sel.bootcamp.part1_DifficultSection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class J_dijkstraShortestPath {

	private final Map<String, List<Edge>> vertices = new HashMap<>();

	public void addVertex(String vertex) {
		vertices.putIfAbsent(vertex, new ArrayList<>());
	}

	public void addEdge(String source, String destination, int weight) {
		vertices.get(source).add(new Edge(destination, weight));
		vertices.get(destination).add(new Edge(source, weight)); // For undirected graph
	}

	public List<String> shortestPath(String start, String end) {
		Map<String, Integer> distances = new HashMap<>();
		Map<String, String> previous = new HashMap<>();
		PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));

		for (String vertex : vertices.keySet()) {
			distances.put(vertex, Integer.MAX_VALUE);
			previous.put(vertex, null);
		}

		distances.put(start, 0);
		queue.add(new Node(start, 0));

		while (!queue.isEmpty()) {
			Node current = queue.poll();

			if (current.name.equals(end)) {
				break;
			}

			for (Edge edge : vertices.get(current.name)) {
				int newDist = distances.get(current.name) + edge.weight;
				if (newDist < distances.get(edge.destination)) {
					distances.put(edge.destination, newDist);
					previous.put(edge.destination, current.name);
					queue.add(new Node(edge.destination, newDist));
				}
			}
		}

		List<String> path = new ArrayList<>();
		for (String at = end; at != null; at = previous.get(at)) {
			path.add(at);
		}
		Collections.reverse(path);

		if (path.get(0).equals(start)) {
			return path;
		}
		return Collections.emptyList();
	}

	private static class Edge {
		String destination;
		int weight;

		Edge(String destination, int weight) {
			this.destination = destination;
			this.weight = weight;
		}
	}

	private static class Node {
		String name;
		int distance;

		Node(String name, int distance) {
			this.name = name;
			this.distance = distance;
		}
	}

	public static void main(String[] args) {
		J_dijkstraShortestPath graph = new J_dijkstraShortestPath();

		// Adding vertices
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");

		// Adding edges
		graph.addEdge("A", "B", 4);
		graph.addEdge("A", "C", 2);
		graph.addEdge("B", "C", 5);
		graph.addEdge("B", "D", 10);
		graph.addEdge("C", "E", 3);
		graph.addEdge("E", "D", 4);
		graph.addEdge("D", "E", 11);

		// Finding the shortest path
		List<String> shortestPath = graph.shortestPath("A", "D");

		if (shortestPath.isEmpty()) {
			System.out.println("No path exists");
		} else {
			System.out.println("Shortest path: " + shortestPath);
		}
	}
}
