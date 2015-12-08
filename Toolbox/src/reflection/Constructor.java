package reflection;




public class Constructor {

	private String loadClass(String fullClassName) {
		final ClassLoader			urlLoader	= this.getClass().getClassLoader();

		String clazz = null;
		try {
			Class<?> bqerClass = urlLoader.loadClass(fullClassName);
			java.lang.reflect.Constructor<?> constructor = bqerClass.getConstructor();
			clazz = (String) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clazz;
	}

}
