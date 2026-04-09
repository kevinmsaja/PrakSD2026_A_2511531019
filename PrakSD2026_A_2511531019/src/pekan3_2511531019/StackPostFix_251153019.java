package pekan3_2511531019;
import java.util.Scanner;
import java.util.Stack;
public class StackPostFix_251153019 {
	public static int postfixEvaluate_1019(String expression) {
		Stack<Integer> s_1019 = new Stack<Integer>();
		Scanner input_1019 = new Scanner(expression);
		while (input_1019.hasNext()) {
			if (input_1019.hasNextInt()) {
				s_1019.push(input_1019.nextInt());
			} else {
				String operator_1019 = input_1019.next();
				int operand2_1019 = s_1019.pop();
				int operand1_1019 = s_1019.pop();
				if (operator_1019.equals("+")) {
					s_1019.push(operand1_1019 + operand2_1019);
				} else if (operator_1019.equals("-")) {
					s_1019.push(operand1_1019 - operand2_1019);
				} else if (operator_1019.equals("*")) {
					s_1019.push(operand1_1019 * operand2_1019);
				} else {
					s_1019.push(operand1_1019 / operand2_1019);
				}
			}
		}
		input_1019.close();
		return s_1019.pop();
	}
	public static void main(String[] args) {
		System.out.println("Hasil postfix = " + postfixEvaluate_1019("5 2 4 * + 7 -"));
	}
}
