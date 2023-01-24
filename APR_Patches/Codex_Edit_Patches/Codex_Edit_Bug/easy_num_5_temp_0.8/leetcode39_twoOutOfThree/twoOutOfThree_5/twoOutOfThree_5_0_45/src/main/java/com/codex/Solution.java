package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int n: arr1) {
            set1.add(n);
        }
        for (int n: arr2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        for (int n: arr3) {
            if (set2.contains(n)) {
                set2.add(n);
            }
        }
        
        return new ArrayList<>(set2);
    }
    
    
}