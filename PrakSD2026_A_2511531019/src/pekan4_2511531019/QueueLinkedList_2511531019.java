package pekan4_2511531019;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511531019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_1019 = new LinkedList<>();
		//tambah elemen (0,1,2,3,4,5) ke antrian
		for (int i_1019 = 0; i_1019 < 6; i_1019++) q_1019.add(i_1019);
		//menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_1019);
		//untuk menghapus kepala antrian
		int hapus_1019 = q_1019.remove();
		System.out.println("Hapus Elemen " + hapus_1019);
		System.out.println(q_1019);
		//untuk melihat antrian terdepan
		int depan_1019 = q_1019.peek();
		System.out.println("Kepala Antrian = " + depan_1019);
		
		int banyak_1019 = q_1019.size();
		System.out.println("Size Antrian = " + banyak_1019);
	}

}
