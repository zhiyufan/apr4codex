package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] time = new int[dist.length];
        for(int i = 0; i < time.length; i++) {
            time[i] = dist[i] * speed[i];
        }
        
        int maxTime = Integer.MAX_VALUE;
        for(int i = 0; i < time.length; i++) {
            if(time[i] > maxTime) {
                maxTime = time[i];
            }
        }
        return maxIndex;
    }

    
}