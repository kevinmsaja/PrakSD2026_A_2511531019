package pekan2_2511531019;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531019 {

	public static void tampilkanMenu_2511531019() {
		System.out.println("\n=== Playlist Musik NIM 2511531019 ===");
		System.out.println("1. Tambah lagu");
		System.out.println("2. Lihat playlist");
		System.out.println("3. Hapus lagu");
		System.out.println("4. Cari lagu");
		System.out.println("5. Keluar");
	}
	
	public static void tambahMusik_2511531019(ArrayList<Musik_2511531019> list_1019, Scanner sc_1019) {
		System.out.print("Masukkan Judul: ");
		String namaLagu_1019 = sc_1019.nextLine();
		System.out.print("Masukkan Penyanyi: ");
		String namaPenyanyi_1019 = sc_1019.nextLine();
		System.out.print("Durasi (dalam detik): ");
		int lamaDurasiDetik_1019 = sc_1019.nextInt();
		list_1019.add(new Musik_2511531019(namaLagu_1019, namaPenyanyi_1019, lamaDurasiDetik_1019));
		System.out.println("Musik Anda berhasil ditambahkan.");
	}
	
	public static void tampilkanSemuaMusik_2511531019(ArrayList<Musik_2511531019> list_1019) {
		if (list_1019.isEmpty()) {
			System.out.println("Daftar Musik kosong.");
		} else {
			System.out.println("Data Musik:");
			for (Musik_2511531019 musik_1019 : list_1019) {
				System.out.println(musik_1019);
			}
		}
	}
	
	public static void hapusMusik_2511531019(ArrayList<Musik_2511531019> list_1019, Scanner sc_1019) {
		System.out.print("Judul lagu yang akan dihapus: ");
		String hapusMusik_1019 = sc_1019.nextLine();
		boolean removed_1019 = list_1019.removeIf(musik_1019 -> musik_1019.judul_1019.equals(hapusMusik_1019));
		
		if (removed_1019) {
			System.out.println("Lagu dengan judul " + hapusMusik_1019 + " berhasil dihapus.");
		} else {
			System.out.println("Lagu yang Anda cari tidak dapat ditemukan.");
		}
	}
	
	public static void cariMusik_2511531019(ArrayList<Musik_2511531019> list_1019, Scanner sc_1019) {
		System.out.print("Masukkan lagu yang kamu cari: ");
		String cariMusik_1019 = sc_1019.nextLine();
		boolean found_1019 = false;
		
		for (Musik_2511531019 musik_1019 : list_1019) {
			if (musik_1019.judul_1019.equals(cariMusik_1019)) {
				System.out.println("Hasil Pencarian: " + musik_1019);
				found_1019 = true;
				break;
			}
		}
		if (!found_1019) {
			System.out.println("Lagu yang Anda cari tidak ada.");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Musik_2511531019> playList_1019 = new ArrayList<>();
		Scanner scannerInput_1019 = new Scanner(System.in);
		int choice_1019;
		do {
			tampilkanMenu_2511531019();
			System.out.print("Pilih Menu: ");
			choice_1019 = scannerInput_1019.nextInt();
			scannerInput_1019.nextLine();
			
			switch (choice_1019) {
			case 1:
				tambahMusik_2511531019(playList_1019, scannerInput_1019);
				break;
			case 2:
				tampilkanSemuaMusik_2511531019(playList_1019);
				break;
			case 3:
				hapusMusik_2511531019(playList_1019, scannerInput_1019);
				break;
			case 4:
				cariMusik_2511531019(playList_1019, scannerInput_1019);
				break;
			case 5:
				System.out.println("Keluar dari program.");
				break;
			default:
				System.out.println("Pilihan tidak valid.");
			}
		} while (choice_1019 != 5);
		scannerInput_1019.close();
	}
}