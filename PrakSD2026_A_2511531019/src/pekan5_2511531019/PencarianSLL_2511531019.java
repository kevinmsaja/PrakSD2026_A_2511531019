package pekan5_2511531019;

public class PencarianSLL_2511531019 {
	static boolean searchKey_2511531019(NodeSLL_2511531019 head_1019, int key_1019) {
		NodeSLL_2511531019 curr_1019 = head_1019;
		while (curr_1019 != null) {
			if (curr_1019.data_1019 == key_1019) {
				return true;
			}
			curr_1019 = curr_1019.next_1019;
		}
		return false;
	}
	public static void traversal_2511531019(NodeSLL_2511531019 head_1019) {
		//mulai dari head
		NodeSLL_2511531019 curr_1019 = head_1019;
		//telusuri sampai pointer null
		while (curr_1019 != null) {
			System.out.print(" " + curr_1019.data_1019);
			curr_1019 = curr_1019.next_1019;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeSLL_2511531019 head_1019 = new NodeSLL_2511531019(14);
		head_1019.next_1019 = new NodeSLL_2511531019(21);
		head_1019.next_1019.next_1019 = new NodeSLL_2511531019(13);
		head_1019.next_1019.next_1019.next_1019 = new NodeSLL_2511531019(30);
		head_1019.next_1019.next_1019.next_1019.next_1019 = new NodeSLL_2511531019(10);
		System.out.print("Penelusuran SLL: ");
		traversal_2511531019(head_1019);
		
		//data yang akan dicari
		int key_1019 = 30;
		System.out.print("cari data " + key_1019 + " = ");
		if (searchKey_2511531019(head_1019, key_1019)) {
			System.out.println("ketemu");
		} else {
			System.out.println("tidak ada");
		}
	}
}
