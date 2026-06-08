package pekan9_2511531019;

public class BTreeDriver_2511531019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Membuat pohon
		BTree_2511531019 tree_1019 = new BTree_2511531019();
		System.out.print("Jumlah simpul awal pohon: ");
		System.out.println(tree_1019.countNodes_2511531019());
		
		//menambahkan simpul data 1
		Node_2511531019 root_1019 = new Node_2511531019(1);
		//menjadikan simpul 1 sebagai root
		tree_1019.setRoot_2511531019(root_1019);
		System.out.println("Jumlah simpul jika hanya ada root:");
		System.out.println(tree_1019.countNodes_2511531019());
		Node_2511531019 node2_1019 = new Node_2511531019(2);
		Node_2511531019 node3_1019 = new Node_2511531019(3);
		Node_2511531019 node4_1019 = new Node_2511531019(4);
		Node_2511531019 node5_1019 = new Node_2511531019(5);
		Node_2511531019 node6_1019 = new Node_2511531019(6);
		Node_2511531019 node7_1019 = new Node_2511531019(7);
		Node_2511531019 node8_1019 = new Node_2511531019(8);
		Node_2511531019 node9_1019 = new Node_2511531019(9);
		root_1019.setLeft_2511531019(node2_1019);
		node2_1019.setLeft_2511531019(node4_1019);
		node2_1019.setRight_2511531019(node5_1019);
		node4_1019.setRight_2511531019(node8_1019);
		root_1019.setRight_2511531019(node3_1019);
		node3_1019.setLeft_2511531019(node6_1019);
		node3_1019.setRight_2511531019(node7_1019);
		node6_1019.setLeft_2511531019(node9_1019);
		
		//set root
		tree_1019.setCurrent_2511531019(tree_1019.getRoot_2511531019());
		System.out.println("Menampilkan simpul terakhir: ");
		System.out.println(tree_1019.getCurrent_2511531019().getData_2511531019());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_1019.countNodes_2511531019());
		System.out.println("InOrder: ");
		tree_1019.printInorder_2511531019();
		System.out.println("\nPreOrder: ");
		tree_1019.printPreorder_2511531019();
		System.out.println("\nPostOrder: ");
		tree_1019.printPostorder_2511531019();
		System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
		tree_1019.print_2511531019();
	}

}
