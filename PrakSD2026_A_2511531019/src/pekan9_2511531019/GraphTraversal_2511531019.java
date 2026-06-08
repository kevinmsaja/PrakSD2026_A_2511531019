package pekan9_2511531019;
import java.util.*;
public class GraphTraversal_2511531019 {
	private Map<String, List<String>> graph = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_2511531019(String node1_1019, String node2_1019) {
        graph.putIfAbsent(node1_1019, new ArrayList<>());
        graph.putIfAbsent(node2_1019, new ArrayList<>());
        graph.get(node1_1019).add(node2_1019);
        graph.get(node2_1019).add(node1_1019);
    }

    // Menampilkan graf awal
    public void printGraph_2511531019() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_1019 : graph.keySet()) {
            System.out.print(node_1019 + ": ");
            List<String> neighbors = graph.get(node_1019);
            System.out.println(String.join(", ", neighbors));
        }
        System.out.println();
    }
    
    // DFS rekursif
    public void dfs_2511531019(String start_1019) {
        Set<String> visited_1019 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_2511531019(start_1019, visited_1019);
        System.out.println();
    }

    private void dfsHelper_2511531019(String current_1019, Set<String> visited_1019) {
        if (visited_1019.contains(current_1019)) return;
        visited_1019.add(current_1019);
        System.out.print(current_1019 + " ");
        for (String neighbor : graph.getOrDefault(current_1019, new ArrayList<>())) {
            dfsHelper_2511531019(neighbor, visited_1019);
        }
    }
    
    // BFS Iteratif
    public void bfs_2511531019(String start) {
        Set<String> visited_1019 = new HashSet<>();
        Queue<String> queue_1019 = new LinkedList<>();
        queue_1019.add(start);
        visited_1019.add(start);
        System.out.println("Penelusuran BFS:");
        while (!queue_1019.isEmpty()) {
            String current_1019 = queue_1019.poll();
            System.out.print(current_1019 + " ");
            for (String neighbor_1019 : graph.getOrDefault(current_1019, new ArrayList<>())) {
                if (!visited_1019.contains(neighbor_1019)) {
                    queue_1019.add(neighbor_1019);
                    visited_1019.add(neighbor_1019);
                }
            }
        }
        System.out.println();
    }
    
    // Main
    public static void main(String[] args) {
        GraphTraversal_2511531019 graph_1019 = new GraphTraversal_2511531019();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_1019.addEdge_2511531019("A", "B");
        graph_1019.addEdge_2511531019("A", "C");
        graph_1019.addEdge_2511531019("B", "D");
        graph_1019.addEdge_2511531019("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah ");
        graph_1019.printGraph_2511531019();

        // Lakukan penelusuran
        graph_1019.dfs_2511531019("A");
        graph_1019.bfs_2511531019("A");
    }
}
