package hashing;

public class Garage {

	public static void main(String[] args) {

		Vehicle car = new Vehicle(2, "bmw");
		Vehicle truck = new Vehicle(2, "bmw");
		System.out.println(car.equals(truck));
		System.out.println(car.hashCode());
		System.out.println(truck.hashCode());
	}
}
