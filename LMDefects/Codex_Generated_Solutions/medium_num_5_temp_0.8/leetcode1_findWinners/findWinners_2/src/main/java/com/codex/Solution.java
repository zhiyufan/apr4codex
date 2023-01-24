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
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            if (!map.containsKey(winner)) {
                map.put(winner, 0);
            }
            map.put(winner, map.get(winner) + 1);
            if (!map.containsKey(loser)) {
                map.put(loser, 0);
            }
            map.put(loser, map.get(loser) - 1);
        }
        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                winners.add(key);
            }
            if (map.get(key) < 0) {
                losers.add(key);
            }
        }
        Collections.sort(winners}