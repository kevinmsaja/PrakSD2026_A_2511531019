package pekan6_2511531019;
import java.util.Scanner;
public class Musik_2511531019 {

	public static void tampilkanMenu_2511531019() {
    	System.out.println("\n=== Playlist Musik NIM: 2511531019 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Hapus Lagu Pertama");
        System.out.println("3. Lihat Playlist (Maju)");
        System.out.println("4. Lihat Playlist (Mundur)");
        System.out.println("5. Cari Lagu");
        System.out.println("6. Keluar");
    }
	
	public static void tambahLagu_2511531019(Lagu_2511531019 pl_1019, Scanner tambah_1019) {
		System.out.print("Masukkan Nama Lagu: ");
		String namaLagu_1019 = tambah_1019.nextLine();
		System.out.print("Masukkan Penyanyi/Grup Band: ");
		String penyanyi_1019 = tambah_1019.nextLine();
		pl_1019.tambahLagu_1019(namaLagu_1019, penyanyi_1019);
	}
	
	public static void hapusLaguAwal_2511531019(Lagu_2511531019 pl_1019) {
		pl_1019.hapusLaguAwal_1019();
	}
	
	public static void tampilMaju_2511531019(Lagu_2511531019 pl_1019) {
		pl_1019.tampilMaju_1019();
	}
	
	public static void tampilMundur_2511531019(Lagu_2511531019 pl_1019) {
		pl_1019.tampilMundur_1019();
	}
	
	public static void cariLagu_2511531019(Lagu_2511531019 pl_1019, Scanner cari_1019) {
		System.out.print("Masukkan judul lagu yang dicari: ");
        String judulLagu_1019 = cari_1019.nextLine();
        pl_1019.cariLagu_1019(judulLagu_1019);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input_1019 = new Scanner(System.in);
        Lagu_2511531019 pl_1019 = new Lagu_2511531019(null, null);
        int pilihan_1019;
        do {
        	tampilkanMenu_2511531019();
            System.out.print("Pilih menu: ");
            pilihan_1019 = input_1019.nextInt();
            input_1019.nextLine();
            switch (pilihan_1019) {
                case 1:
                    tambahLagu_2511531019(pl_1019, input_1019);
                    break;
                case 2:
                	hapusLaguAwal_2511531019(pl_1019);
                    break;
                case 3:
                	tampilMaju_2511531019(pl_1019);
                    break;
                case 4:
                    tampilMundur_2511531019(pl_1019);
                    break;
                case 5:
                	cariLagu_2511531019(pl_1019, input_1019);
                	break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan_1019 != 6);
        input_1019.close();
	}

}
