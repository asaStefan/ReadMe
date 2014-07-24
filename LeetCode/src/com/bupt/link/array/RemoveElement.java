package com.bupt.link.array;

public class RemoveElement {
	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 3, 2, 5 };
		System.out.println(removeElement(num, 2));
	}

	// 就地
	public static int removeElement(int[] A, int elem) {
		int index = 0;// 关键点
		for (int i = 0; i < A.length; i++) {
			if (A[i] != elem) {
				A[index] = A[i];
				index++;
			}
		}
		return index;
	}
}
