package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {

        int maxIndexSpeed = 0;
        int maxIndexDirection = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] > dist[maxIndexDirection]) {
                maxIndexDirection = i;
            }
            if (dist[i] == dist[maxIndexDirection] && speed[i] > speed[maxIndexSpeed]) {
                maxIndexSpeed = i;
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