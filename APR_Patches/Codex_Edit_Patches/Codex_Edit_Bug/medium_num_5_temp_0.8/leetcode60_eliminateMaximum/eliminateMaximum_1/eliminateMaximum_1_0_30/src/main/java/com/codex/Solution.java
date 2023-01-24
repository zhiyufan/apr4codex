package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] time = new int[dist.length];
        for(int i = 0; i < time.length; i++) {
            time[i] = dist[i] * speed[i];
        }
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < time.length; i++) {
            if(time[i] > max) {
                maxIndex++;
                max = time[i];
            }
        }
        return maxIndex;
    }

    
}