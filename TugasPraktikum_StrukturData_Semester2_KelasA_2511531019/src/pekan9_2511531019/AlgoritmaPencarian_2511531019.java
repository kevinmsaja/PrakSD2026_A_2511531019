package pekan9_2511531019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class AlgoritmaPencarian_2511531019 {
	public static HasilPencarian_2511531019 BFS_2511531019(
			Graph_2511531019 graph_1019, Node_2511531019 start_1019, Node_2511531019 goal_1019) {
        Queue<Node_2511531019> queue_1019 = new LinkedList<>();
        Map<Node_2511531019, Node_2511531019> parent_1019 = new HashMap<>();
        List<Node_2511531019> visitedOrder_1019 = new ArrayList<>();
        queue_1019.add(start_1019);
        start_1019.visited_1019 = true;
        while (!queue_1019.isEmpty()) {
            Node_2511531019 current_1019 = queue_1019.poll();
            visitedOrder_1019.add(current_1019);
            if (current_1019 == goal_1019) {
                break;
            }
            for (Node_2511531019 neighbor_1019 : graph_1019.getAdjacencyList_2511531019().get(current_1019)) {
                if (!neighbor_1019.visited_1019) {
                    neighbor_1019.visited_1019 = true;
                    parent_1019.put(neighbor_1019, current_1019);
                    queue_1019.add(neighbor_1019);
                }
            }
        }
        List<Node_2511531019> path_1019 = buildPath_2511531019(parent_1019, start_1019, goal_1019);
        return new HasilPencarian_2511531019(path_1019, visitedOrder_1019);
    }

    public static HasilPencarian_2511531019 DFS_2511531019(
    		Graph_2511531019 graph_1019, Node_2511531019 start_1019, Node_2511531019 goal_1019) {
        Stack<Node_2511531019> stack_1019 = new Stack<>();
        Map<Node_2511531019, Node_2511531019> parent_1019 = new HashMap<>();
        List<Node_2511531019> visitedOrder_1019 = new ArrayList<>();
        stack_1019.push(start_1019);
        start_1019.visited_1019 = true;
        
        while (!stack_1019.isEmpty()) {
        	Node_2511531019 current_1019 = stack_1019.pop();
            visitedOrder_1019.add(current_1019);
            if (current_1019 == goal_1019) {
                break;
            }
            
            for (Node_2511531019 neighbor_1019 : graph_1019.getAdjacencyList_2511531019().get(current_1019)) {
                if (!neighbor_1019.visited_1019) {
                    neighbor_1019.visited_1019 = true;
                    parent_1019.put(neighbor_1019, current_1019);
                    stack_1019.push(neighbor_1019);
                }
            }
        }
        List<Node_2511531019> path_1019 = buildPath_2511531019(parent_1019, start_1019, goal_1019);
        return new HasilPencarian_2511531019(path_1019, visitedOrder_1019);
    }

    private static List<Node_2511531019> buildPath_2511531019(
    		Map<Node_2511531019, Node_2511531019> parent_1019,
    		Node_2511531019 start_1019, Node_2511531019 goal_1019) {
    	List<Node_2511531019> path_1019 = new ArrayList<>();
    	Node_2511531019 current_1019 = goal_1019;
        while (current_1019 != null) {
            path_1019.add(current_1019);
            current_1019 = parent_1019.get(current_1019);
        }
        Collections.reverse(path_1019);
        if (path_1019.get(0) != start_1019) {
            return new ArrayList<>();
        }
        return path_1019;
    }
}