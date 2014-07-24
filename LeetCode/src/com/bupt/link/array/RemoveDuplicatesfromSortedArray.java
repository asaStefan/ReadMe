package com.bupt.link.array;
/**
 * 在一个数组中剔除重复值，返回新长度m，并且要求前m个数值唯一。
 * 要求：不能建立新数组
 * @author root
 *
 */
public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		int[] a = {-1,1,1,1,2,3,4,5,6,6,7,7,7,7,7,8};
		System.out.println(removeDuplicates(a));
	}
//不正确
	public static int removeDuplicates0(int[] A) {
		if(A.length==0){
			return 0;
		}
		int temp = A[0];
		int k =0;
		int length = A.length;
		for(int i=0;i<A.length;i++){
			if(temp == A[i]){
				length --;
				for(int j = i;j<A.length-1;j++){
					k = j+1;
					A[j] = A[k];
				}
			}
			temp = A[i];
		}
		for(int t : A){
			System.out.print(t+" ");
		}
		System.out.println();
		return length+1;
	}
	/**
	 * 思路：把一个数组当成两个数组（一个数组的不同部分）
	 *     起始：新数组大小为1，然后遍历原数组，若当前值等于新数组最后的值，
	 *     则继续（即不加入新数组），否则，将当前值加入新数组（同时扩展新数组长度）
	 *Description: 
	 *Date: 下午3:15:24
	 *@param A
	 *@return
	 *int
	 */
	public static int removeDuplicates(int[] A) {
		if(A.length==0){
			return 0;
		}
		int size =0;
		for(int i = 0;i<A.length;i++){
			if(A[size]!=A[i]){
				size++;
				A[size] = A[i];
			}
		}
		for(int t : A){
			System.out.print(t+" ");
		}
		System.out.println();
		return size+1;
	}
	//标准答案
	/**
	 * Copyright: NineChapter
	 * - Algorithm Course, Mock Interview, Interview Questions
	 * - More details on: http://www.ninechapter.com/
	 */

	
	   /* public static int removeDuplicates2(int[] A) {
	        if (A == null || A.length == 0) {
	            return 0;
	        }
	        
	        int size = 0;
	        for (int i = 0; i < A.length; i++) {
	            if (A[i] != A[size]) {
	                A[++size] = A[i];
	            }
	        }
	        return size + 1;
	    }
*/
}
