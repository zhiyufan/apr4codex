package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    Set<Integer> hm = new HashMap<>();
    for(int i = 0; i < nums1.length; i++){
        int val = nums1[i];
        if(hm.contains(val)){
            hm.put(val,3);
        } else {
            hm.put(val, 1);
        }
    }
    for(int i = 0; i < nums2.length; i++){
        int val = nums2[i];
        if(hm.contains(val)){
            hm.put(val, hm.get(val) + 1);
        }
    }
    for(int i = 0; i < nums3.length; i++){
        int val = nums3[i];
        if(hm.contains(val)){
            hm.put(val, hm.get(val) + 1);
        }
    }

    List<Integer> list = new LinkedList<>();
    for(int val : hm.keySet()){
        int num = hm.get(val);
        if(num > 2){
            list.add(val);
        }
    }
    return list;
}
/*
public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    

        Set<Integer> hm2 = new HashSet<>();
        for(int n : nums2){
            if(hm1.contains(n) && !list.contains(n)){
                list.add(n);
            }

            if(hm2.contains(n)){
                hm2.remove(n);
                list.add(n);
            } else {
                hm2.add(n);
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

    */
}