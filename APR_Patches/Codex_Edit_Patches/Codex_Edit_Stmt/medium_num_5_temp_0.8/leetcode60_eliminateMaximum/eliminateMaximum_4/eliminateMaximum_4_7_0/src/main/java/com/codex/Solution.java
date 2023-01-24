package com.codex;

import java.util.*;

public class Solution {
public static int eliminateMaximum(int[] dist, int[] speed) {
    //machines count, distance
    PriorityQueue<double[]> pq = new PriorityQueue<>((a, b)->(int)(a[0] - b[0]));
    int count = 0;
    for (int i = 0; i < dist.length; i++) {
        double time = (double)dist[i] / speed[i];
        pq.add(new double[]{time, dist[i]});
    }

    double prevTime = pq.poll()[0];
    int prevDist = (int)pq.peek()[1];
    while (!pq.isEmpty()) {
        double time = pq.poll()[0];
        int dist = (int)pq.peek()[1];
        if (time - prevTime <= 1) {
            count++;
            prevTime = time;
            prevDist = dist;
        } else {
            break;
        }
    }
    return count;
}
//[1000,5000,9000,13000,15000,20000]
//[10,20,30,40,50,60]
}