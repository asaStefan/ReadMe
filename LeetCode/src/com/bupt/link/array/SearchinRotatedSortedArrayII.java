package com.bupt.link.array;

public class SearchinRotatedSortedArrayII {
	public static void main(String[] args) {
		int a[] = { 5, 5, 6, 7, 7, 7, 8, 1, 2, 3, 3, 3, 4, 4};
		int b[] = {1};
		int c[] = {1,2,3,4,5,6};
		int d[] = {4,1,2,3};
		
		System.out.println(new SearchinRotatedSortedArrayII().search(d,1));
   //   System.out.println(new SearchinRotatedSortedArrayII().findPivot(b));
   //   System.out.println(new SearchinRotatedSortedArrayII().binarySearch(c,1,0,5));
	    
	    
	}

	public boolean search(int[] A, int target) {
		if(A==null || A.length==0){
			return false;
		}
		if(A.length==1){
			if(A[0]==target){
				return true;
			}else{
				return false;
			}
		}
        int pivot = findPivot(A);
       // System.out.println(pivot);
        if(pivot==-1){
        	//System.out.println("dd");
        		return binarySearch(A,target,0,A.length-1)==-1?false:true;
        }
        if(target>A[pivot] || target <A[pivot + 1]){
        	return false;
        }else if(target >= A[0]){
        	return  binarySearch(A,target,0,pivot)==-1?false:true;
        }else
        	return  binarySearch(A,target,pivot+1,A.length-1)==-1?false:true;
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
