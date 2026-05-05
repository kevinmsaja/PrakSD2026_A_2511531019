package pekan5_2511531019;

public class HapusSLL_2511531019 {
	public static NodeSLL_2511531019 deleteHead_2511531019(NodeSLL_2511531019 head_1019) {
		//jika SLL kosong
		if (head_1019 == null) {
			return null;
		}
		//pindahkan head ke node berikutnya
		head_1019 = head_1019.next_1019;
		//Return head baru
		return head_1019;
	}
	//fungsi menghapus node terakhir SLL
	public static NodeSLL_2511531019 removeLastNode_2511531019(NodeSLL_2511531019 head_1019) {
		//jika list kosong, return null
		if (head_1019 == null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_1019.next_1019 == null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511531019 secondLast_1019 = head_1019;
		while (secondLast_1019.next_1019.next_1019 != null) {
			secondLast_1019 = secondLast_1019.next_1019;
		}
		//hapus node terakhir
		secondLast_1019.next_1019 = null;
		return head_1019;
	}
	public static NodeSLL_2511531019 deleteNode_2511531019(NodeSLL_2511531019 head_1019, int position_1019) {
		NodeSLL_2511531019 temp_1019 = head_1019;
		NodeSLL_2511531019 prev_1019 = null;
		//jika linked list null
		if (temp_1019 == null) {
			return head_1019;
		}
		//kasus 1 yakni head dihapus
		if (position_1019 == 1) {
			head_1019 = temp_1019.next_1019;
			return head_1019;
		}
		//kasus 2 yakni menghapus node di tengah
		//telusuri ke node yang dihapus
		for (int i_1019 = 1; temp_1019 != null && i_1019 < position_1019; i_1019++) {
			prev_1019 = temp_1019;
			temp_1019 = temp_1019.next_1019;
		}
		//jika ditemukan, hapus node
		if (temp_1019 != null) {
			prev_1019.next_1019 = temp_1019.next_1019;
		} else {
			System.out.println("Data tidak ada");
		}
		return head_1019;
	}
	public static void printList_2511531019(NodeSLL_2511531019 head_1019) {
		NodeSLL_2511531019 curr_1019 = head_1019;
		while (curr_1019.next_1019 != null) {
			System.out.print(curr_1019.data_1019 + "-->");
			curr_1019 = curr_1019.next_1019;
		}
		if (curr_1019.next_1019 == null) {
			System.out.print(curr_1019.data_1019);
		}
		System.out.println();
	}
	
	//kelas main
	public static void main(String[] args) {
		//buat SLL 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
		NodeSLL_2511531019 head_1019 = new NodeSLL_2511531019(1);
		head_1019.next_1019 = new NodeSLL_2511531019(2);
		head_1019.next_1019.next_1019 = new NodeSLL_2511531019(3);
		head_1019.next_1019.next_1019.next_1019 = new NodeSLL_2511531019(4);
		head_1019.next_1019.next_1019.next_1019.next_1019 = new NodeSLL_2511531019(5);
		head_1019.next_1019.next_1019.next_1019.next_1019.next_1019 = new NodeSLL_2511531019(6);
		
		// cetak list awal
		System.out.println("list awal: ");
		printList_2511531019(head_1019);
		
		//hapus head
		head_1019 = deleteHead_2511531019(head_1019);
		System.out.println("List setelah head dihapus: ");
		printList_2511531019(head_1019);
		
		//hapus node terakhir
		head_1019 = removeLastNode_2511531019(head_1019);
		System.out.println("List setelah simpul terakhir dihapus: ");
		printList_2511531019(head_1019);
		
		// Deleting node at position 2
		int position_1019 = 2;
		head_1019 = deleteNode_2511531019(head_1019, position_1019);
		// Print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2511531019(head_1019);
	}
}
