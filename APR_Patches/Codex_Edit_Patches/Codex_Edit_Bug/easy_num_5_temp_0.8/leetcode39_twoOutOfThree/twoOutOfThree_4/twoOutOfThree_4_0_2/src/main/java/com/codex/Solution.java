package com.codex;

import java.util.*;

public class Solution {

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new LinkedList<>();
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums1){
            if(!res.contains(i)){
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
        }

        for(int i : nums2){
            if(!res.contains(i)){
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
            
            if(hm.get(i) == 2){
                hm.put(i, hm.get(i) + 1);
            }
        }

        for(int i : nums3){
            if(!res.contains(i)){
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
            
            if(hm.get(i) == 2){
                hm.put(i, hm.get(i) + 1);
            }
        }
        
        for(int i : hm.keySet()){
            if(hm.get(i) >= 2){
                res.add(i);
            }
        }
        
        return res;
    }
}