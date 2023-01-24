package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        for(int n : nums1){
            set.add(n);
        }


        for(int n : nums2){
            if(set.contains(n)){
                set.remove(n);
                list.add(n);
            }

            if(set.contains(n)){
                set.remove(n);
                list.add(n);
            }
        }
        return list;
    }

    
}