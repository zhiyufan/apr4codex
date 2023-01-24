package com.codex;

import java.util.*;

public class Solution {
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
        int max = dist[maxIndex];
        int maxSpeed = speed[maxIndex];
        for (int i = 1; i < maxIndex; i++) {
            if (dist[i] - max <= speed[i] * maxSpeed) {
                count++;
            }
        }
        return count;
    }
    
}