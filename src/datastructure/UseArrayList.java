package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<Integer> list = new ArrayList<Integer>();
		//add elements
		list.add(234);
		list.add(87);
		list.add(23);
		list.add(99);
		list.add(2);
		list.add(127);

		//print the whole list
		//System.out.println(list);

		//retrieve a specific element of the list
		//System.out.println(list.get(3));

		//add one element to the list
		list.add(55);
		//System.out.println(list);

		//remove element from the list
		list.remove(6);
		//System.out.println(list);

		//override an existing value
		list.set(0, 5);
		System.out.println(list);

		// Print all elements using iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		// Sort elements using Collections
		Collections.sort(list);
		Iterator<Integer> it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}


	}
}

