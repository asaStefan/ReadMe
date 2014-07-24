package com.bupt.link.array;

public class SearchinRotatedSortedArray_back {
	public static void main(String[] args) {
		int a[] = {5,6,7,8,1,2,3};
		int b[] = {1};
		int c[] = {1,2,3,4,5,6};
		int d[] = {4,1,2,3};
		
		System.out.println(new SearchinRotatedSortedArray_back().search(a,6));   
	}

	public int search(int[] A, int target) {
		if(A==null || A.length==0){
			return -1;
		}
		if(A.length==1){
			if(A[0]==target){
				return 0;
			}else{
				return -1;
			}
		}
        int pivot = findPivot(A);
       // System.out.println(pivot);
        if(pivot==-1){
        	//System.out.println("dd");
        		return binarySearch(A,target,0,A.length-1);
        }
        if(target>A[pivot] || target <A[pivot + 1]){
        	return -1;
        }else if(target >= A[0]){
        	return  binarySearch(A,target,0,pivot);
        }else
        	return  binarySearch(A,target,pivot+1,A.length-1);
	}

	public int findPivot(int[] A) {
		int pivot = 0;
		for (int i = 0; i < A.length-1; i++) {
			//System.out.println(i+"ddds");
			if (A[i] > A[i + 1]) {
				pivot = i;
				//System.out.println(A[i]);
				break;
			}else if(i==A.length-2){
				pivot = -1;
				//System.out.println("d");
			}
		}
		return pivot;
	}
	public int binarySearch(int[] A, int target,int start,int end) {
		/*int start = 0;
		int end = A.length-1;
		*/
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
