package pekan4_2511531019;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseData_2511531019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q_1019 = new LinkedList<Integer>();
		q_1019.add(1);
		q_1019.add(2);
		q_1019.add(3); // [1, 2, 3]
		System.out.println("Sebelum reverse = " + q_1019);
		Stack<Integer> s_1019 = new Stack<Integer>();
		while (!q_1019.isEmpty()) { // Q -> S
			s_1019.push(q_1019.remove());
		}
		while (!s_1019.isEmpty()) { // S -> Q
			q_1019.add(s_1019.pop());
		}
		System.out.println("Sesudah reverse = " + q_1019);
	}

}
