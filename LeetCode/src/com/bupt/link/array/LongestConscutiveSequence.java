package com.bupt.link.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/**
 * 缺点：不能含有重复值(即重复值不计入)
 * @author root
 *
 */
public class LongestConscutiveSequence {
	public static void main(String[] args) {
		int[] num = {1,4,2,3,8,7};
		System.out.println(new LongestConscutiveSequence().longestConsecutive2(num));
		System.out.println(test(num));
	}
	// Sort & search: space O(1), time O(n logn)
	// HashMap: space O(n), time O(n)
	public int longestConsecutive(int[] num) {
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (int i : num) {
			hs.put(i, 0);
		}
		int maxl = 1;
		for (int i : num) {
			if (hs.get(i) == 1)
				continue;

			int tmp = i;
			int current_max = 1;
			while (hs.containsKey(tmp + 1)) {
				current_max++;
				tmp++;
				hs.put(tmp, 1);
			}

			tmp = i;
			while (hs.containsKey(tmp - 1)) {
				current_max++;
				tmp--;
				hs.put(tmp, 1);
			}

			maxl = Math.max(current_max, maxl);
		}

		return maxl;
	}
//method 2
     
	    // 遇到不能排序又要复杂度O(n)有序的问题，只能增加空间复杂度，用hashset或者hashtable  
	    public static int longestConsecutive2(int[] num) {  
	        Set<Integer> set = new HashSet<Integer>();  
	           
	        for (int i : num) {  
	            set.add(i);  
	        }  
	        int max = 0;  
	           
	        for(int i=0; i<num.length; i++){  
	            if(set.contains(num[i])){  
	                int next = num[i] - 1;      // 找比num[i]小一个的值  
	                int count = 1;  
	                set.remove(num[i]);         // 及时的移除，减少之后的查找时间  
	                while(set.contains(next)){  
	                    set.remove(next);  
	                    next--;  
	                    count++;  
	                }  
	                next = num[i] + 1;      // 找比num[i]大一个的值  
	                while(set.contains(next)){  
	                    set.remove(next);  
	                    next++;  
	                    count++;  
	                }  
	                max = Math.max(max, count);  
	            }  
	        }  
	           
	        return max;  
	    } 
	  //
	    public static int test(int[] num){
	        Set<Integer> hashSet = new HashSet<Integer>();
	    	
	        for(int temp:num)
	        	hashSet.add(temp);
	        int max = 0;
	   
	    	for(int i = 0;i<num.length;i++){
	    		if(hashSet.contains(num[i])){
	    			int next = num[i]-1;
	    			int count = 1;
	    			hashSet.remove(num[i]);//important ----
	    			while(hashSet.contains(next)){
	    				hashSet.remove(next);//important
	    				count++;
	    				next--;//important	
	    			}
	    			next = num[i]+1;
	    			while(hashSet.contains(next)){
	    				hashSet.remove(next);//important
	    				count++;
	    				next++;//important	
	    			}
	    			max = Math.max(max, count);
	    		}
	    		
	    	}
	        return max;
	    }
}
