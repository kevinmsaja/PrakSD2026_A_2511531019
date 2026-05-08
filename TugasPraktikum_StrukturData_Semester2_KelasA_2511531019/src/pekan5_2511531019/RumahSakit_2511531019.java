package pekan5_2511531019;
import java.util.Scanner;
public class RumahSakit_2511531019 {
	
	public static void tampilkanMenu_2511531019() {
    	System.out.println("\n=== ANTRIAN RUMAH SAKIT NIM: 2511531019 ===");
        System.out.println("1. Daftarkan Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Cari Pasien");
        System.out.println("5. Cek Status Antrian");
        System.out.println("6. Keluar");
    }
	
	public static void daftarPasien_2511531019(Pasien_2511531019 rs_1019, Scanner daftar_1019) {
		System.out.print("Masukkan Nama Pasien: ");
		String namaPasien_1019 = daftar_1019.nextLine();
		System.out.print("Masukkan Keluhan: ");
		String penyakit_1019 = daftar_1019.nextLine();
		rs_1019.insertPasien_2511531019(namaPasien_1019, penyakit_1019);
	}
	
	public static void panggilPasien_2511531019(Pasien_2511531019 rs_1019) {
		rs_1019.panggilPasien_2511531019();
	}
	
	public static void tampilkanAntrian_2511531019(Pasien_2511531019 rs_1019) {
		rs_1019.tampilkanPasien_2511531019();
	}
	
	public static void cariPasien_2511531019(Pasien_2511531019 rs_1019, Scanner cari_1019) {
		System.out.print("Masukkan nama pasien yang dicari: ");
        String cariPasien_1019 = cari_1019.nextLine();
		rs_1019.cariPasien_2511531019(cariPasien_1019);
	}
	
	public static void cekStatusAntrian_2511531019(Pasien_2511531019 rs_1019) {
		rs_1019.cekStatus_2511531019();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input_1019 = new Scanner(System.in);
        Pasien_2511531019 rs_1019 = new Pasien_2511531019(null, null, 0);
        int pilihan_1019;
        do {
        	tampilkanMenu_2511531019();
            System.out.print("Pilih menu: ");
            pilihan_1019 = input_1019.nextInt();
            input_1019.nextLine();
            switch (pilihan_1019) {
                case 1:
                    daftarPasien_2511531019(rs_1019, input_1019);
                    break;
                case 2:
                	panggilPasien_2511531019(rs_1019);
                    break;
                case 3:
                	tampilkanAntrian_2511531019(rs_1019);
                    break;
                case 4:
                    cariPasien_2511531019(rs_1019, input_1019);
                    break;
                case 5:
                	cekStatusAntrian_2511531019(rs_1019);
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
