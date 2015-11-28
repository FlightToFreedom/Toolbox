package inheritance.tests;

import inheritance.animals.Animal;

public class Cat extends Animal{

	public static void testClassMethod() {
		System.out.println("The class method" + " in Cat.");
	}
	@Override
	public void testInstanceMethod() {
		System.out.println("The instance method" + " in Cat.");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		((Cat)myAnimal).testClassMethod();
		//XXX this here below wont compile, you are referencing a Cat instance from a declared 'Animal' type, the compiler will look for the animal.instanceMethod() method which is not visible as its protected  
		//myAnimal.testInstanceMethod();
	}
}