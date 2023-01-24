package com.codex;

import java.util.*;

public class Solution {
    // Optimized version
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int maxIndex = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] > dist[maxIndex]) {
                maxIndex = i;
                continue;
            }
            if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex < 2 ? dist.length : dist.length - eliminateMaximum(dist, speed, maxIndex);
    }

    private static int eliminateMaximum(int[] dist, int[] speed, int maxIndex) {
        int count = 1;
        for (int i = 0; i < maxIndex - 1; i++) {
            if (isColliding(dist, speed, i, maxIndex) && dist[i] < dist[maxIndex]) count++;
            if (isColliding(dist, speed, i, maxIndex - 1) && dist[i] < dist[maxIndex]) count++;
            if (isColliding(dist, speed, maxIndex - 1, i) && dist[maxIndex - 1] < dist[maxIndex]) count++;
        }
        return count;
    }
    
    private static boolean isColliding(int[] dist, int[] speed, int a, int b) {
        return dist[a] - dist[b] <= speed[a] * speed[b];
    }
    
    // Original version
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int maxIndex = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] > dist[maxIndex]) {
                maxIndex = i;
                continue;
            }
            if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
                maxIndex = i;
            }
        }
        int count = 1;
        for (int i = 0; i < maxIndex; i++) {
            if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex]) {
                count++;
            }
        }
        return count;
    }
}