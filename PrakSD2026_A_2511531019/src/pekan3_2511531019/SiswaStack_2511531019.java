package pekan3_2511531019;
import java.util.ArrayList;
class Siswa_2511531019 {
	String nama_1019;
	int nim_1019;
	
	public Siswa_2511531019(String nama_1019, int nim_1019) {
		this.nama_1019 = nama_1019;
		this.nim_1019 = nim_1019;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_1019 + ", Nama: " + nama_1019;
	}
}
public class SiswaStack_2511531019 {
	private ArrayList<Siswa_2511531019> stack_1019;
	public SiswaStack_2511531019() {
		stack_1019 = new ArrayList<>();
	}
	public void push_1019(Siswa_2511531019 mhs) {
		stack_1019.add(mhs);
	}
	public Siswa_2511531019 pop_1019() {
		if (!isEmpty_1019()) {
			return stack_1019.remove(stack_1019.size() - 1);
		}
		return null;
	}
	public Siswa_2511531019 peek_1019() {
		if (!isEmpty_1019()) {
			return stack_1019.get(stack_1019.size() - 1);
		}
		return null;
	}
	public boolean isEmpty_1019() {
		return stack_1019.isEmpty();
	}
	public void tampilkanSiswa_1019() {
		for (int i = stack_1019.size() - 1; i >= 0; i--) {
			System.out.println(stack_1019.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511531019 studentStack_1019 = new SiswaStack_2511531019();
		Siswa_2511531019 mhs1_1019 = new Siswa_2511531019("Ali", 1);
		Siswa_2511531019 mhs2_1019 = new Siswa_2511531019("Boby", 2);
		Siswa_2511531019 mhs3_1019 = new Siswa_2511531019("Charles", 3);
		studentStack_1019.push_1019(mhs1_1019);
		studentStack_1019.push_1019(mhs2_1019);
		studentStack_1019.push_1019(mhs3_1019);
		System.out.println("Siswa di dalam stack:");
		studentStack_1019.tampilkanSiswa_1019();
		System.out.println("Siswa teratas " + studentStack_1019.peek_1019());
		System.out.println("Mengeluarkan siswa teratas dari stack: " + studentStack_1019.pop_1019());
		System.out.println("Daftar siswa setelah di pop:");
		studentStack_1019.tampilkanSiswa_1019();
	}
}