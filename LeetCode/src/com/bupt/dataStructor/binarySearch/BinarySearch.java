package com.bupt.dataStructor.binarySearch;
/*
 * 时间复杂度：O(logn)
 */
public class BinarySearch {
	//二分查找递归式（出了好多错，其中一个是把迭代条件加进去了；第二个是返回值+// add return ）
		public static int binarySearch(int[] A, int target, int start, int end) {
		//	while (start != end) { //混合了迭代
			if (start > end)
				return -1;
			int mid = (start + end) / 2;
			if (target == A[mid]){
				return mid;
			}else if (target > A[mid]) {
				return binarySearch(A, target, mid + 1, end);// add return 
			}else{
				return binarySearch(A, target, 0, mid - 1);// add return 
			}	
		}
		//二分查找迭代式,简单不易出错
		public static int binarySearch2(int[] A, int target) {
			int start = 0;
			int end = A.length-1;
			int mid;
			while(start<=end){
				mid = (start + end)/2;
				if(A[mid] == target){
					return mid;
				}else if(A[mid]>target){
					end = mid - 1;
				}else{
					start = mid +1;
				}
			}
			return -1;
		}
}
