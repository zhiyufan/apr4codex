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
        List<Integer> ans0 = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] match : matches) {
            if (map.containsKey(match[1]))
                map.put(match[1], map.get(match[1]) + 1);
            else
                map.put(match[1], 1);
            set.add(match[0]);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                ans1.add(i);
                set.remove(i);
            }
        }
        for (int i : set) {
            ans0.add(i);
        }
        Collections.sort(ans0);
        Collections.sort(ans1);
        return Arrays.asList(ans0, ans1);
    }

    }