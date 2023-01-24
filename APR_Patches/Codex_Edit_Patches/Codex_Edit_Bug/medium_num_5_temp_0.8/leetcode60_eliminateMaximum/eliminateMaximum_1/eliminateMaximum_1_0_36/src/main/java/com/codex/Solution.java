package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] time = new int[dist.length];
        for(int i = 0; i < time.length; i++) {
            time[i] = (int)Math.ceil(dist[i] * speed[i]);
        }
        Arrays.sort(time);
        int maxIndex = 0;
        for(int i = 0; i < time.length; i++) {
            maxIndex++;
        }
        return maxIndex;
    }

    
}