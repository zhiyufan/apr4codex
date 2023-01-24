package com.codex;

import java.util.*;

public class Solution {
//   public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
//         Map<Integer, Integer> row = new HashMap();
//         Map<Integer, Integer> col = new HashMap();
//         Map<Integer, Integer> diag1 = new HashMap();
//         Map<Integer, Integer> diag2 = new HashMap();
//         Map<Integer, Set<Pair<Integer, Integer>>> map = new HashMap<>();
//         int[] result = new int[queries.length];

//         for (int[] lamp: lamps) {
//             int r = lamp[0];
//             int c = lamp[1];
//             row.put(r, row.getOrDefault(r, 0) + 1);
//             col.put(c, col.getOrDefault(c, 0) + 1);
//             diag1.put(r - c, diag1.getOrDefault(r - c, 0) + 1);
//             diag2.put(r + c, diag2.getOrDefault(r + c, 0) + 1);
//             if (!map.containsKey(r)) {
//                 map.put(r, new HashSet<>());
//             }
//             map.get(r).add(new Pair<>(r, c));
//         }
//         for (int i = 0; i < queries.length; i++) {
//             int r = queries[i][0];
//             int c = queries[i][1];
//             if (row.getOrDefault(r, 0) > 0 || col.getOrDefault(c, 0) > 0 || diag1.getOrDefault(r - c, 0) > 0 || diag2.getOrDefault(r + c, 0) > 0) {
//                 result[i] = 1;
//             }
//             for (int dr = -1; dr <= 1; dr++) {
//                 for (int dc = -1; dc <= 1; dc++) {
//                     int nr = r + dr;
//                     int nc = c + dc;
//                     if (map.containsKey(nr) && map.get(nr).contains(new Pair<>(nr, nc))) {
//                         row.put(nr, row.getOrDefault(nr, 1) - 1);
//                         col.put(nc, col.getOrDefault(nc, 1) - 1);
//                         diag1.put(nr - nc, diag1.getOrDefault(nr - nc, 1) - 1);
//                         diag2.put(nr + nc, diag2.getOrDefault(nr + nc, 1) - 1);
//                         map.get(nr).remove(new Pair<>(nr, nc));
//                     }
//                 }
//             }
//         }
//         return result;
//     }

    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
        int[] result = new int[queries.length];
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> dia1 = new HashMap<>();
        Map<Integer, Integer> dia2 = new HashMap<>();
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        
        for (int i = 0; i < lamps.length; i++) {
            int r = lamps[i][0];
            int c = lamps[i][1];
            update(row, r, 1);
            update(col, c, 1);
            update(dia1, r + c, 1);
            update(dia2, r - c, 1);
            set.add(new Pair<>(r, c));
        }
        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0];
            int c = queries[i][1];
            if (query(row, r) > 0 || query(col, c) > 0 || query(dia1, r + c) > 0 || query(dia2, r - c) > 0) {
                result[i] = 1;
            }
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    int nr = r + dr;
                    int nc = c + dc;
                    if (set.contains(new Pair<>(nr, nc))) {
                        update(row, nr, -1);
                        update(col, nc, -1);
                        update(dia1, nr + nc, -1);
                        update(dia2, nr - nc, -1);
                        set.remove(new Pair<>(nr, nc));
                    }
                }
            }
        }
        return result;
    }

    private void update(Map<Integer, Integer> map, int key, int value) {
        map.put(key, map.getOrDefault(key, 0) + value);
    }
    
    private int query(Map<Integer, Integer> map, int key) {
        return map.getOrDefault(key, 0);
    }
}