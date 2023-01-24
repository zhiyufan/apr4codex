package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        /** You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
         *  Return a list answer of size 2 where:
         * answer[0] is a list of all players that have not lost any matches.
         * answer[1] is a list of all players that have lost exactly one match.
         * The values in the two lists should be returned in increasing order.
         */
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
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
    }}