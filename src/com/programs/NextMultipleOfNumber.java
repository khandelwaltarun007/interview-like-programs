package com.programs;

import java.util.Scanner;

public class NextMultipleOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int nextMultipleOf = sc.nextInt();
		sc.close();
		int nextMultiple = number + (nextMultipleOf - (number % nextMultipleOf));
		System.out.println(nextMultiple);
	}
}
