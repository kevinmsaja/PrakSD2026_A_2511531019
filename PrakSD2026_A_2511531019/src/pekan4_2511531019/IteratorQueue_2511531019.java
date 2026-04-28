package pekan4_2511531019;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class IteratorQueue_2511531019 {
	public static void main(String args[]) {
		Queue<String> q_1019 = new LinkedList<>();
		q_1019.add("Praktikum");
		q_1019.add("Struktur");
		q_1019.add("Data");
		q_1019.add("Dan");
		q_1019.add("Algoritma");
		Iterator<String> iterator_1019 = q_1019.iterator();
		while (iterator_1019.hasNext()) {
			System.out.print(iterator_1019.next() + " ");
		}
	}
}
