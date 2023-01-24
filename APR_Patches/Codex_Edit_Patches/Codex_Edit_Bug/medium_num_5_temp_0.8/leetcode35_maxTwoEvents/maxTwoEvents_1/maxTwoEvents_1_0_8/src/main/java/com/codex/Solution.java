package com.codex;

import java.util.*;

public class Solution {
    public static class Event implements Comparable<Event> {
        int start;
        int end;
        int value;

        public Event(int start, int end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }

        @Override
        public int compareTo(Event o) {
            return this.start - o.start;
        }
    }

    public int maxTwoEvents(int[][] events) {
        

        }

        Event[] array = new Event[events.length];
        for (int i = 0; i < events.length; i++) {
            array[i] = new Event(events[i][0], events[i][1], events[i][2]);
        }

        Arrays.sort(array);
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {
            int j = map.headMap(array[i].start).isEmpty() ? 0 : map.headMap(array[i].start).lastEntry().getValue();
            int k = map.isEmpty() ? 0 : map.lastEntry().getValue();
            map.put(array[i].end, Math.max(j + array[i].value, k));
        if (events == null || events.length == 0) {
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[n+1][n+1];

        return dp[n][n];
    }

    
}