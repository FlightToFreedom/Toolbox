package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		Map<Maps.Example, String> map = new HashMap<Maps.Example, String>();
		map.put(new Example(), "b");
		map.put(new Example(), "c");
		System.out.println(map.toString());
	}

	public static class Example {
		@Override
		public int hashCode() {
			return 1000;
		}
	}
}
