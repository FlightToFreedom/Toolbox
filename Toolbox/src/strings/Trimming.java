package strings;

public class Trimming {

	public static void main(String[] args) {

		String name = ".blabla.blabla.";
		System.out.println(cleanCounter(name));
	}

	private static String cleanCounter(String name) {
		if (name.startsWith(".")) {
			name = name.replaceFirst(".", "");
		}
		if (name.endsWith(".")) {
			name = name.substring(0, name.length() - 1);
		}
		return name;
	}
}
