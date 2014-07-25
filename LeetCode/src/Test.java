public class Test {
	public static void main(String[] args) {
		System.out.println(new Test().test(0));
		int[] b = { 4, 5, 6, 7, 8, 10, 12 };
	//	System.out.println(findPivot(a));
		
		//
		//System.out.println(binarySearch2(b, 12));
		
		
		
		System.out.println(BSearch(b, 10,0,b.length-1));
	}

	public int test(int a) {
		if (a == 1) {
			return 1;
		} else {
			return -1;
		}
	}

	static int BSearch(int a[], int x, int low, int high)

	/* 在下届为low，上界为high的数组a中折半查找数据元素x */

	{

		int mid;

		if (low > high)
			return -1;

		mid = (low + high) / 2;

		if (x == a[mid])
			return mid;

		if (x < a[mid])
			return (BSearch(a, x, low, mid - 1));

		else
			return (BSearch(a, x, mid + 1, high));

	}
}