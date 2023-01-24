package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i : nums1){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        for(int i : nums2){
            if(map.containsKey(i) && map.get(i) > 0){
                result.add(i);
                map.put(i, map.get(i)-1);
            }
        }

       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++) {
           r[i] = result.get(i);
       }
        
       return r;
    }
}
}