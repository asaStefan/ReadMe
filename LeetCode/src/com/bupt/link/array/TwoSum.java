package com.bupt.link.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
public static void main(String[] args) {
	int[] numbers = {1,2,3,5,7,10};
	int target = 9;
	//int[] result = new TwoSum().twoSum(numbers, target);
	int[] result = new TwoSum().twoSum2(numbers, target);
	for(int temp:result){
		System.out.print(temp+" ");
		System.out.println();
	}
}
public int[] twoSum(int[] numbers, int target) {
	int[] result = {0,0};
	for(int i = 0;i<numbers.length;i++){
		for(int j = i+1;j<numbers.length;j++){
			if(numbers[i]+numbers[j]==target){
				result[0] = i+1;
				result[1] = j+1;
				break;
			}
		}
	}
	return result;
}
//假定 数组里面无重复值
public int[] twoSum2(int[] numbers, int target) {
	int[] result = {0,0};
	HashMap<Integer,Integer> HashMap = new HashMap<Integer,Integer>();
	int j = 0;
	/*for(int temp:numbers)    wrong answer:改进
		HashMap.put(temp,j++);*/
	for(int i=0;i<numbers.length;i++){
		HashMap.put(numbers[i], i+1);
	}
	for(int i=0;i<numbers.length;i++){
		HashMap.remove(numbers[i]);
		if(HashMap.containsKey(target - numbers[i])){
			result[0] = i+1;
			result[1] = HashMap.get(target - numbers[i]);
			break;
		}
	}
	return result;
}

//标准答案（比第一种方法省时间）

public int[] twoSum_hashmap(int[] numbers, int target) {
	if(numbers == null || numbers.length < 2) {
		return null;
	}
    HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
    for(int i=0; i<numbers.length; i++){
        hs.put(numbers[i], i+1);
    }       
    /*  这样写导致数组的重复值不能同时进入hashmap
     int j = 0;
	 for(int temp:numbers)
		HashMap.put(temp,j++);
     */
    int[] a = new int[2];
    
    for(int i=0; i<numbers.length ; i++){
        if ( hs.containsKey( target - numbers[i] )){
            int index1 = i+1;
            int index2 = hs.get(target - numbers[i]);
            //改进二，不用删除则不去删除
            //防止此值为target的一半
            if (index1 == index2){
                continue;
            }
            a[0] = index1;
            a[1] = index2;
            return a;
        }
    }
    return a;
}
//Can’t use the sort method here, since the question asks for indexes.
public int[] twoSum_pointer(int[] numbers, int target) {
	if(numbers == null || numbers.length < 2) {
		return null;
	}
    Arrays.sort(numbers);
    int left = 0;
    int right = numbers.length - 1;
    int[] rst = new int[2];
    
    while( left < right){
        int sum = numbers[left] +  numbers[right];
        if( sum == target){
            rst[0] = left + 1;
            rst[1] = right + 1;
            break;
        }else if( sum < target){
            left++;
        }else{
            right--;
        }
    }
    return rst;
}

}
