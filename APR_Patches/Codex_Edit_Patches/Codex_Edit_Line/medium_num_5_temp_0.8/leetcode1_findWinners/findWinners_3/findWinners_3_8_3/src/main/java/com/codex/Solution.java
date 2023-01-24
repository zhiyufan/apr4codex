package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> lists = new ArrayList<>();
        
        lists.add(new ArrayList<>());
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] match : matches) {
            map.put(match[0], map.getOrDefault(match[0], 0) + 1);
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) lists.get(0).add(entry.getKey());
            else if (entry.getValue() == 1) lists.get(1).add(entry.getKey());
        }

        Collections.sort(lists.get(0));
        Collections.sort(lists.get(1));

        return lists;
    }
}