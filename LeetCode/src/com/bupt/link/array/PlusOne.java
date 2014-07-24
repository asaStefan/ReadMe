package com.bupt.link.array;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits = { 9, 0, 3 };
		int[] result = plusOne(digits);
		for (int temp : result) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}

	public static int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		while (i >= 0) {
			if (digits[i] >= 9) {
				digits[i] = 0;
				i--;
			} else {
				digits[i] = digits[i] + 1;
				return digits;
			}
		}
		// สืฮป
		int[] newDigits = new int[digits.length + 1];
		newDigits[0] = 1;
		for (int j = 1; j < newDigits.length; j++) {
			newDigits[j] = 0;
		}
		return newDigits;
	}
}
