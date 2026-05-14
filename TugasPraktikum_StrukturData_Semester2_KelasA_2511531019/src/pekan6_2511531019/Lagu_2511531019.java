package pekan6_2511531019;

public class Lagu_2511531019 {
	private String judul_1019;
    private String penyanyi_1019;
    Lagu_2511531019 next_1019;
    Lagu_2511531019 prev_1019;

    // Constructor
    public Lagu_2511531019(String judul_1019, String penyanyi_1019) {
        this.judul_1019 = judul_1019;
        this.penyanyi_1019 = penyanyi_1019;
        this.next_1019 = null;
        this.prev_1019 = null;
    }

    public String getJudul_1019() {
        return judul_1019;
    }

    public void setJudul_1019(String judul_1019) {
        this.judul_1019 = judul_1019;
    }

    public String getPenyanyi_1019() {
        return penyanyi_1019;
    }

    public void setPenyanyi_1019(String penyanyi_1019) {
        this.penyanyi_1019 = penyanyi_1019;
    }
    
    private Lagu_2511531019 head_1019;
    private Lagu_2511531019 tail_1019;

    public void tambahLagu_1019(String judul_1019, String penyanyi_1019) {
        Lagu_2511531019 baru_1019 = new Lagu_2511531019(judul_1019, penyanyi_1019);
        if (head_1019 == null) {
            head_1019 = tail_1019 = baru_1019;
        } else {
            tail_1019.next_1019 = baru_1019;
            baru_1019.prev_1019 = tail_1019;
            tail_1019 = baru_1019;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    public void hapusLaguAwal_1019() {
        if (head_1019 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Menghapus lagu: " + head_1019.getJudul_1019() + " - " + head_1019.getPenyanyi_1019());
        head_1019 = head_1019.next_1019;
        if (head_1019 != null) {
            head_1019.prev_1019 = null;
        } else {
            tail_1019 = null;
        }
    }

    public void tampilMaju_1019() {
        if (head_1019 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Playlist (maju):");
        Lagu_2511531019 temp_1019 = head_1019;
        while (temp_1019 != null) {
            System.out.println(temp_1019.getJudul_1019() + " - " + temp_1019.getPenyanyi_1019());
            temp_1019 = temp_1019.next_1019;
        }
    }

    public void tampilMundur_1019() {
        if (tail_1019 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Playlist (mundur):");
        Lagu_2511531019 temp_1019 = tail_1019;
        while (temp_1019 != null) {
            System.out.println(temp_1019.getJudul_1019() + " - " + temp_1019.getPenyanyi_1019());
            temp_1019 = temp_1019.prev_1019;
        }
    }

    public void cariLagu_1019(String judul_1019) {
        Lagu_2511531019 temp_1019 = head_1019;
        while (temp_1019 != null) {
            if (temp_1019.getJudul_1019().equalsIgnoreCase(judul_1019)) {
                System.out.println("Lagu ditemukan: " + temp_1019.getJudul_1019() + " - " + temp_1019.getPenyanyi_1019());
                return;
            }
            temp_1019= temp_1019.next_1019;
        }
        System.out.println("Lagu tidak ditemukan!");
    }
}
