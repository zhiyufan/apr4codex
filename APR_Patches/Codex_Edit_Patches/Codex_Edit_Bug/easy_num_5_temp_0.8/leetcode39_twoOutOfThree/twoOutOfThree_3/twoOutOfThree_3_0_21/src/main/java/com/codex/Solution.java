package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }        
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                set.remove(arr2[i]);
                res.add(arr2[i]);
            }
        }        
        for (int i = 0; i < arr3.length; i++) {
            if (set.contains(arr3[i])) {
                res.add(arr3[i]);
            }
        }
        return res;
    }

    
}