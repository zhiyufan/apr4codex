package com.codex;

import java.util.*;

public class Solution {
public static int[] findOriginalArray(int[] changed) {
        
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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < changed.length; i++) {
            if (changed[i] % 2 == 0) {
                list.add(changed[i]/2);
            }
        }
        if (!set.isEmpty() || list.size() != changed.length/2) {
            return new int[]{};
        }
        int[] original = new int[changed.length/2];
        for (int i = 0; i < list.size(); i++)
            original[i] = list.get(i);
        return original;
    }
}
}