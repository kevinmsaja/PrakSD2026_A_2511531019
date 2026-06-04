package pekan8_2511531019;
import java.util.Scanner;
public class Sorting_2511531019 {
	Lagu_2511531019[] dataLagu_1019 = new Lagu_2511531019[20];
    int jumlah_1019 = 0;

    public void inputData_2511531019() {
        dataLagu_1019[0] = new Lagu_2511531019("Sesi Potret", "Fourtwenty", 270);
        dataLagu_1019[1] = new Lagu_2511531019("Jangan Paksa Rindu - Beda", "Ifan Seventeen", 252);
        dataLagu_1019[2] = new Lagu_2511531019("Mungkin di Depan Buram", "Idgitaf", 196);
        dataLagu_1019[3] = new Lagu_2511531019("Bersenja Gurau", "Raim Laode", 180);
        dataLagu_1019[4] = new Lagu_2511531019("Rabun Jauh", "Bernadya", 210);
        dataLagu_1019[5] = new Lagu_2511531019("Ada Titik-titik di Ujung Doa", "Sal Priadi", 240);
        dataLagu_1019[6] = new Lagu_2511531019("Senang Dengar Suaramu Lagi", "Ariel NOAH & Raisa", 200);
        jumlah_1019 = 7;
    }

    public void tampilData_2511531019() {
        for (int i_1019 = 0; i_1019 < jumlah_1019; i_1019++) {
            System.out.println((i_1019 + 1) + ". " + dataLagu_1019[i_1019].judul_1019 + 
            		" - " + dataLagu_1019[i_1019].durasi_1019 + " detik");
        }
    }
    
    public void shellSort_2511531019() {
        int n_1019 = jumlah_1019;
        for (int gap_1019 = n_1019/2; gap_1019 > 0; gap_1019 /= 2) {
            for (int i_1019 = gap_1019; i_1019 < n_1019; i_1019++) {
                Lagu_2511531019 temp_1019 = dataLagu_1019[i_1019];
                int j_1019;
                for (j_1019 = i_1019; j_1019 >= gap_1019 && dataLagu_1019[j_1019 - gap_1019]
                		.judul_1019.compareToIgnoreCase(temp_1019.judul_1019) > 0; j_1019 -= gap_1019) {
                    dataLagu_1019[j_1019] = dataLagu_1019[j_1019 - gap_1019];
                }
                dataLagu_1019[j_1019] = temp_1019;
            }
        }
    }
    
    public void quickSort_2511531019(int low_1019, int high_1019) {
        if (low_1019 < high_1019) {
            int pi_1019 = partition_2511531019(low_1019, high_1019);
            quickSort_2511531019(low_1019, pi_1019 - 1);
            quickSort_2511531019(pi_1019 + 1, high_1019);
        }
    }
    private int partition_2511531019(int low_1019, int high_1019) {
        int pivot_1019 = dataLagu_1019[high_1019].durasi_1019;
        int i_1019 = (low_1019 - 1);
        for (int j_1019 = low_1019; j_1019 < high_1019; j_1019++) {
            if (dataLagu_1019[j_1019].durasi_1019 <= pivot_1019) {
                i_1019++;
                Lagu_2511531019 temp_1019 = dataLagu_1019[i_1019];
                dataLagu_1019[i_1019] = dataLagu_1019[j_1019];
                dataLagu_1019[j_1019] = temp_1019;
            }
        }
        Lagu_2511531019 temp_1019 = dataLagu_1019[i_1019 + 1];
        dataLagu_1019[i_1019 + 1] = dataLagu_1019[high_1019];
        dataLagu_1019[high_1019] = temp_1019;
        return i_1019 + 1;
    }
    
    public void mergeSort_2511531019(int left_1019, int right_1019) {
        if (left_1019 < right_1019) {
            int mid_1019 = (left_1019 + right_1019) / 2;
            mergeSort_2511531019(left_1019, mid_1019);
            mergeSort_2511531019(mid_1019 + 1, right_1019);
            merge_2511531019(left_1019, mid_1019, right_1019);
        }
    }
    private void merge_2511531019(int left_1019, int mid_1019, int right_1019) {
        int n1_1019 = mid_1019 - left_1019 + 1;
        int n2_1019 = right_1019 - mid_1019;

        Lagu_2511531019[] L_1019 = new Lagu_2511531019[n1_1019];
        Lagu_2511531019[] R_1019 = new Lagu_2511531019[n2_1019];

        for (int i_1019 = 0; i_1019 < n1_1019; i_1019++) {
        	L_1019[i_1019] = dataLagu_1019[left_1019 + i_1019];
        }
        for (int j_1019 = 0; j_1019 < n2_1019; j_1019++) {
        	R_1019[j_1019] = dataLagu_1019[mid_1019 + 1 + j_1019];
        }

        int i_1019 = 0, j_1019 = 0, k_1019 = left_1019;
        while (i_1019 < n1_1019 && j_1019 < n2_1019) {
            if (L_1019[i_1019].judul_1019.compareToIgnoreCase(R_1019[j_1019].judul_1019) <= 0) {
                dataLagu_1019[k_1019] = L_1019[i_1019];
                i_1019++;
            } else {
                dataLagu_1019[k_1019] = R_1019[j_1019];
                j_1019++;
            }
            k_1019++;
        }
        while (i_1019 < n1_1019) {
            dataLagu_1019[k_1019] = L_1019[i_1019];
            i_1019++; k_1019++;
        }
        while (j_1019 < n2_1019) {
            dataLagu_1019[k_1019] = R_1019[j_1019];
            j_1019++; k_1019++;
        }
    }
    
    public void pilihAlgoritma_2511531019() {
        Scanner sc_1019 = new Scanner(System.in);
        System.out.println("=== Sorting Playlist ===");
        System.out.print("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilihan_1019 = sc_1019.nextInt();
        sc_1019.close();

        System.out.println("Data Sebelum Sorting:");
        tampilData_2511531019();

        switch (pilihan_1019) {
            case 1:
                shellSort_2511531019();
                System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
                break;
            case 2:
                quickSort_2511531019(0, jumlah_1019 - 1);
                System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
                break;
            case 3:
                mergeSort_2511531019(0, jumlah_1019 - 1);
                System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        tampilData_2511531019();
    }

    public static void main(String[] args) {
        Sorting_2511531019 s_1019 = new Sorting_2511531019();
        s_1019.inputData_2511531019();
        s_1019.pilihAlgoritma_2511531019();
    }
}
