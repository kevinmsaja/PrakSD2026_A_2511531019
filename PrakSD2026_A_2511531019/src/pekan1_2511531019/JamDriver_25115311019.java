package pekan1_2511531019;

public class JamDriver_25115311019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jam_2511531019 a = new Jam_2511531019(23, 59, 50);
		Jam_2511531019 b = new Jam_2511531019(0, 0, 15);
		System.out.println("a              = " + a);
		System.out.println("b              = " + b);
		System.out.println("a + b          = " + a.plus(b));
		System.out.println("next 20s       = " + a.nextNSeconds(20));
		System.out.println("duration(a, b) = " + Jam_2511531019.durasiDetik(a, b));
		System.out.println("a.compareTo(b) = " + a.compareTo(b));
	}

}
