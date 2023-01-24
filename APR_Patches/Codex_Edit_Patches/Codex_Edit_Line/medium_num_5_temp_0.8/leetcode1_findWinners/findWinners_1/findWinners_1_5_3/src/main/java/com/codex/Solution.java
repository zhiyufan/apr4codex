package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] match:matches) {
            map.put(match[0], map.getOrDefault(match[0], 0));
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int player:map.keySet()) {
            if (map.get(player) == 1) {
                list1.add(player);
            }
            if (map.get(player) == 0) {
                list2.add(player);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1); 
        ans.add(list2);
        return ans;
    }

    
}