package pekan2_2511531019;

public class DaftarKataDriver_2511531019 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaftarKata_2511531019 al = new DaftarKata_2511531019();
		
		al.tambah("Kami");
		al.tambah("Informatika");
		
		al.tambahPada(1, "Mahasiswa");
		
		System.out.println("Awal            : " + al);
		
		al.ubahElemen(1, "Departemen");
		System.out.println("Setelah Ubah    : " + al);
		
		String terhapus = al.hapusElemen(0);
		System.out.println("Terhapus        : " + terhapus);
		System.out.println("Setelah Hapus   : " + al);
		
		System.out.print("Iterasi: ");
		al.iterasiCetak();
		System.out.println();
	}
}
