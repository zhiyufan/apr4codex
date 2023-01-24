package com.codex;

import java.util.*;

public class Solution {

    // public static int[] findOriginalArray(int[] changed) {
        
    //     int[] original = new int[changed.length/2];
    //     HashSet<Integer> set = new HashSet<>();
    //     for (int i = 0; i < changed.length; i++) {
    //         if (set.contains(changed[i]/2)) {
    //             set.remove(changed[i]/2);
    //         } else {
    //             if (changed[i] % 2 == 0) {
    //                 set.add(changed[i]/2);
    //             } else {
    //                 return new int[]{};
    //             }
    //         }
    //     }
    //     if (!set.isEmpty()) {
    //         return new int[]{};
    //     }
    //     int k = 0;
    //     for (int i = 0; i < changed.length; i++) {
    //         if (changed[i] % 2 == 0) {
    //             original[k] = changed[i]/2;
    //             k++;
    //         }
    //     }
    //     return original;
    // }






















































































    public static int[] findOriginalArray(int[] changed) {
        
        int[] original = new int[changed.length/2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < changed.length; i++) {
            if (set.contains(changed[i]/2)) {
                set.remove(changed[i]/2);
            } else {
                if (changed[i] % 2 == 0) {
                    set.add(changed[i]);
                } else {
                    return new int[]{};
                }
            }
        }
        if (!set.isEmpty()) {
            return new int[]{};
        }
        int k = 0, l = 0;
        for (int n : set) {
            original[k] = n;
            k++;
        for(int i = 0; i < original.length; i++) System.out.println(original[i]);
        while (original[l] % 2 == 0) {
            original[l] = original[l]/2;
            if (original[l] % 2 != 0)
            l++;
        }
        //for(int i = 0; i < original.length; i++) System.out.println(original[i]);
        }
        return original;
}