package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        int ans = 0;
        int max = -1;
        int[] time = new int[dist.length];
        for (int i = 0; i < dist.length; i++) {
            time[i] = dist[i] * speed[i];
            if (time[i] > max) {
                max = time[i];
                ans = 1;
            } else if (time[i] == max) {
                ans++;
            }
        }
        
        return ans;
    }
}