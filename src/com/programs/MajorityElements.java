package com.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * If the array element is greater than n/2 of the array. Then, element will
 * consider as majority element.
 */
public class MajorityElements {
	public static void main(String[] args) {
		majorityElement(new int[] { 3, 2, 3 });

	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Long> map = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(key -> key, Collectors.counting()));
		Map<Integer, Long> map1 = map.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		int key = map1.entrySet().iterator().next().getKey();
		long value = map1.entrySet().iterator().next().getValue();
		System.out.println(map1);
		if (value > nums.length / 2) {
			return key;
		}
		return 0;
	}
}
