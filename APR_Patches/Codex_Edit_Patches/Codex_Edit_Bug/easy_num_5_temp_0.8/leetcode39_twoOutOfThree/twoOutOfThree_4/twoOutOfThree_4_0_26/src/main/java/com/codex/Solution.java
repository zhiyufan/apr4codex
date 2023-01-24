package com.codex;

import java.util.*;

public class Solution {
    public static List<String> twoOutOfThree(String[] nums1, String[] nums2, String[] nums3) {
        
        Set<String> hm1 = new HashSet<>();
        List<String> list = new LinkedList<>();
        for(int n : nums1){
            if(hm1.contains(n)){
                hm1.remove(n);
                list.add(n);
            } else {
                hm1.add(n);
            }
        }

        Set<String> hm2 = new HashSet<>();
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

    
}