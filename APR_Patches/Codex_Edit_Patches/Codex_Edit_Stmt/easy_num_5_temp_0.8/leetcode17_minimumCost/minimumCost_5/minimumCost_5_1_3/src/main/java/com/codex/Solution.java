package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : cost) {
            list.add(i);
        }
        Collections.sort(list);
        int res = list.get(0);
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2 || i == 0) {
                continue;
            }
            res += Math.min(list.get(i), list.get(i - 1));
        }
        return res;
    }

    //use PriorityQueue
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int price : cost) {
            pq.offer(price);
        }
        int res = pq.poll();
        int pre = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2 || i == 0) {
                continue;
            }
            pre = pq.poll();
            res += Math.min(pre, pq.peek());
            pq.offer(pre);
        }
        return res;
    }
}