package com.programs;

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 12, 15, 26, 38 };
		int[] arr2 = { 2, 13, 17, 30, 45 };
		int totalLength = arr1.length + arr2.length;
		int[] finalArray = new int[totalLength];
		int median = 0;
		for (int i = 0; i < arr1.length; i++) {
			finalArray[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			finalArray[totalLength - arr1.length + i] = arr2[i];
		}

		for (int i = 0; i < totalLength - 2; i++) {
			for (int j = 0; j < totalLength - i - 1; j++) {
				if (finalArray[j] > finalArray[j + 1]) {
					int temp = finalArray[j];
					finalArray[j] = finalArray[j + 1];
					finalArray[j + 1] = temp;
				}
			}
		}
		if (totalLength % 2 == 0) {
			median = (finalArray[(totalLength / 2) - 1] + finalArray[(totalLength / 2)]) / 2;
		} else {
			median = finalArray[(totalLength / 2) - 1];
		}
		System.out.println("Median : " + median);
	}
}
