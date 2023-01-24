package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] time = new int[dist.length];
        int maxIndex = 0;
        for(int i = 0; i < time.length; i++) {
            if (speed[i] < 0) {
                time[i] = dist[i] * speed[i];
            } else {
                maxIndex++;
            }
        }
        Arrays.sort(time);
        int maxIndex = 0;
        for(int i = 0; i < time.length; i++) {
            if(time[i] < 0) {
                maxIndex++;
            }
        }
        return maxIndex;
    }

    
}