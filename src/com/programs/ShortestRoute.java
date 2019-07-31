package com.programs;

import java.util.ArrayList;
import java.util.List;

public class ShortestRoute {

	/**
	 * 
	 * Function should return combination of unique path number of summation of
	 * forward and return path It should calculate optimal distance based on max
	 * distance of an aircraft If optimal solution has not found return null
	 * maxDistance = 10000 forwardMaxDistance = [[1,1200],[2,4000],[3,5000]]
	 * returnMaxDistance = [[1,1200],[2,5000],[3,4000]] return = [[2,2],[3,3]]
	 * 
	 * @param maxDistance
	 * @param forwardMaxDistance
	 * @param returnMaxDistance
	 * @return
	 */
	public static List<List<Integer>> shortestDistance(int maxDistance, List<List<Integer>> forwardMaxDistance,
			List<List<Integer>> returnMaxDistance) {
		List<Integer> finalList;
		List<List<Integer>> outcome = new ArrayList<>();

		for (List<Integer> list1 : forwardMaxDistance) {
			for (List<Integer> list2 : returnMaxDistance) {
				finalList = new ArrayList<>();
				if (maxDistance - (list1.get(1) + list2.get(1)) <= (maxDistance / 10)
						&& maxDistance - (list1.get(1) + list2.get(1)) >= 0) {
					finalList.add(list1.get(0));
					finalList.add(list2.get(0));
					outcome.add(finalList);
				}
			}
		}
		return outcome;
	}

	public static List<List<Integer>> shortestDistanceUsingStream(int maxDistance,
			List<List<Integer>> forwardMaxDistance, List<List<Integer>> returnMaxDistance) {
		List<List<Integer>> outcome = new ArrayList<>();
		forwardMaxDistance.stream().forEach(list1 -> {
			returnMaxDistance.stream().forEach(list2 -> {
				List<Integer> finalList = new ArrayList<>();
				if (maxDistance - (list1.get(1) + list2.get(1)) <= (maxDistance / 10)
						&& maxDistance - (list1.get(1) + list2.get(1)) >= 0) {
					finalList.add(list1.get(0));
					finalList.add(list2.get(0));
					outcome.add(finalList);
				}
			});
		});
		return outcome;
	}

	public static void main(String[] args) {
		List<Integer> forwardDis1 = new ArrayList<>();
		forwardDis1.add(1);
		forwardDis1.add(1200);

		List<Integer> forwardDis2 = new ArrayList<>();
		forwardDis2.add(2);
		forwardDis2.add(3000);

		List<Integer> forwardDis3 = new ArrayList<>();
		forwardDis3.add(3);
		forwardDis3.add(5000);

		List<List<Integer>> forwardMaxDistance = new ArrayList<>();
		forwardMaxDistance.add(forwardDis1);
		forwardMaxDistance.add(forwardDis2);
		forwardMaxDistance.add(forwardDis3);

		List<Integer> returnDis1 = new ArrayList<>();
		returnDis1.add(1);
		returnDis1.add(1200);

		List<Integer> returnDis2 = new ArrayList<>();
		returnDis2.add(2);
		returnDis2.add(6000);

		List<Integer> returnDis3 = new ArrayList<>();
		returnDis3.add(3);
		returnDis3.add(5000);

		List<List<Integer>> returnMaxDistance = new ArrayList<>();
		returnMaxDistance.add(returnDis1);
		returnMaxDistance.add(returnDis2);
		returnMaxDistance.add(returnDis3);

		System.out.println(forwardMaxDistance);
		System.out.println();
		System.out.println(returnMaxDistance);

		// System.out.println(ShortestRoute.shortestDistance(10000, forwardMaxDistance,
		// returnMaxDistance));
		System.out.println(ShortestRoute.shortestDistanceUsingStream(10000, forwardMaxDistance, returnMaxDistance));
	}
}
