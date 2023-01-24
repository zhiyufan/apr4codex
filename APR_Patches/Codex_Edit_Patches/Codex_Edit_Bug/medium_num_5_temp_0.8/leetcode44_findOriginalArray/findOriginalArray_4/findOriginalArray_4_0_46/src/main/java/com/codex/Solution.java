package com.codex;

import java.util.*;

public class Solution {
 import java.util.*;

public class Sample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOriginalArray(new int[]{4, 2, 4, 2})));
        System.out.println(Arrays.toString(findOriginalArray(new int[]{2, 2, 3, 3})));
    }
   
    public static int[] findOriginalArray(int[] A) {
        
        int[] original = new int[A.length/2];
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


    
}