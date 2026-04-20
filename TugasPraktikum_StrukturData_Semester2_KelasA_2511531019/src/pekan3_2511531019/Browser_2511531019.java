package pekan3_2511531019;
import java.util.Stack;
import java.util.Scanner;

public class Browser_2511531019 {

	public static void tampilkanMenu_2511531019() {
		System.out.println("\n=== Browser History NIM 2511531019 ===");
		System.out.println("1. Kunjungi Website (Push)");
		System.out.println("2. Tombol Back (Pop)");
		System.out.println("3. Lihat Halaman Aktif (Peek)");
		System.out.println("4. Keluar");
	}
	
	public static void pushWeb_2511531019(Stack<Website_2511531019> browseStack_1019, Scanner sc_1019) {
		System.out.print("Masukkan nama situs: ");
		String namaSitus_1019 = sc_1019.nextLine();
		System.out.print("Masukkan URL: ");
		String url_1019 = sc_1019.nextLine();
		browseStack_1019.push(new Website_2511531019(namaSitus_1019, url_1019));
		System.out.println("Berhasil mengunjungi halaman.");
	}
	
	public static void popWeb_2511531019(Stack<Website_2511531019> browseStack_1019) {
		if (!browseStack_1019.isEmpty()) {
            Website_2511531019 removed = browseStack_1019.pop();
            System.out.println("Kembali dari: " + removed);
        } else {
            System.out.println("Situs Stack kosong, tidak bisa kembali.");
        }
	}
	
	public static void peekWeb_2511531019(Stack<Website_2511531019> browseStack_1019) {
		if (!browseStack_1019.isEmpty()) {
            System.out.println("Situs saat ini:");
            System.out.println(browseStack_1019.peek());
        } else {
            System.out.println("Belum ada situs yang dikunjungi.");
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Website_2511531019> urlBrowse_1019 = new Stack<>();
		Scanner scannerInput_1019 = new Scanner(System.in);
		int choice_1019;
		do {
			tampilkanMenu_2511531019();
			System.out.print("Pilih Menu: ");
			choice_1019 = scannerInput_1019.nextInt();
			scannerInput_1019.nextLine();
			
			switch (choice_1019) {
			case 1:
				pushWeb_2511531019(urlBrowse_1019, scannerInput_1019);
				break;
			case 2:
				popWeb_2511531019(urlBrowse_1019);
				break;
			case 3:
				peekWeb_2511531019(urlBrowse_1019);
				break;
			case 4:
				System.out.println("Keluar dari program.");
				break;
			default:
				System.out.println("Pilihan tidak valid.");
			}
		} while (choice_1019 != 4);
		scannerInput_1019.close();
	}

}
