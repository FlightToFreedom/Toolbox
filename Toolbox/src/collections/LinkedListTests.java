package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class LinkedListTests {

	public static void main(String[] args){
		List<String> list=new LinkedList<String>();
		ListIterator listIterator=list.listIterator();
		Iterator iterator=list.iterator();

		Set<String> set=new HashSet<String>();
		Iterator setIterator=set.iterator();
	}
}
