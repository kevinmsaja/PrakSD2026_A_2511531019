package pekan6_2511531019;

public class InsertDLL_2511531019 {
	static NodeDLL_2511531019 insertBegin_2511531019(NodeDLL_2511531019 head_1019, int data_1019) {
		NodeDLL_2511531019 new_node_1019 = new NodeDLL_2511531019(data_1019);
		new_node_1019.next_1019 = head_1019;
		if (head_1019 != null) {
			head_1019.prev_1019 = new_node_1019;
		}
		return new_node_1019;
	}
	public static NodeDLL_2511531019 insertEnd_2511531019(NodeDLL_2511531019 head_1019, int newData_1019) {
		NodeDLL_2511531019 newNode_1019 = new NodeDLL_2511531019(newData_1019);
		if (head_1019 == null) {
			head_1019 = newNode_1019;
		} else {
			NodeDLL_2511531019 curr_1019 = head_1019;
			while (curr_1019.next_1019 != null) {
				curr_1019 = curr_1019.next_1019;
			}
			curr_1019.next_1019 = newNode_1019;
			newNode_1019.prev_1019 = curr_1019;
		}
		return head_1019;
	}
	public static NodeDLL_2511531019 insertAtPosition_2511531019(NodeDLL_2511531019 head_1019, int pos_1019, int new_data_1019) {
		NodeDLL_2511531019 new_node_1019 = new NodeDLL_2511531019(new_data_1019);
		if (pos_1019 == 1) {
			new_node_1019.next_1019 = head_1019;
			if (head_1019 != null) {
				head_1019.prev_1019 = new_node_1019;
			}
			head_1019 = new_node_1019;
			return head_1019;
		}
		NodeDLL_2511531019 curr_1019 = head_1019;
		for (int i_1019 = 1; i_1019 < pos_1019 - 1 && curr_1019 != null; ++i_1019) {
			curr_1019 = curr_1019.next_1019;
		}
		if (curr_1019 == null) {
			System.out.println("Posisi tidak ada");
			return head_1019;
		}
		new_node_1019.prev_1019 = curr_1019;
		new_node_1019.next_1019 = curr_1019.next_1019;
		curr_1019.next_1019 = new_node_1019;
		if (new_node_1019.next_1019 != null) {
			new_node_1019.next_1019.prev_1019 = new_node_1019;
		}
		return head_1019;
	}
	public static void printList_2511531019(NodeDLL_2511531019 head_1019) {
		NodeDLL_2511531019 curr_1019 = head_1019;
		while (curr_1019 != null) {
			System.out.print(curr_1019.data_1019 + " <---> ");
			curr_1019 = curr_1019.next_1019;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeDLL_2511531019 head_1019 = new NodeDLL_2511531019(2);
		head_1019.next_1019 = new NodeDLL_2511531019(3);
		head_1019.next_1019.prev_1019 = head_1019;
		head_1019.next_1019.next_1019 = new NodeDLL_2511531019(5);
		head_1019.next_1019.next_1019.prev_1019 = head_1019.next_1019;
		
		System.out.print("DLL Awal: ");
		printList_2511531019(head_1019);
		
		System.out.print("Simpul 1 ditambah di awal: ");
		head_1019 = insertBegin_2511531019(head_1019, 1);
		printList_2511531019(head_1019);
		
		System.out.print("Simpul 6 ditambah di akhir: ");
		int data1_1019 = 6;
		head_1019 = insertEnd_2511531019(head_1019, data1_1019);
		printList_2511531019(head_1019);
		
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_1019 = 4;
		int pos_1019 = 4;
		head_1019 = insertAtPosition_2511531019(head_1019, pos_1019, data2_1019);
		printList_2511531019(head_1019);
	}
}
