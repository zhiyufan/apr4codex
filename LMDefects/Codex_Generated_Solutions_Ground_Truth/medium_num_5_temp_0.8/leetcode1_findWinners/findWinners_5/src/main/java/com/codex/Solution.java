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

        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] match : matches) {
            hashMap.put(match[0], Math.max(0,hashMap.getOrDefault(match[0], 0)));
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
        Collections.sort(list1);
        res.add(list0);
        res.add(list1);
        return res;
    }}