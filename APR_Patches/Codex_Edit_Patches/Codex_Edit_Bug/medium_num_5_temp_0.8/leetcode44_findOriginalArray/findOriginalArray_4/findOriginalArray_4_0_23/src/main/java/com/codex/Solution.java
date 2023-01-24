package com.codex;

import java.util.*;

public class Solution {
 public class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed == null || changed.length == 0) {
            return new int[0];
        }
        int len = changed.length;
        int[] original = new int[len / 2];
        HashSet<Integer> set = new HashSet<>(); 
        for (int cur : changed) {
            int val = cur / 2;
            if (set.contains(val)) {
                set.remove(val);
            } else {  
                set.add(val);
            }
        }
        if (set.size() != 0) {
            return new int[0];
        }
        int i = 0;
        for (int cur : changed) {
            if (cur % 2 == 0) {
                original[i++] = cur / 2;
            }
        }
        return original;
    }


    
}