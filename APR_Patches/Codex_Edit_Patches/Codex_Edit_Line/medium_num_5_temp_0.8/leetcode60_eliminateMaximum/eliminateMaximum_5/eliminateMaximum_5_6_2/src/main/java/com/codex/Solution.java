package com.codex;

import java.util.*;

public class Solution {
public class Main {
 
    public static int eliminateMaximum(int[] dist, int[] speed, int k) {
        
        if (dist.length == 0 || k == 0) {
            return 0;
        }
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
        int count = 0;
        for (int i = 0; i < maxIndex; i++) {
            if (dist[maxIndex] - dist[i] <= speed[i] * speed[maxIndex]) {
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
        int[] dist = {4,4,4,4};
        int[] speed = {4,4,4,4};
        int k = 2;
        System.out.println(eliminateMaximum(dist, speed, k));
    }
}
}