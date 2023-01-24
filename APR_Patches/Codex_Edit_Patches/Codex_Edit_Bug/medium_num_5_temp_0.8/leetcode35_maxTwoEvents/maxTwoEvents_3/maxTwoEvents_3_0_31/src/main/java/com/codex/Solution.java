package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        if(events.length == 0) {
            return 0;
        }
        if(events.length == 1) {
            return events[0][2];
        }
        
        int n = events.length, max = 0;
        Arrays.sort(events, (a,b) -> a[1] - b[1]); //sort the events by end time
        Map<Integer, Integer> map = new HashMap<>(); //key -> end time, value -> profit
        
        for(int[] event : events) {
            int profit = event[2];
            if(map.containsKey(event[0])) {
                profit += map.get(event[0]);
            }
            map.put(event[1], profit);
            max = Math.max(profit, max);
        }
        return max;
    }
}