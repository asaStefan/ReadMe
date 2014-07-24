

public class SearchinRotatedSortedArray {
	public static void main(String[] args) {
		int[] a = { 1 ,2,3};
		int[] b = { 4, 5, 6, 7, 8, 10, 12 };
		System.out.println(findPivot(a));
		//System.out.println(binarySearch2(b, 12));
		//System.out.println(binarySearch(b, 10,0,b.length-1));
		System.out.println(search2(a, 1));
		
	}

	// 普通查询，题意不明确
	public static int search(int[] A, int target) {
		if(A.length == 0){
			return -1;
		}
		for (int i = 0; i < A.length; i++) {
			if (target == A[i]) {
				return i;
			}
		}
		return -1;
	}

	// method1 ，采用二分法，提高查询效率
	// 难点：边界的确定
	public static int search2(int[] A, int target) {
		if(A.length==0){
			return -1;
		}
		int pivot = findPivot(A);
		if(pivot == 0)
			return binarySearch(A, target, 0, A.length-1);
		System.out.println("pivot:"+pivot);
		pivot--;
		if (target > A[pivot] || target < A[pivot + 1]) {
			return -1;
		} else if (target < A[0]) {
			return binarySearch(A, target, pivot + 1, A.length - 1);
		} else {
			return binarySearch(A, target, 0, pivot);
		}
	}

	// 确定边界（即事先未知的枢轴）
	public static int findPivot(int[] A) {
		int j = 0;
		for (int i = 0; i < A.length-1; i++) {// java.lang.ArrayIndexOutOfBoundsException:
			if (A[i] > A[i + 1]) {
				j = i;
				
				break;
			}
		}
		return j+1;
	}
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
		int end = A.length;
		int mid;
		while(start!=end){
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
