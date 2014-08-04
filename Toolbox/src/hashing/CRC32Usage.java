package hashing;

import java.util.zip.CRC32;

public class CRC32Usage {

	public static void main(String[] args) {
		String vid = "5358D0C10B2A00E7";
		CRC32 c = new CRC32();
		c.update(vid.getBytes());
		System.out
				.println(c.getValue() & 0xFFFFFFFFl);
	}
}
