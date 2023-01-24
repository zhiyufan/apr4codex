package com.codex;

import java.util.*;

public class Solution {
public static int[] findOriginalArray(int[] changed) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < changed.length; i++) {
        map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
    }

    int[] original = new int[changed.length / 2];
    int index = 0;
    for (int i = 0; i < changed.length; i++) {
        int num = changed[i];
        if (map.get(num) == 1) {
            original[index++] = num;
        }
        map.put(num, map.get(num) - 1);
    }
    return original;
}
}