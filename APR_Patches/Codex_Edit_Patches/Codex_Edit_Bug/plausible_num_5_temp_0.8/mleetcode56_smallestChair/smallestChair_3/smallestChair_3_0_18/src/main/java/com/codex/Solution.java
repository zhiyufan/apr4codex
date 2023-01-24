package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {

        int min = Integer.MAX_VALUE;

        for (int[] time : times) {
            min = Math.min(time[0], min);
        }

        TreeMap<Integer, Integer> treesMap = new TreeMap<>();

        for (int i = 0; i < times.length; i++) {
            treesMap.put(times[i][0], i);
        }

        TreeSet<int[]> treeSet = new TreeSet<>((r1, r2) -> r1[1] - r2[1]); //Sort by end time
        
        for (int i = 0; i < times.length; i++) {
            int[] time = times[i];
            treeSet.add(time);
            Integer g = treesMap.get(time[0]);

            while (treeSet.size() > targetFriend && g != null) {
                if (treeSet.pollFirst() == time) {
                    g = null;
                }
            }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }

    
}