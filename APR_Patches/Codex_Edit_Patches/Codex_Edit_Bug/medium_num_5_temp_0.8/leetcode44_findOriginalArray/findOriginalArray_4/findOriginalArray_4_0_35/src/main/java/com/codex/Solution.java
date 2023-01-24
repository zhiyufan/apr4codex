package com.codex;

import java.util.*;

public class Solution {
    public static int[] findOriginalArray(Integer[] changed) {

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                evenList.add(changed[i]);
            } else {
                oddList.add(changed[i]);
            }
        }
        if (evenList.size() != (changed.length-oddList.size())) {
            return new int[]{};
        }
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
        if (set.isEmpty()) {
            int k = 0;
            int[] original = new int[evenList.size()];
            for (int i : evenList) {
                original[k] = i/2;
                k++;
            }
            return original;
        } else {
            return new int[]{};
        }

    }
}