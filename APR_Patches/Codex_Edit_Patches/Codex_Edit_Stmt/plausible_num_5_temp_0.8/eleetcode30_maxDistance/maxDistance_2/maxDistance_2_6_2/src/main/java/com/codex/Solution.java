package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] a) {
        int n = a.length;
        Map<Integer, Integer> lastOccurrence = new HashMap<>();
        int maxDist = -1;
        for (int i = 0; i < n; i++) {
            if (lastOccurrence.containsKey(a[i])) {
                maxDist = Math.max(maxDist, i - lastOccurrence.get(a[i]));
            } else {
                lastOccurrence.put(a[i], i);
            }
        }
        return maxDist;
    }
}