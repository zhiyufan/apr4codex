package com.codex;

import java.util.*;

public class Solution {
    class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int n = A.length, m = B.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int[] res = new int[n];
        for (int i = 0; i < m; i++) {
            Integer key = map.ceilingKey(B[i] + 1);
            if (key == null) {
                key = map.firstKey();
            }
            res[i] = key;
            map.put(key, map.get(key) - 1);
            if (map.get(key) == 0) {
                map.remove(key);
            }
        }
        for (int i = m, ids : map.keySet()) {
            res[i++] = ids;
        }
        return res;
    }
}
}