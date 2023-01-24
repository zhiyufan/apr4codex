package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        List<Integer> list = new LinkedList<>();
        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);
        for(int n : nums3) set3.add(n);

        for(int n : set1){
            if(set2.contains(n) || set3.contains(n)){
                list.add(n);
            }
        }
            if(set1.contains(n) && set2.contains(n) && set3.contains(n)){
                list.add(n);
            }
        }


        return list;
    }

    
}