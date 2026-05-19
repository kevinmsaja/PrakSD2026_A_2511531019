package pekan7_2511531019;

public class InsertionSort_2511531019 {
	
	public static void insertionSort_2511531019(int[] arr_1019) {
		int n_1019 = arr_1019.length;
		for (int i_1019 = 1; i_1019 < n_1019; i_1019++) {
			int key_1019 = arr_1019[i_1019];
			int j_1019 = i_1019 - 1;
			while (j_1019 >= 0 && arr_1019[j_1019] > key_1019) {
				arr_1019[j_1019 + 1] = arr_1019[j_1019];
				j_1019--;
			}
			arr_1019[j_1019 + 1] = key_1019;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_1019[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1019 = arr_1019.length;
		System.out.printf("Array yang belum terurut:\n");
		for (int i_1019 = 0; i_1019 < n_1019; i_1019++) {
			System.out.print(arr_1019[i_1019] + " ");
		}
		System.out.println("");
		
		insertionSort_2511531019(arr_1019);
		System.out.printf("Array yang terurut:\n");
		for (int i_1019 = 0; i_1019 < n_1019; i_1019++) {
			System.out.print(arr_1019[i_1019] + " ");
		}
		System.out.println("");
	}
}