package collections;

import java.util.TreeSet;

public class UseSortedSet {

	public static void main(String[] args){
		TreeSet<Integer> intSet=new TreeSet<Integer>();
		intSet.add(5);
		intSet.add(1);
		intSet.add(7);
		intSet.add(90);
		intSet.add(180);
		intSet.add(0);
		System.out.println(intSet.last());
	}

}
