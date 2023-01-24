package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(int[] changed) {
        // HashSet is used to ensure that there are no duplicates
        // in the array if there are then the array is not divisible
        // by 2. 
        HashSet<Integer> set = new HashSet<>();
        
        // iterate through the array and check if the element at position
        // i is already in the set. Remove it if it is already in the set
        // otherwise add it to the set
        for (int i = 0; i < changed.length; i++) {
            if (set.contains(changed[i]/2)) {
                set.remove(changed[i]/2);
            } else {
                set.add(changed[i]/2);
            }
        }
        if (!set.isEmpty()) {
            return new int[]{};
        }
        int k = 0;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                original[k] = changed[i]/2;
                k++;
            }
        }
        return original;
    }


    
}