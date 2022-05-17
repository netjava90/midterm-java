package datastructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> car = new LinkedList<>();

		//add element to the Queue
		car.add("BMW");
		car.add("mercedes");
		car.add("volkswagen");
		car.add("audi");
		car.add("porch");
		car.add("volvo");

		//print all the elements
		System.out.println(car);

		//add one element
		car.add("peugeot");
		System.out.println(car);

		//Remove specific element
		car.remove("audi");
		System.out.println(car);

		//peek first element
		System.out.println(car.peek());

		//print first element
		System.out.println(car.element());

		//Remove (poll) the element from the list (fifo)
		//bmw fifo
		System.out.println(car.poll());

        // Check if it contains porch
		System.out.println(car.contains("porch"));

		//Print elements using iterator after the second poll
		Iterator<String> it = car.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
