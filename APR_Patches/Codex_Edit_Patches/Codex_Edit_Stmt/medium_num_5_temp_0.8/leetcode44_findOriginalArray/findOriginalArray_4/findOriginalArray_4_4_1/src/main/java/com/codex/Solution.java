package com.codex;

import java.util.*;

public class Solution {
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








public static void main(String[] args) {
    int[] nums = {4,4,7,7,9,9,7,7,4,4};
    int[] originalArray = findOriginalArray(nums);
    System.out.println(Arrays.toString(originalArray));
}















import java.util.Arrays;
import java.util.HashSet;

public class ArrayProcessor {
 
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

        return original;        
    }

    public static void main(String[] args) {
        int[] nums = {4,4,7,7,9,9,7,7,4,4};
        int[] originalArray = findOriginalArray(nums);
        System.out.println(Arrays.toString(originalArray));
    }
}
}