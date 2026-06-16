package pekan9_2511531019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph_2511531019 {
	private Map<Node_2511531019, List<Node_2511531019>> adjacencyList_1019;

    public Graph_2511531019() {
        adjacencyList_1019 = new HashMap<>();
    }

    public void addNode_2511531019(Node_2511531019 node_1019) {
        adjacencyList_1019.putIfAbsent(node_1019, new ArrayList<>());
    }

    public void addEdge_2511531019(Node_2511531019 source_1019, Node_2511531019 destination_1019) {
        adjacencyList_1019.get(source_1019).add(destination_1019);
        adjacencyList_1019.get(destination_1019).add(source_1019);
    }

    public Map<Node_2511531019, List<Node_2511531019>> getAdjacencyList_2511531019() {
        return adjacencyList_1019;
    }

    public void resetGraph_2511531019() {
        for (Node_2511531019 node_1019 : adjacencyList_1019.keySet()) {
            node_1019.visited_1019 = false;
        }
    }
}
