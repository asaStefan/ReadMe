package com.bupt.link.array;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
public static void main(String[] args) {
	int[] num = {1 ,0 ,-1, 0 ,-2, 2};
	int target = 0;
	ArrayList<ArrayList<Integer>> result = new FourSum().fourSum(num, target);
    System.out.println(result.size());
	for(ArrayList<Integer> temp : result){
    	System.out.println(temp.toString());
    }
}
//×óÓÒ¡°¼Ð±Æ¡±£¨Í¬3sum£©
public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
	ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
	Arrays.sort(num);
	for (int i = 0; i < num.length - 3; i++) {
		if (i != 0 && num[i] == num[i - 1]) {//È¥ÖØ
			continue;
		}

		for (int j = i + 1; j < num.length - 2; j++) {
			if (j != i + 1 && num[j] == num[j - 1])
				continue;

			int left = j + 1;
			int right = num.length - 1;
			while (left < right) {
				int sum = num[i] + num[j] + num[left] + num[right];
				if (sum < target) {
					left++;
				} else if (sum > target) {
					right--;
				} else {
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(num[i]);
					tmp.add(num[j]);
					tmp.add(num[left]);
					tmp.add(num[right]);
					rst.add(tmp);
					left++;
					right--;
					while (left < right && num[left] == num[left - 1]) {
						left++;
					}
					while (left < right && num[right] == num[right + 1]) {
						right--;
					}
				}
			}
		}
	}
	return rst;
}
}
