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
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] match:matches) {
            map.put(match[0], Math.max(0,map.getOrDefault(match[0], 0) ));
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int player:map.keySet()) {
            if (map.get(player) == 0) {
                list1.add(player);
            }
            if (map.get(player) == 1) {
                list2.add(player);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(list1);
        Collections.sort(list2);
        ans.add(list1);
        ans.add(list2);
        return ans;
    }

    }