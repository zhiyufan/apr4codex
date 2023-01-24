package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}, {1, 6}, {2, 7}, {3, 8}};
        System.out.println(getResults(arr));

    }

    public static List<List<Integer>> findResults(int[][] matches) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] match : matches) {
            map.put(match[0], map.getOrDefault(match[0], 0) + 1);
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getValue();
            if (num < 2) lists.get(0).add(entry.getKey());
            else if (num == 2) lists.get(1).add(entry.getKey());
        }

        // Collections.sort(lists.get(0));
        Collections.sort(lists.get(1));
        Collections.sort(lists.get(0));
        return lists;
    }
}