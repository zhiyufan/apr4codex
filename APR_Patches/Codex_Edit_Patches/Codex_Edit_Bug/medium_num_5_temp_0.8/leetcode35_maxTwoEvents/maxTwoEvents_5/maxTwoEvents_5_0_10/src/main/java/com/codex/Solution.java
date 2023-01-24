package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] != b[1]? a[1] - b[1] : b[0] - a[0]);
        int size = Integer.MIN_VALUE;
        for(int[] e : events)
            size = Math.max(size, e[1]);
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = events[i][0]; j <= events[i][1]; j++){
                if(set.contains(j))
                    continue;
                res++;
                set.add(j);
                break;
            }
        }
        return res;
    }

    public int maxTwoEvents(int[][] events) {
        // add fake event
        for (int i = 1; i < events.length; i++) {
            events[i][0] = Math.max(events[i][0], events[i-1][1] + 1);
        }
        Arrays.sort(events, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0] || a[1] != b[1]) {
                    return a[0] - b[0];
                }
                return b[2] - a[2];
            }
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i = 0; i < events.length; i++) {
            if(pq.isEmpty()) {
                pq.offer(events[i][1]);
            } else {
                if (pq.peek() >= events[i][0]) {
                    pq.offer(events[i][1]);
                } else {
                    pq.poll();
                    pq.offer(events[i][1]);
                }
            }
        }        
        return pq.size();
    }

}
}