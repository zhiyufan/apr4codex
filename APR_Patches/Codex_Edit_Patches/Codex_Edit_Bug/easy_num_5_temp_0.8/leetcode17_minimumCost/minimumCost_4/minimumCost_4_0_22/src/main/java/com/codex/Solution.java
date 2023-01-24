package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minimumCost(int N, int[][] connections) {
        Map<Integer, Set<Integer>> graph = buildGraph(connections);
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{1, 1, 0});
        int cost = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (visited.contains(cur[0])) {
                continue;
            }
            cost += cur[2];
            visited.add(cur[0]);
            for (int next : graph.get(cur[0])) {
                if (!visited.contains(next)) {
                    pq.offer(new int[]{next, cur[0], cur[1]});
                }
            }
        }
        return visited.size() == N ? cost : -1;
    }

    private Map<Integer, Set<Integer>> buildGraph(int[][] connections) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int[] connection : connections) {
            graph.computeIfAbsent(connection[0], k -> new HashSet<>()).add(connection[1]);
            graph.computeIfAbsent(connection[1], k -> new HashSet<>()).add(connection[0]);
        }
        return graph;
    }
} 

/*   public static int minimumCost(int[] cost) {
        
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
    }*/
}