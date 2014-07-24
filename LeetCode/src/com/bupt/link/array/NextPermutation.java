package com.bupt.link.array;

public class NextPermutation {
	public static void main(String[] args) {
       int num[] ={3,2,1};//{1,2,3,2,5,4,1};
       //1 2 3 4 1 2 5 
       nextPermutation(num);
       for(int temp:num){
    	   System.out.print(temp+" ");
       }
	}
	public static void nextPermutation(int[] num) {
		if (num == null) {
			return;
		}
		int len = num.length;
		for(int i= len - 2;i>=0;i--){
			if(num[i+1]>num[i]){
				int j;
				for(j=len-1;j>i-1;j--){
					if(num[j]>num[i]){
						break;
					}
				}
				swap(num, i, j);
				reverse(num, i+1, len-1);
				return;
			}
			
		}
		reverse(num, 0, len-1);//important
		
	}
	public static void nextPermutation2(int[] num) {
		if (num == null) {
			return;
		}

		int len = num.length;
		for (int i = len - 2; i >= 0; i--) {
			if (num[i + 1] > num[i]) {
				int j;
				for (j = len - 1; j > i - 1; j--) {
					if (num[j] > num[i]) {
						break;
					}
				}

				swap(num, i, j);
				
				reverse(num, i + 1, len - 1);
				return;
			}
		}
	}

	static void swap(int[] num, int i, int j) {
		int tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
	}

	static void reverse(int[] num, int beg, int end) {
		for (int i = beg, j = end; i < j; i++, j--) {
			swap(num, i, j);
		}
	}
}
