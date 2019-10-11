package com.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int r = sc.nextInt();
		System.out.print("Enter the column: ");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		int temp = 0;
		int tempArray[] = new int[r * c];
		int sortedArray[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("Enter value in arr[" + i + "][" + j + "] : ");
				tempArray[temp++] = arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		Arrays.sort(tempArray);
		temp = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sortedArray[i][j] = tempArray[temp++];
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sortedArray[i][j]);
			}
			System.out.println();
		}
	}

}
