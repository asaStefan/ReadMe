package com.bupt.stl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("c", "ccccc");
       // map.put("d", "ddd22d");
        map.put("a", "aaaaa");
        map.put("b", "bbbbb");
        map.put("d", "ddddd");
        List<Map.Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,String>>() {
            //升序排序
            public int compare(Entry<String, String> o1,
                    Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry<String,String> mapping:list){ 
               System.out.println(mapping.getKey()+":"+mapping.getValue()); 
          } 
    	//2
		/**
		 * key 重复时以最新为准；key可为null
		 */
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("12","d");
    	hashMap.put("12","de");
    	hashMap.put(null, null);
    	System.out.println(hashMap.get(null));
    	System.out.println(hashMap.get("12"));
    	for(String temp:hashMap.keySet()){
    		System.out.println(temp);
    	}
     }
	

	
}
