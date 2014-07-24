package com.bupt.link.array;
/**
 * ��һ���������޳��ظ�ֵ�������³���m������Ҫ��ǰm����ֵΨһ��
 * Ҫ�󣺲��ܽ���������
 * @author root
 *
 */
public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		int[] a = {-1,1,1,1,2,3,4,5,6,6,7,7,7,7,7,8};
		System.out.println(removeDuplicates(a));
	}
//����ȷ
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
	 * ˼·����һ�����鵱���������飨һ������Ĳ�ͬ���֣�
	 *     ��ʼ���������СΪ1��Ȼ�����ԭ���飬����ǰֵ��������������ֵ��
	 *     ��������������������飩�����򣬽���ǰֵ���������飨ͬʱ��չ�����鳤�ȣ�
	 *Description: 
	 *Date: ����3:15:24
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
	//��׼��
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
