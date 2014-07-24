package com.bupt.dataStructor.binarySearch;
/*
 * ʱ�临�Ӷȣ�O(logn)
 */
public class BinarySearch {
	//���ֲ��ҵݹ�ʽ�����˺ö������һ���ǰѵ��������ӽ�ȥ�ˣ��ڶ����Ƿ���ֵ+// add return ��
		public static int binarySearch(int[] A, int target, int start, int end) {
		//	while (start != end) { //����˵���
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
		//���ֲ��ҵ���ʽ,�򵥲��׳���
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
