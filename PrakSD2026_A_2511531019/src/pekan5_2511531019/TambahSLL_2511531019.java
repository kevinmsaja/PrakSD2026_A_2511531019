package pekan5_2511531019;

public class TambahSLL_2511531019 {
	public static NodeSLL_2511531019 insertAtFront_2511531019(NodeSLL_2511531019 head_1019, int value_1019) {
		NodeSLL_2511531019 new_node_1019 = new NodeSLL_2511531019(value_1019);
		new_node_1019.next_1019 = head_1019;
		return new_node_1019;
	}
	
	//fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511531019 insertAtEnd_2511531019(NodeSLL_2511531019 head_1019, int value_1019) {
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511531019 newNode_1019 = new NodeSLL_2511531019(value_1019);
		//jika list kosong maka node jadi head
		if (head_1019 == null) {
			return newNode_1019;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511531019 last_1019 = head_1019;
		//telusuri ke node akhir
		while (last_1019.next_1019 != null) {
			last_1019 = last_1019.next_1019;
		}
		//ubah pointer
		last_1019.next_1019 = newNode_1019;
		return head_1019;
	}
	
	static NodeSLL_2511531019 GetNode_2511531019(int data_1019) {
		return new NodeSLL_2511531019(data_1019);
	}
	
	static NodeSLL_2511531019 insertPos_2511531019(NodeSLL_2511531019 headNode_1019, int position_1019, int value_1019) {
		NodeSLL_2511531019 head_1019 = headNode_1019;
		if (position_1019 < 1) {
			System.out.print("Invalid Position");
		}
		if (position_1019 == 1) {
			NodeSLL_2511531019 new_Node_1019 = new NodeSLL_2511531019(value_1019);
			new_Node_1019.next_1019 = head_1019;
			return new_Node_1019;
		} else {
			while (position_1019-- != 0) {
				if (position_1019 == 1) {
					NodeSLL_2511531019 newNode_1019 = GetNode_2511531019(value_1019);
					newNode_1019.next_1019 = headNode_1019.next_1019;
					headNode_1019.next_1019 = newNode_1019;
					break;
				}
				headNode_1019 = headNode_1019.next_1019;
			}
			if (position_1019 != 1) {
				System.out.print("Posisi di luar jangkauan");
			}
		}
		return head_1019;
	}
	
	public static void printList_2511531019(NodeSLL_2511531019 head_1019) {
		NodeSLL_2511531019 curr_1019 = head_1019;
		while (curr_1019.next_1019 != null) {
			System.out.print(curr_1019.data_1019 + " --> ");
			curr_1019 = curr_1019.next_1019;
		}
		if (curr_1019.next_1019 == null) {
			System.out.print(curr_1019.data_1019);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//buat linked list 2 --> 3 --> 5 --> 6
		NodeSLL_2511531019 head_1019 = new NodeSLL_2511531019(2);
		head_1019.next_1019 = new NodeSLL_2511531019(3);
		head_1019.next_1019.next_1019 = new NodeSLL_2511531019(5);
		head_1019.next_1019.next_1019.next_1019 = new NodeSLL_2511531019(6);
		//cetak list asli
		System.out.print("Senarai berantai awal: ");
		printList_2511531019(head_1019);
		//tambahkan node baru di depan
		System.out.print("tambah 1 simpul di depan: ");
		int data1_1019 = 1;
		head_1019 = insertAtFront_2511531019(head_1019, data1_1019);
		//cetak update list
		printList_2511531019(head_1019);
		//tambahkan node baru di belakang
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_1019 = 7;
		head_1019 = insertAtEnd_2511531019(head_1019, data2_1019);
		//cetak update list
		printList_2511531019(head_1019);
		
		int data3_1019 = 4;
		int pos_1019 = 4;
		head_1019 = insertPos_2511531019(head_1019, pos_1019, data3_1019);
		//cetak update list
		printList_2511531019(head_1019);
	}
}