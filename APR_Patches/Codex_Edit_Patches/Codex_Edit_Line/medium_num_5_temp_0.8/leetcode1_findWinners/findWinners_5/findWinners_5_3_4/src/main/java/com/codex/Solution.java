package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        

        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] match : matches) {
            hashMap.put(match[0], hashMap.getOrDefault(match[0], 0) + 1);
            hashMap.put(match[1], hashMap.getOrDefault(match[1], 0) + 1);
        }

        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) == 0) {
                list0.add(key);
            }
            else if (hashMap.get(key) == 1) {
                list1.add(key);
            }
        }
        Collections.sort(list0);
        Collections.sort(list1, Collections.reverseOrder());
        res.add(list0);
        res.add(list1);
        return res;
    }
}