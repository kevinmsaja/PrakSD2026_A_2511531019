package pekan8_2511531019;

public class ShellSort_2511531019 {

	public static void shellSort_2511531019(int[] A_1019) {
		int n_1019 = A_1019.length;
		int gap_1019 = n_1019 / 2;
		while (gap_1019 > 0) {
			for (int i_1019 = gap_1019; i_1019 < n_1019; i_1019++) {
				int temp_1019 = A_1019[i_1019];
				int j_1019 = i_1019;
				while (j_1019 >= gap_1019 && A_1019[j_1019 - gap_1019] > temp_1019) {
					A_1019[j_1019] = A_1019[j_1019 - gap_1019];
					j_1019 = j_1019 - gap_1019;
				}
				A_1019[j_1019] = temp_1019;
			}
			gap_1019 = gap_1019 / 2;
		}
	}
	
	public static void printArray_2511531019(int[] arr_1019) {
		for (int i_1019 : arr_1019) {
			System.out.print(i_1019 + " ");
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data_1019 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray_2511531019(data_1019);
		
		shellSort_2511531019(data_1019);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_2511531019(data_1019);
		
	}
}