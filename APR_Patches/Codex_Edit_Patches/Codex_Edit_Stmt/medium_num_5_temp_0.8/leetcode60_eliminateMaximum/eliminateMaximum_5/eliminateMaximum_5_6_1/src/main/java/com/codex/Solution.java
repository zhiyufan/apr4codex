package com.codex;

import java.util.*;

public class Solution {
    public static class KNN {
            public static int kthNearestNeighbor(int[] dist, int[] speed, int k) {
                Arrays.sort(dist);
                Arrays.sort(speed);
                int sum = 0;
                int count = 0;
                for (int i = 1; i < k; i++) {
                    sum = sum + (dist[i] - dist[0]) + (speed[i] - speed[0]);
                }
                for (int i = k; i < dist.length; i++) {
                    sum = sum + (dist[i] - dist[i - k + 1]) + (speed[i] - speed[i - k + 1]);
                    count++;
                }
                return sum;
            }
        }

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