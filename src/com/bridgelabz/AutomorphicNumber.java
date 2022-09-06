package com.bridgelabz;

public class AutomorphicNumber {
	static boolean isAutomorphic(int num) {

		int square = num * num;

		while (num > 0) {

			if (num % 10 != square % 10)

				return false;

			num = num / 10;
			square = square / 10;
		}
		return true;
	}

	public static void main(String args[]) {

		System.out.println(isAutomorphic(5) ? "Automorphic" : "Not Automorphic");
		System.out.println(isAutomorphic(6) ? "Automorphic" : "Not Automorphic");
	}
}
