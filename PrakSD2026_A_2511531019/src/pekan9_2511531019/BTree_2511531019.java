package pekan9_2511531019;

public class BTree_2511531019 {
	private Node_2511531019 root_1019;
	private Node_2511531019 currentNode_1019;
	public BTree_2511531019() {
		root_1019 = null;
	}
	public boolean search_2511531019(int data_1019) {
		return search_2511531019(root_1019, data_1019);
	}
	
	private boolean search_2511531019(Node_2511531019 node_1019, int data_1019) {
		if (node_1019.getData_2511531019() == data_1019) {
			return true;
		}
		if (node_1019.getLeft_2511531019() != null) {
			if (search_2511531019(node_1019.getLeft_2511531019(), data_1019)) {
				return true;
			}
		}
		if (node_1019.getRight_2511531019() != null) {
			if (search_2511531019(node_1019.getRight_2511531019(), data_1019)) {
				return true;
			}
		}
		return false;
	}
	
	public void printInorder_2511531019() {
		root_1019.printInorder_2511531019(root_1019);
	}
	public void printPreorder_2511531019() {
		root_1019.printPreorder_2511531019(root_1019);
	}
	public void printPostorder_2511531019() {
		root_1019.printPostorder_2511531019(root_1019);
	}
	
	public Node_2511531019 getRoot_2511531019() {
		return root_1019;
	}
	
	public boolean isEmpty_2511531019() {
		return root_1019 == null;
	}
	
	public int countNodes_2511531019() {
		return countNodes_2511531019(root_1019);
	}
	
	private int countNodes_2511531019(Node_2511531019 node_1019) {
		int count_1019 = 1;
		if (node_1019 == null) {
			return 0;
		} else {
			count_1019 += countNodes_2511531019(node_1019.getLeft_2511531019());
			count_1019 += countNodes_2511531019(node_1019.getRight_2511531019());
			return count_1019;
		}
	}
	
	public void print_2511531019() {
		root_1019.print_2511531019();
	}
	
	public Node_2511531019 getCurrent_2511531019() {
		return currentNode_1019;
	}
	
	public void setCurrent_2511531019(Node_2511531019 node_1019) {
		this.currentNode_1019 = node_1019;
	}
	
	public void setRoot_2511531019(Node_2511531019 root_1019) {
		this.root_1019 = root_1019;
	}
	
}
