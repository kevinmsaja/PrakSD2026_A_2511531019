package pekan7_2511531019;

public class Mahasiswa_2511531019 {
	private String nama_1019;
    private String nim_1019;
    private String prodi_1019;

    // Constructor
    public Mahasiswa_2511531019(String nama_1019, String nim_1019, String prodi_1019) {
        this.nama_1019 = nama_1019;
        this.nim_1019 = nim_1019;
        this.prodi_1019 = prodi_1019;
    }

    // Setter
    public void setNama_2511531019(String nama_1019) {
        this.nama_1019 = nama_1019;
    }

    public void setNim_2511531019(String nim_1019) {
        this.nim_1019 = nim_1019;
    }
    
    public void setProdi_2511531019(String prodi_1019) {
        this.prodi_1019 = prodi_1019;
    }

    // Getter
    public String getNama_2511531019() {
        return nama_1019;
    }

    public String getNim_2511531019() {
        return nim_1019;
    }

    public String getProdi_2511531019() {
        return prodi_1019;
    }
    
    @Override
    public String toString() {
        return nama_1019 + " | " + nim_1019 + " | " + prodi_1019;
    }
}
