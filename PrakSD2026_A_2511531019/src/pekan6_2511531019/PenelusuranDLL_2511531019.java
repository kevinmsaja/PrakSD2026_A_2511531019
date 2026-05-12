package pekan6_2511531019;

public class PenelusuranDLL_2511531019 {
	static void forwardTraversal_2511531019(NodeDLL_2511531019 head_1019) {
		NodeDLL_2511531019 curr_1019 = head_1019;
		while (curr_1019 != null) {
			System.out.print(curr_1019.data_1019 + " <---> ");
			curr_1019 = curr_1019.next_1019;
		}
		System.out.println();
	}
	
	static void backwardTraversal_2511531019(NodeDLL_2511531019 tail_1019) {
		NodeDLL_2511531019 curr_1019 = tail_1019;
		while (curr_1019 != null) {
			System.out.print(curr_1019.data_1019 + " <---> ");
			curr_1019 = curr_1019.prev_1019;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL_2511531019 head_1019 = new NodeDLL_2511531019(1);
		NodeDLL_2511531019 second_1019 = new NodeDLL_2511531019(2);
		NodeDLL_2511531019 third_1019 = new NodeDLL_2511531019(3);
		
		head_1019.next_1019 = second_1019;
		second_1019.prev_1019 = head_1019;
		second_1019.next_1019 = third_1019;
		third_1019.prev_1019 = second_1019;
		
		System.out.println("Penelusuran Maju:");
		forwardTraversal_2511531019(head_1019);
		
		System.out.println("Penelusuran Mundur:");
		backwardTraversal_2511531019(third_1019);
	}

}
