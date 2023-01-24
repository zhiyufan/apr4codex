package com.codex;

import java.util.*;

public class Solution {
import java.util.Set;
import java.util.HashSet;

public class CountElements {
    public static int countElements(int[] arr) {
        
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i : arr) {
            set.add(i);
        }
        
        for (int i : arr) {
            if (set.contains(i + 1)) {
                count++;
            }
        }
        return count;
    }

    
}