package com.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

	public static void main(String[] args) {
		List<String> carCompaniesList = new ArrayList<>();
		carCompaniesList.add("BMW");
		carCompaniesList.add("Audi");
		carCompaniesList.add("Honda");
		carCompaniesList.add("TATA");
		carCompaniesList.add("Mercedes");
		carCompaniesList.add("KIA");
		
		// Simple For Loop
		System.out.println("==============> 1. Simple For loop Example.");
		for (int i = 0; i < carCompaniesList.size(); i++) {
			System.out.println(carCompaniesList.get(i));
		}

		// while loop
		System.out.println("============> 5. While loop");
		int i = 0;
		while (i < carCompaniesList.size()) {
			System.out.println(carCompaniesList.get(i));
			i++;
		}

		// Enhanced for loop
		System.out.println("==============> 2. Enhanced For loop Example.");
		for (String carCompany : carCompaniesList) {
			System.out.println(carCompany);
		}

		// Iterator - Returns an iterator over the elements in this list in proper
		// sequence.
		System.out.println("=============> 3. Iterator Example.");
		Iterator<String> iterator = carCompaniesList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		/**
		 * ListIterator - traverse a list of elements in either forward or backward
		 * order An iterator for lists that allows the programmer to traverse the list
		 * in either direction, modify the list during iteration, and obtain the
		 * iterator's current position in the list.
		 * 
		 */
		System.out.println("=============> 4. ListIterator Example.");
		ListIterator<String> listIterator = carCompaniesList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Iterable.foreach() Example : Returns a sequential Stream with this collection
		// as its source
		System.out.println("============> 6. Iterable.foreach() Example.");
		carCompaniesList.forEach(System.out::println);

		// Stream.foreach() Example :Returns a sequential Stream with this collection as
		// its source
		System.out.println("============> 7. Stream.foreach() Example.");
		carCompaniesList.stream().forEach(System.out::println);

		// parallelStream.foreach()
		System.out.println("============> ParallelStream foreach()");
		carCompaniesList.parallelStream().forEach(System.out::println);
	}
}
