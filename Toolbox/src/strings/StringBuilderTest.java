package strings;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("message: ");
		builder.append("\n");
		builder.append("message: ");
		System.out.println(builder.toString());
	}
}
