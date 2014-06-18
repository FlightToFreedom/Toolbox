package reflection;

import java.lang.reflect.Method;

public class DotClassTest {

	public static void main(String[] args) {
		String test = "hello";
		System.out.println(test.getClass());

		for (Method method : test.getClass().getMethods()) {
			System.out.println(method.getName());
		}
	}
}
