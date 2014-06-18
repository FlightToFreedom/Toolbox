package hashing;

public class Vehicle {

	private final int		doors;
	private final String	model;

	public Vehicle(int doors, String model) {
		this.doors = doors;
		this.model = model;
	}

	@Override
	public String toString() {
		return "[" + model + "]" + "[" + doors + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}
}
