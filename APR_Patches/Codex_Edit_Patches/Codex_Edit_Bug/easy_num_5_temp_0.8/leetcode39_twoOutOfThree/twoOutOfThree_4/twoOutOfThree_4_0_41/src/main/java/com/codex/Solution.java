package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> ret = new LinkedList<>();
        Set<Integer> hm = new HashSet<>();
        for(int n1 : nums1){
            if(!hm.contains(n1)){
                hm.add(n1);
            }
        }
        for(int n2 : nums2){
            if(hm.contains(n2)){
                ret.add(n2);
            }
            if(!hm.contains(n2)){
                hm.add(n2);
            }
        }
        for(int n3 : nums3){
            if(hm.contains(n3)){
                ret.add(n3);
            }
            if(hm2.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }

    
}