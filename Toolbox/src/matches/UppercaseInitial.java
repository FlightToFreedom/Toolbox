package matches;

public class UppercaseInitial {

	public static void main(String[] args) {

		String channel = "Channel";
		String initial = channel.substring(0, 1);
		channel = channel.replace(initial, initial.toUpperCase());
		System.out.println(channel);
	}

}
