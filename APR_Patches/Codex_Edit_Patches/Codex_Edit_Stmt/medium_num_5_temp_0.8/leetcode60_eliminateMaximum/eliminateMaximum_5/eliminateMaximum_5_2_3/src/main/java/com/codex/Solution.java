package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] maxDist = new int[];
        int[] maxSpeed = new int[];
        for (int k = 0; k < dist.length; k++) {
            for (int i = 1; i < dist.length; i++) {
                if (dist[i] > dist[maxIndex]) {
                    maxIndex = i;
                    continue;
                }
                if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
                    maxIndex = i;
                }
            }
        }
        int count = 1;
        for (int i = 0; i < maxIndex; i++) {
            if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex] || dist[i] == dist[maxIndex]) {
                count++;
            }
        }
        return count;
    }
    
}