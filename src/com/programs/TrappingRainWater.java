package com.programs;

public class TrappingRainWater {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 2, 5, 0, 8, 2, 10 };
		int sum = trapRainWater(arr);
		System.out.println("Total : " + sum);
	}

	private static int trapRainWater(Integer[] arr) {
		int selected = 0;
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				selected = (arr[i]);
				sum = sum + (arr[i] - arr[i + 1]);
			} else if (arr[i] == arr[i + 1]) {
				sum = sum + (selected - arr[i]);
			} else if (arr[i] < arr[i + 1] && arr[i + 1] > selected) {
				selected = arr[i + 1];

			}
			System.out.println("arr[" + i + "] : " + arr[i] + "\tSelected : " + selected + "\t Sum : " + sum);
		}
		return sum;
	}
}
