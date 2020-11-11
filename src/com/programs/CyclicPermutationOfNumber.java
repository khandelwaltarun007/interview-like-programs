package com.programs;

/**
 * Generate all cyclic permutations of a number
 */
public class CyclicPermutationOfNumber {
	public static void main(String[] args) {
		int N = 123;
		cyclic(N);
	}

	private static void cyclic(int N) {
		int num = N;
		int lengthOfNumber = count(N);
		while (true) {
			System.out.println(N);
			int rem = N % 10;
			int dev = N / 10;
			N = (int) Math.pow(10, lengthOfNumber - 1) * rem + dev;
			if (num == N) {
				break;
			}
		}
	}

	private static int count(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}
