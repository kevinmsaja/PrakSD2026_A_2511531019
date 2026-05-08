package pekan5_2511531019;

public class Pasien_2511531019 {
	String nama_1019;
    String keluhan_1019;
    int nomorAntrian_1019;
    Pasien_2511531019 next_1019;

    Pasien_2511531019(String nama_1019, String keluhan_1019, int nomorAntrian_1019) {
        this.nama_1019 = nama_1019;
        this.keluhan_1019 = keluhan_1019;
        this.nomorAntrian_1019 = nomorAntrian_1019;
        this.next_1019 = null;
    }
    
    private Pasien_2511531019 head_1019, tail_1019;
    private int counter_1019 = 0;

    // Insert pasien ke antrian
    public void insertPasien_2511531019(String daftarNama_1019, String daftarKeluhan_1019) {
        counter_1019++;
        Pasien_2511531019 pasienbaru_1019 = new Pasien_2511531019(daftarNama_1019, daftarKeluhan_1019, counter_1019);
        if (head_1019 == null) {
            head_1019 = tail_1019 = pasienbaru_1019;
        } else {
            tail_1019.next_1019 = pasienbaru_1019;
            tail_1019 = pasienbaru_1019;
        }
        System.out.println("Pasien berhasil didaftarkan. Nomor Antrian: " + pasienbaru_1019.nomorAntrian_1019);
    }

    // Delete head (panggil pasien)
    public void panggilPasien_2511531019() {
        if (head_1019 == null) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            System.out.println("Memanggil Pasien: " + head_1019.nama_1019 + " | Keluhan: " + head_1019.keluhan_1019);
            head_1019 = head_1019.next_1019;
            if (head_1019 == null) tail_1019 = null;
        }
    }

    // Display semua pasien
    public void tampilkanPasien_2511531019() {
        if (head_1019 == null) {
            System.out.println("Tidak ada pasien dalam antrian.");
            return;
        }
        Pasien_2511531019 tempDisplay_1019 = head_1019;
        System.out.println("=== Daftar Pasien ===");
        while (tempDisplay_1019 != null) {
            System.out.println("No: " + tempDisplay_1019.nomorAntrian_1019 + " | Nama: " + tempDisplay_1019.nama_1019 + " | Keluhan: " + tempDisplay_1019.keluhan_1019);
            tempDisplay_1019 = tempDisplay_1019.next_1019;
        }
    }

    // Search pasien berdasarkan nama
    public void cariPasien_2511531019(String hasilPencarianNama_1019) {
        Pasien_2511531019 tempSearch_1019 = head_1019;
        boolean found_1019 = false;
        while (tempSearch_1019 != null) {
            if (tempSearch_1019.nama_1019.equalsIgnoreCase(hasilPencarianNama_1019)) {
                System.out.println("Pasien ditemukan! No: " + tempSearch_1019.nomorAntrian_1019 + " | Nama: " + tempSearch_1019.nama_1019 + " | Keluhan: " + tempSearch_1019.keluhan_1019);
                found_1019 = true;
                break;
            }
            tempSearch_1019 = tempSearch_1019.next_1019;
        }
        if (!found_1019) {
            System.out.println("Pasien dengan nama " + hasilPencarianNama_1019 + " tidak ditemukan.");
        }
    }

    // Cek status antrian
    public void cekStatus_2511531019() {
        if (head_1019 == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Jumlah pasien dalam antrian: " + hitungPasien_2511531019());
        }
    }

    private int hitungPasien_2511531019() {
        int jumlahPasien_1019 = 0;
        Pasien_2511531019 tempCount_1019 = head_1019;
        while (tempCount_1019 != null) {
            jumlahPasien_1019++;
            tempCount_1019 = tempCount_1019.next_1019;
        }
        return jumlahPasien_1019;
    }
}
