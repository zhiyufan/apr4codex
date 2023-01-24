package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int res = 0;
        for (int curCost : cost) {
            if (curCost <= min) {
                res += min;
                secondMin = min;
                min = curCost;
            } else if (curCost < secondMin) {
                res += curCost;
                secondMin = curCost;
            } else {
                res += secondMin;
            }
        }
        return res;
    }



class Solution {
    public int minimumCost(int N, int[][] connections) {
        int[] parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int[] c : connections) {
            pq.offer(c);
        }
        int res = 0;
        int count = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int root1 = find(parent, cur[0]);
            int root2 = find(parent, cur[1]);
            if (root1 == root2) {
                continue;
            }
            count++;
            parent[root1] = root2;
            res += cur[2];
        }
        return count == N - 1 ? res : -1;
    }
    private int find(int[] parent, int i) {
        if (parent[i] != i) {
            i = find(parent, parent[i]);
        }
        return i;
    }
}
}