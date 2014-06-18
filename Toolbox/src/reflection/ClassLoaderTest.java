package reflection;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		Class<?> clazz = loader.loadClass("java.lang.Integer");
		System.out.println(clazz.getSuperclass());
		// System.out.println(clazz.isInstance(new Number(1)));

		Number number = new Integer(1);
		System.out.println(java.lang.Integer.class
				.isInstance(java.lang.Number.class));
	}
}
