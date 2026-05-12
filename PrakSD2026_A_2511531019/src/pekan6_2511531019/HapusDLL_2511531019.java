package pekan6_2511531019;

public class HapusDLL_2511531019 {
	public static NodeDLL_2511531019 delHead_2511531019(NodeDLL_2511531019 head_1019) {
		if (head_1019 == null) {
			return null;
		}
		NodeDLL_2511531019 temp_1019 = head_1019;
		head_1019 = head_1019.next_1019;
		if (head_1019 != null) {
			head_1019.prev_1019 = null;
		}
		return head_1019;
	}
	
	public static NodeDLL_2511531019 delLast_2511531019(NodeDLL_2511531019 head_1019) {
		if (head_1019 == null) {
			return null;
		}
		if (head_1019.next_1019 == null) {
			return null;
		}
		NodeDLL_2511531019 curr_1019 = head_1019;
		while (curr_1019.next_1019 != null) {
			curr_1019 = curr_1019.next_1019;
		}
		if (curr_1019.prev_1019 != null) {
			curr_1019.prev_1019.next_1019 = null;
		}
		return head_1019;
	}
	
	public static NodeDLL_2511531019 delPos_2511531019(NodeDLL_2511531019 head_1019, int pos_1019) {
		if (head_1019 == null) {
			return head_1019;
		}
		NodeDLL_2511531019 curr_1019 = head_1019;
		for (int i_1019 = 1; curr_1019 != null && i_1019 < pos_1019; ++i_1019) {
			curr_1019 = curr_1019.next_1019;
		}
		if (curr_1019 == null) {
			return head_1019;
		}
		if (curr_1019.prev_1019 != null) {
			curr_1019.prev_1019.next_1019 = curr_1019.next_1019;
		}
		if (curr_1019.next_1019 != null) {
			curr_1019.next_1019.prev_1019 = curr_1019.prev_1019;
		}
		if (head_1019 == curr_1019) {
			head_1019 = curr_1019.next_1019;
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
		// TODO Auto-generated method stub
		NodeDLL_2511531019 head_1019 = new NodeDLL_2511531019(1);
		head_1019.next_1019 = new NodeDLL_2511531019(2);
		head_1019.next_1019.prev_1019 = head_1019;
		head_1019.next_1019.next_1019 = new NodeDLL_2511531019(3);
		head_1019.next_1019.next_1019.prev_1019 = head_1019.next_1019;
		head_1019.next_1019.next_1019.next_1019 = new NodeDLL_2511531019(4);
		head_1019.next_1019.next_1019.next_1019.prev_1019 = head_1019.next_1019.next_1019;
		head_1019.next_1019.next_1019.next_1019.next_1019 = new NodeDLL_2511531019(5);
		head_1019.next_1019.next_1019.next_1019.next_1019.prev_1019 = head_1019.next_1019.next_1019.next_1019;
		
		System.out.print("DLL Awal: ");
		printList_2511531019(head_1019);
		
		System.out.print("Setelah head dihapus: ");
		head_1019 = delHead_2511531019(head_1019);
		printList_2511531019(head_1019);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_1019 = delLast_2511531019(head_1019);
		printList_2511531019(head_1019);
		
		System.out.print("menghapus node ke 2: ");
		head_1019 = delPos_2511531019(head_1019, 2);
		printList_2511531019(head_1019);
	}

}
