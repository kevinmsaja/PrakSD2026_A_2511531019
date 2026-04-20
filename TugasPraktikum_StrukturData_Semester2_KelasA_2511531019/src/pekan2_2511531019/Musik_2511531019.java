package pekan2_2511531019;

public class Musik_2511531019 {
	String judul_1019;
	String penyanyi_1019;
	int durasiDetik_1019;
	Musik_2511531019(String judul_1019, String penyanyi_1019, int durasiDetik_1019) {
		this.judul_1019 = judul_1019;
		this.penyanyi_1019 = penyanyi_1019;
		this.durasiDetik_1019 = durasiDetik_1019;
	}
	@Override
	public String toString() {
		return "Nama lagu: " + judul_1019 + ". Artis/Band: " + penyanyi_1019 + ". Durasi (detik): " + durasiDetik_1019;
	}
}
