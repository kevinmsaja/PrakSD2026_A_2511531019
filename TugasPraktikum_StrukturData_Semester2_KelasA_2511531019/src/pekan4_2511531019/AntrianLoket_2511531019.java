package pekan4_2511531019;
import java.util.Scanner;
public class AntrianLoket_2511531019 {
    
    public static void tampilkanMenu_2511531019() {
    	System.out.println("\n=== MENU ANTRIAN LOKET ===");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Balikkan Antrian");
        System.out.println("5. Keluar");
    }
    
    public static void tambahAntrian_2511531019(QueueCounter_2511531019 q_1019, Scanner input_1019) {
    	System.out.print("Masukkan nama: ");
    	String nama_1019;
        nama_1019 = input_1019.nextLine();
        q_1019.enqueue_1019(nama_1019);
    }
    
    public static void panggilAntrian_2511531019(QueueCounter_2511531019 q_1019) {
    	q_1019.dequeue_1019();
    }
    
    public static void tampilkanAntrian_2511531019(QueueCounter_2511531019 q_1019) {
    	q_1019.display_1019();
    }
    
    public static void balikkanAntrian_2511531019(QueueCounter_2511531019 q_1019) {
    	q_1019.Reverse_1019();
    }
    
    public static void main(String[] args) {
        Scanner input_1019 = new Scanner(System.in);
        QueueCounter_2511531019 q_1019 = new QueueCounter_2511531019();
        int pilihan_1019;
        do {
        	tampilkanMenu_2511531019();
            System.out.print("Pilih menu: ");
            pilihan_1019 = input_1019.nextInt();
            input_1019.nextLine();
            switch (pilihan_1019) {
                case 1:
                    tambahAntrian_2511531019(q_1019, input_1019);
                    break;
                case 2:
                	panggilAntrian_2511531019(q_1019);
                    break;
                case 3:
                	tampilkanAntrian_2511531019(q_1019);
                    break;
                case 4:
                    balikkanAntrian_2511531019(q_1019);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan_1019 != 5);
        input_1019.close();
    }
}