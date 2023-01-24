package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] time = new int[dist.length];
        int maxIndex = 0;
        for(int i = 0; i < time.length; i++) {
            if(dist[i] < 0) {
                maxIndex++;
            }
        }
        return maxIndex;
    }

    
}