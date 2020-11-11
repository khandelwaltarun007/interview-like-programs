package com.programs;

public class MinimumParkingSpaceProblem {
	public static void main(String[] args) {
		int[][] parkingStartEndTimes = new int[][] { { 5, 10 }, { 0, 20 }, { 25, 40 }, { 35, 45 }, { 15, 30 },
				{ 20, 60 }, { 10, 15 } };

		System.out.println(minParkingSpaces(parkingStartEndTimes));

	}

	static int minParkingSpaces(int[][] parkingStartEndTimes) {
		int count = 0, i = 0, j = parkingStartEndTimes.length - 1;
		while (i < j) {
			System.out.println("i : " + i + "\t j : " + j);
			System.out.println("parkingStartEndTimes[" + i + "][0] : " + parkingStartEndTimes[i][0]);
			System.out.println("parkingStartEndTimes[" + j + "][0] : " + parkingStartEndTimes[j][0]);
			System.out.println("parkingStartEndTimes[" + i + "][1] : " + parkingStartEndTimes[i][1]);
			System.out.println("parkingStartEndTimes[" + j + "][1] : " + parkingStartEndTimes[j][1]);
			if ((parkingStartEndTimes[i][0] < parkingStartEndTimes[j][0])
					&& (parkingStartEndTimes[i][1] < parkingStartEndTimes[j][1])) {
				count++;
				System.out.println("count : " + count);
				i++;
				j--;
			} else {
				i++;
			}
		}
		return count;
	}
}
