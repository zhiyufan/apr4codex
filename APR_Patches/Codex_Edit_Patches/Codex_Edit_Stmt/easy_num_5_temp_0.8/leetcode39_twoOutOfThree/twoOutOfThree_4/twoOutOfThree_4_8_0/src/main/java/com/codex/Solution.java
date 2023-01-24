package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        for(int n : nums1){
            if(set.contains(n)){
                set.remove(n);
                list.add(n);
            } else {
                set.add(n);
            }
        }

        for(int n : nums2){
            if(set.contains(n) && !list.contains(n)){
                list.add(n);
            }

            if(set.contains(n)){
                set.remove(n);
                list.add(n);
            } else {
                set.add(n);
            }
        }

        for(int n : nums3){
            if(set.contains(n) && !list.contains(n)){
                list.add(n);
            }
            if(set.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }

    
}