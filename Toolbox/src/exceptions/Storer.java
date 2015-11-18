package exceptions;

public class Storer {

	static class StorageException extends Exception{
		public StorageException(){
			super("You cant store this!!!!");
		}
	}

	/**
	 * Test
	 * @param o
	 */
	public static void store(Object o)throws StorageException{
		if(o instanceof java.lang.String){
			throw new StorageException();
		}else{
			System.out.println("Stored :)");
		}
	}

	public static void main(String... args)throws StorageException{
		Double obj=2.0;
		store(obj);
	}
}
