package inheritance.example_one;

public class RandomGuy extends Person {

	public RandomGuy() {
		super();
	}

	@Override
	public void speak() {
		System.out.println("From Random Guy");
	}
}
