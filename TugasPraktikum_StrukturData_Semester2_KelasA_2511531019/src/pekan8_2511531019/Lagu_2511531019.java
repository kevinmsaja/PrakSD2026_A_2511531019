package pekan8_2511531019;
public class Lagu_2511531019 {
	String judul_1019;
    String penyanyi_1019;
    int durasi_1019;

    public Lagu_2511531019(String judul_1019, String penyanyi_1019, int durasi_1019) {
        this.judul_1019 = judul_1019;
        this.penyanyi_1019 = penyanyi_1019;
        this.durasi_1019 = durasi_1019;
    }

    @Override
    public String toString() {
        return judul_1019 + " - " + penyanyi_1019 + " - " + durasi_1019 + " detik";
    }
}