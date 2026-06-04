package pekan8_2511531019;

public class MergeSort_2511531019 {
	void merge_2511531019(int arr_1019[], int l_1019, int m_1019, int r_1019) {
		int n1_1019 = m_1019 - l_1019 + 1;
		int n2_1019 = r_1019 - m_1019;
		
		int L_1019[] = new int[n1_1019];
		int R_1019[] = new int[n2_1019];
		
		for (int i_1019 = 0; i_1019 < n1_1019; ++i_1019) {
			L_1019[i_1019] = arr_1019[l_1019 + i_1019];
		}
		for (int j_1019 = 0; j_1019 < n2_1019; ++j_1019) {
			R_1019[j_1019] = arr_1019[m_1019 + 1 + j_1019];
		}
		int i_1019 = 0, j_1019 = 0;
		
		int k_1019 = l_1019;
		while (i_1019 < n1_1019 && j_1019 < n2_1019) {
			if (L_1019[i_1019] <= R_1019[j_1019]) {
				arr_1019[k_1019] = L_1019[i_1019];
				i_1019++;
			} else {
				arr_1019[k_1019] = R_1019[j_1019];
				j_1019++;
			}
			k_1019++;
		}
		
		while (i_1019 < n1_1019) {
			arr_1019[k_1019] = L_1019[i_1019];
			i_1019++;
			k_1019++;
		}
		
		while (j_1019 < n2_1019) {
			arr_1019[k_1019] = R_1019[j_1019];
			j_1019++;
			k_1019++;
		}
	}
	
	void sort_2511531019(int arr_1019[], int l_1019, int r_1019) {
		if (l_1019 < r_1019) {
			int m_1019 = (l_1019 + r_1019) / 2;
			
			sort_2511531019(arr_1019, l_1019, m_1019);
			sort_2511531019(arr_1019, m_1019 + 1, r_1019);
			
			merge_2511531019(arr_1019, l_1019, m_1019, r_1019);
		}
	}
	
	static void printArray_2511531019(int arr_1019[]) {
		int n_1019 = arr_1019.length;
		for (int i_1019 = 0; i_1019 < n_1019; ++i_1019) {
			System.out.print(arr_1019[i_1019] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr_1019[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Sebelum terurut: ");
		printArray_2511531019(arr_1019);
		
		MergeSort_2511531019 ob_1019 = new MergeSort_2511531019();
		ob_1019.sort_2511531019(arr_1019, 0, arr_1019.length - 1);
		System.out.println("\nSesudah terurut menggunakan merge sort: ");
		printArray_2511531019(arr_1019);
	}
}
