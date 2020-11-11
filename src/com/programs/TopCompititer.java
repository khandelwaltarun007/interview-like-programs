package com.programs;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopCompititer {

	public static ArrayList<String> findTopCompititor(int topNCompetitors, List<String> compititors,
			List<String> reviews) {
		Map<String, Integer> map = new HashMap<>();
		Instant start = Instant.now();
		for (String review : reviews) {
			for (String compititor : compititors) {
				if (review.toLowerCase().contains(compititor.toLowerCase())) {
					if (map.containsKey(compititor)) {
						map.put(compititor, map.get(compititor) + 1);
					} else {
						map.put(compititor, 1);
					}
				}
			}
		}
		// for (String review : reviews) {
		// compititors.stream().filter(compititor->compititor.toLowerCase().contains(review.toLowerCase())).collect(Collectors.toMap());
		// }

		Instant end = Instant.now();
		System.out.println("Execution time : " + Duration.between(start, end).toMillis());
		return (ArrayList<String>) map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.map(k -> k.getKey()).limit(topNCompetitors).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> reviews = Arrays.asList("Flipkart is best company for elcronics item", " Flipkart is best!",
				" i bought an ipod from snapdeal", " snapdeal gave me good deal on washing machine",
				" best deal can be found on flipkart",
				" walmart is marginally give you more benifit interms of day to day items",
				" nobody can beat zomato for food delivery", " swigy is the best!",
				" i fojund very great deal on walmart online portal",
				" all electronics item is very cheap on flipkart compare to other rivals",
				"i love Zomato due to its fast delivery network", " more discounts are available in zomato");

		List<String> compititors = Arrays.asList("Flipkart", "snapdeal", "walmart", "swigy");
		System.out.println(findTopCompititor(2, compititors, reviews));
	}
}
