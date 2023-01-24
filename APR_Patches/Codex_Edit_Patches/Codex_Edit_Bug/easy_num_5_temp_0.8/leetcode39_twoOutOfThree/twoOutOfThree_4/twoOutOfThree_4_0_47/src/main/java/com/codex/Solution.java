package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> hm1 = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        for(int n : nums1){
            if(hm1.contains(n)){
                hm1.remove(n);
                list.add(n);
            } else {
                hm1.add(n);
            }
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        Set<Integer> hm2 = new HashSet<>();
        for(int n : nums2){
            int val = 1;
            if(map.containsKey(n)){
                val = map.get(n);
            }

            if(hm1.contains(n) && val == 1){
                map.put(n, 3);
            }
        }

        for(int n : nums3){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }
            if(hm2.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }

    
}