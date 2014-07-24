package com.bupt.link.array;

public class MedianofTwoSortedArrays {
	public static void main(String[] args) {
		int[] a = {2,3,4,5,7,8,9,10,11};
		int[] b= {1,6};
		System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(a, b));
	}
	public double findMedianSortedArrays(int A[], int B[]) {
		int len = A.length + B.length;
		if (len % 2 == 0) {
			return (findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0,
					len / 2 + 1)) / 2.0;
		} else {
			return findKth(A, 0, B, 0, len / 2 + 1);
		}
	}

	// find kth number of two sorted array
	//¹Ø¼ü
	public static int findKth(int[] A, int A_start, int[] B, int B_start, int k) {
		if (A_start >= A.length)
			return B[B_start + k - 1];
		if (B_start >= B.length)
			return A[A_start + k - 1];

		if (k == 1)
			return Math.min(A[A_start], B[B_start]);

		int A_key = A_start + k / 2 - 1 < A.length ? A[A_start + k / 2 - 1]//?A.length-1
				: Integer.MAX_VALUE;
		int B_key = B_start + k / 2 - 1 < B.length ? B[B_start + k / 2 - 1]
				: Integer.MAX_VALUE;

		if (A_key < B_key) {
			return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
		} else {
			return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
		}
	}
	public double findMedianSortedArrays2(int A[], int B[]) {
		int len = A.length + B.length;
		if(len % 2 ==0){
			return (findKth2(A,0,B,0,len/2)+findKth2(A,0,B,0,len/2 + 1))/2.0;
		}
		else{
			return findKth2(A,0,B,0,len/2);
		}
	}
	public static int findKth2(int[] A, int A_start, int[] B, int B_start, int k) {
		int A_key = A_start + k/2 - 1 < A.length?A[A_start + k/2 - 1]:Integer.MAX_VALUE;
		int B_key = B_start + k/2 - 1 < B.length?B[B_start + k/2 - 1]:Integer.MAX_VALUE;
	    return findKth2(A,A_start,B,B_start,k-k/2);
	}
}
