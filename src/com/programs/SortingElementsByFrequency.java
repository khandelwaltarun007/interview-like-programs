/**
 * 
 */
package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author tarkhand
 *
 */
public class SortingElementsByFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of arrays : ");
		int noOfArrays = sc.nextInt();
		for (int i = 0; i < noOfArrays; i++) {
			System.out.print("Enter length of Array : ");
			int arrLength = sc.nextInt();
			int arr[] = new int[arrLength];
			for (int j = 0; j < arrLength; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println("Sorted Array By Frequency : " + sortByFreq(arr));
		}
		sc.close();
	}

	/**
	 * arr[] = {5,3,3,8,9,2,2,4} output = {2,2,3,3,4,5,8,9}
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] sortByFreq(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer, Long> freq = new HashMap<>();
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		list.forEach(number -> freq.compute(number, (k, v) -> v != null ? v + 1 : 1));
		freq.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(freq);
		return null;
	}
}
