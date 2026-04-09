package pekan3_2511531019;

public class stackArray_2511531019 {
	static final int MAX_1019 = 100;
	int top_1019;
	int a_1019[] = new int[MAX_1019];
	boolean isEmpty_1019() {
		return (top_1019 < 0);
	}
	stackArray_2511531019() {
		top_1019 = -1;
	}
	boolean push_1019(int x) {
		if (top_1019 >= (MAX_1019 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a_1019[++top_1019] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_1019() {
		if (top_1019 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a_1019[top_1019--];
			return x;
		}
	}
	int peek_1019() {
		if (top_1019 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a_1019[top_1019];
			return x;
		}
	}
	void print_1019() {
		for (int i = top_1019; i > -1; i--) {
			System.out.print(" " + a_1019[i]);
		}
	}
}