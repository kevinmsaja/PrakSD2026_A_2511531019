package pekan8_2511531019;

public class QuickSort_2511531019 {
	static void swap_2511531019(int[] arr_1019, int i_1019, int j_1019) {
		int temp_1019 = arr_1019[i_1019];
		arr_1019[i_1019] = arr_1019[j_1019];
		arr_1019[j_1019] = temp_1019;
		
	}
	
	static void medianofthree_2511531019(int[] arr_1019, int low_1019, int high_1019) {
		int mid_1019 = low_1019 + (high_1019 - low_1019) / 2;
		if (arr_1019[low_1019] > arr_1019[mid_1019]) {
			swap_2511531019(arr_1019, low_1019, mid_1019);
		}
		if (arr_1019[low_1019] > arr_1019[high_1019]) {
			swap_2511531019(arr_1019, low_1019, high_1019);
		}
		if (arr_1019[mid_1019] > arr_1019[high_1019]) {
			swap_2511531019(arr_1019, mid_1019, high_1019);
		}
		swap_2511531019(arr_1019, mid_1019, high_1019);
	}
	
	static int partition_2511531019(int[] arr_1019, int low_1019, int high_1019) {
		int pivot_1019 = arr_1019[high_1019];
		int i_1019 = (low_1019 - 1);
		for (int j_1019 = low_1019; j_1019 <= high_1019 - 1; j_1019++) {
			if (arr_1019[j_1019] < pivot_1019) {
				i_1019++;
				swap_2511531019(arr_1019, i_1019, j_1019);
			}
		}
		swap_2511531019(arr_1019, i_1019 + 1, high_1019);
		return (i_1019 + 1);
	}
	
	
	static void quickSort_2511531019(int[] arr_1019, int low_1019, int high_1019) {
		if (low_1019 < high_1019) {
			int pi_1019 = partition_2511531019(arr_1019, low_1019, high_1019);
			quickSort_2511531019(arr_1019, low_1019, pi_1019 - 1);
			quickSort_2511531019(arr_1019, pi_1019 + 1, high_1019);
		}
	}
	public static void printArr_2511531019(int[] arr) {
		for (int i_1019 = 0; i_1019 < arr.length; i_1019++) {
			System.out.print(arr[i_1019] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr_1019 = {10, 7, 8, 9, 1, 5};
		int N_1019 = arr_1019.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2511531019(arr_1019);
		
		quickSort_2511531019(arr_1019, 0, N_1019 - 1);
		System.out.print("Data terurut quick sort: ");
		printArr_2511531019(arr_1019);
	}
}
