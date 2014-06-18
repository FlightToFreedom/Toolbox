package strings;

public class Split {

	public static void main(String[] args) {
		String user = "Guiot_Reuliaux_avocats|1310400";
		String[] parts = user.split("\\|");
		System.out.println(parts[0] + " / " + parts[1]);
	}
}
