package pekan3_2511531019;
import java.util.Stack;
public class NilaiMaksimum_2511531019 {
	public static int max_1019(Stack<Integer> s_1019) {
		Stack<Integer> backup_1019 = new Stack<Integer>();
		int maxValue_1019 = s_1019.pop();
		backup_1019.push(maxValue_1019);
		while (!s_1019.isEmpty()) {
			int next_1019 = s_1019.pop();
			backup_1019.push(next_1019);
			maxValue_1019 = Math.max(maxValue_1019, next_1019);
		}
		while (!backup_1019.isEmpty()) {
			s_1019.push(backup_1019.pop());
		}
		return maxValue_1019;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s_1019 = new Stack<Integer>();
		s_1019.push(70);
		s_1019.push(12);
		s_1019.push(20);
		System.out.println("Isi Stack " + s_1019);
		System.out.println("Stack Teratas " + s_1019.peek());
		System.out.println("Nilai Maksimum " + max_1019(s_1019));
	}

}
