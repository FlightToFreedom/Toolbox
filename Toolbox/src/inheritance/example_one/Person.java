package inheritance.example_one;

public class Person extends Human {

	public Person() {
	}

	@Override
	public void speak() {
		System.out.println("From person");
	}

}
