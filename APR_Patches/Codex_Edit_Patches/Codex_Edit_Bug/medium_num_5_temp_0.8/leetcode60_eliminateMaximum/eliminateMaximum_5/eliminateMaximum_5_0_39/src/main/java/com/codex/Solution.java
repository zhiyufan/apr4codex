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
    for (int i = 0; i < maxIndex; i++) {
        if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex]) {
            count++;
        }
    }
    return count;
}

// Integer overflow
public static int eliminateMaximum(int[] dist, int[] speed) {
    int maxIndex = -1;
    int maxDist =  0;
    for (int i = 0; i < dist.length; i++) {
        if (dist[i] - speed[i] > maxDist) {
            maxDist = dist[i] - speed[i];
            maxIndex = i;
        }
    }
    if (maxIndex == -1) {
        return 0;
    } else {
        int count = 1;
        for (int i = 0; i < maxIndex; i++) {
            if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex]) {
                count++;
            }
            return count;
        }
    }
}
}