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
public static int eliminateMinimum(int[] dist, int[] speed) {
        
    int minIndex = 0;
    for (int i = 1; i < dist.length; i++) {
        if (dist[i] < dist[minIndex]) {
            minIndex = i;
            continue;
        }
        if (dist[i] == dist[minIndex] && speed[i] < speed[minIndex]) {
            minIndex = i;
        }
    }
    int count = 1;
    for (int i = 0; i < minIndex; i++) {
        if (dist[i] - dist[minIndex] <= speed[i] * speed[minIndex]) {
            count++;
        }
    }
    return count;
}
    
public static boolean isEliminatingPossible(int[] dist, int[] speed) {
        
    int count = 0;
    for(int i = 0; i < dist.length; i++) {
        for(int j = 0; j < dist.length; j++) {
            if(i != j && dist[j] <= dist[i] + speed[i] * speed[j]) {
                count++;
                break;
            }
        }
        if(count == dist.length) {
            return true;
        }
    }
    return false;
}
    
}