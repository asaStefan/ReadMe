package com.bupt.link.array;

public class RemoveDuplicatesfromSortedArray2 {
	public static void main(String[] args) {
		int[] a = {};//{ 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 6, 7, 8, 8, 9 };
		System.out.println(removeDuplicates(a));
	}

	// method1
	public static int removeDuplicates(int[] A) {
		if(A.length==0){
			return 0;
		}
		int size = 0;
		int count = 0;
		for (int i = 1; i < A.length; i++) {

			if (A[size] != A[i]) {
				size++;
				A[size] = A[i];
				count = 0;
			} else if (count == 0) {
				size++;
				A[size] = A[i];
				count++;
			}
		}
		/*
		 for(int t : A){ 
			 System.out.print(t+" ");
			 }
		 System.out.println(A.length);
		 */
		return size + 1;
	}

	// method 2(思路不对)
	public static int removeDuplicates2(int[] A) {
		int size = 0;
		int count = 0;
		for (int i = 2; i < A.length; i = i + 2) {
			if (A[size] == A[i] && count == 0) {
				size++;
				A[size] = A[i];
				count++;
			} else if (A[size] != A[i]) {
				size++;
				A[size] = A[i];
				count = 0;
			}
		}
		/*
		 * for(int t : A){ System.out.print(t+" "); }
		 * System.out.println(A.length);
		 */
		return size + 1;
	}
}
