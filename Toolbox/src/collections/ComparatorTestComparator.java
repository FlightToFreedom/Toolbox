package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTestComparator {

	/**
	 * Inner class to define a Person object 
	 * @author eiorio
	 */
	static class Person{

		private final String name;
		private final int age;

		/**
		 * Construct this
		 * @param name
		 * @param age
		 */
		public Person(String name, int age){
			this.name=name;
			this.age=age;
		}

		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}

	}//EOF class definition

	public static void main(String... args){
		List<Person> persons=new ArrayList<Person>(){{
			add(new ComparatorTestComparator.Person("james",2));
			add(new ComparatorTestComparator.Person("mike",15));
			add(new ComparatorTestComparator.Person("jamie",1));
			add(new ComparatorTestComparator.Person("troy",55));
		}};

		class Comp implements Comparator<Person>{
			@Override
			public int compare(Person first, Person second) {
				if(first.getAge()>second.getAge())
					return 1;
				if(first.getAge()<second.getAge())
					return -1;
				return 0;
			}	
		}

		Collections.sort(persons, new Comp());
		for (Person person : persons)
		{
			System.out.println("Name " + person.getName() + " and Age: " + person.getAge());
		}
	}

}
