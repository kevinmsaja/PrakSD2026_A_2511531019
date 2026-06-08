package pekan9_2511531019;

public class Node_2511531019 {
	int data_1019;
	Node_2511531019 left_1019;
	Node_2511531019 right_1019;
	
	public Node_2511531019(int data_1019) {
		this.data_1019 = data_1019;
		left_1019 = null;
		right_1019 = null;
	}
	
	public void setLeft_2511531019(Node_2511531019 node_1019) {
		if (left_1019 == null) {
			left_1019 = node_1019;
		}
	}
	
	public void setRight_2511531019(Node_2511531019 node_1019) {
		if (right_1019 == null) {
			right_1019 = node_1019;
		}
	}
	
	public Node_2511531019 getLeft_2511531019() {
		return left_1019;
	}
	
	public Node_2511531019 getRight_2511531019() {
		return right_1019;
	}
	
	public int getData_2511531019() {
		return data_1019;
	}
	
	public void setData_2511531019(int data_1019) {
		this.data_1019 = data_1019;
	}
	
	void printPreorder_2511531019(Node_2511531019 node_1019) {
		if (node_1019 == null) {
			return;
		}
		System.out.print(node_1019.data_1019 + " ");
		printPreorder_2511531019(node_1019.left_1019);
		printPreorder_2511531019(node_1019.right_1019);
	}
	
	void printPostorder_2511531019(Node_2511531019 node_1019) {
		if (node_1019 == null) {
			return;
		}
		printPostorder_2511531019(node_1019.left_1019);
		printPostorder_2511531019(node_1019.right_1019);
		System.out.print(node_1019.data_1019 + " ");
	}
	
	void printInorder_2511531019(Node_2511531019 node_1019) {
		if (node_1019 == null) {
			return;
		}
		printInorder_2511531019(node_1019.left_1019);
		System.out.print(node_1019.data_1019 + " ");
		printInorder_2511531019(node_1019.right_1019);
		
	}
	
	public String print_2511531019() {
		return this.print_2511531019("", true, "");
	}
	
	public String print_2511531019(String prefix_1019, boolean isTail_1019, String sb_1019) {
		if (right_1019 != null) {
			right_1019.print_2511531019(prefix_1019 + (isTail_1019 ? "| ": " "), false, sb_1019);
		}
		System.out.println(prefix_1019 + (isTail_1019 ? "\\-- " : "/-- ") + data_1019);
		if (left_1019 != null) {
			left_1019.print_2511531019(prefix_1019 + (isTail_1019 ? "| ": " "), true, sb_1019);
		}
		return sb_1019;
	}
	
}
