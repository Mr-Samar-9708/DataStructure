package com.sps.logical;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static int checkSum(int n) {
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;

			n = n / 10;
		}

		return sum;
	}

	public static boolean isHappy(int n) {
		Set<Integer> seen = new HashSet<>();

		while (n != 1 && !seen.contains(n)) {
			seen.add(n);
			n = checkSum(n);
		}

		return n == 1;
	}

	public static void main(String[] args) {
		int n = 19;

		if (isHappy(n)) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not Happy Numbers");
		}
	}
}
