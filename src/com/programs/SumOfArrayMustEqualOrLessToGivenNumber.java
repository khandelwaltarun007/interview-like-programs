package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfArrayMustEqualOrLessToGivenNumber {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {4,8,5,9};
		int limit = 20;
		//List<Integer> list = Arrays.asList(array).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		Arrays.sort(array, Comparator.reverseOrder());
		System.out.println(Arrays.toString(array));
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				
			}
		}
	}

}
