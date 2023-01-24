package com.codex;

import java.util.*;

public class Solution {
    /*
     * Complete the function below.
     */
    static int[] findOriginalArray(int[] changed) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : changed) {
            if (set.contains(num/2)) {
                set.remove(num/2);
            } else {
                if (num % 2 == 0) {
                    set.add(num/2);
                } else {
                    return new int[]{};
                }
            }
        }
        if (!set.isEmpty()) {
            return new int[]{};
        }
        int[] odd = new int[set.size()];
        int index = 0;
        for (int num : set) {
            odd[index++] = num;
        }
        return odd;
    }
/*
    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            if (set.contains(changed[i]/2)) {
                set.remove(changed[i]/2);
            } else {
                if (changed[i] % 2 == 0) {
                    set.add(changed[i]/2);
                } else {
                    return new int[]{};
                }
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

*/

    
}