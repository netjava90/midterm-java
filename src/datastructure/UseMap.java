package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<Integer, String> PCN = new HashMap<>();
		PCN.put(487,"Bank" );
		PCN.put(1061,"Reserve");
		PCN.put(12,"Benefits");
		PCN.put(101, "Capital");
		PCN.put(206, "taxes");

		//print the whole list
		System.out.println(PCN);

		//retrieve one element from the list using its key
		//PCN.get(12);
		System.out.println(PCN.get(12));

		//add element using the method put.
		PCN.put(15,"Provisions");
		System.out.println(PCN); //after adding Provisions

		//Remove element using its key.
		PCN.remove(206);
		System.out.println(PCN);

		//print all elements before sorting
		for (Map.Entry<Integer, String> mp : PCN.entrySet()) {
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}

		// Sort using Tree Map in descending order
		TreeMap<Integer, String> sorted = new TreeMap<>();
		sorted.putAll(PCN);

		for (Map.Entry<Integer, String> mp : PCN.entrySet()) {
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}

		System.out.println(" List/HashMap ");
		List<String> Hospital = new LinkedList<>();
		Hospital.add("front desk");
		Hospital.add("waiting area");
		Hospital.add("emergency");
		Hospital.add("block operation");


		List<String> House  = new LinkedList<>();
		House.add("living room");
		House.add("kitchen");
		House.add("room");
		House.add("shower");
		House.add("garden");


		HashMap<String, List<String>> map = new HashMap<>();
		map.put("departments", Hospital);
		map.put("pieces", House);
		// Print all values
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
