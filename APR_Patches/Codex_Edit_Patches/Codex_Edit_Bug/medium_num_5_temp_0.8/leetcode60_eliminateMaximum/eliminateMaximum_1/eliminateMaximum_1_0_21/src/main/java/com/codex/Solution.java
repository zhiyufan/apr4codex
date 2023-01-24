package com.codex;

import java.util.*;

public class Solution {
    
        public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int[] time = new int[dist.length];
        for (int i = 0; i < time.length; i++) {
            time[i] = dist[i] * speed[i];
        }
        Arrays.sort(time);
        /**
         * If the time is equal to 0 in the first place, we skip this entry altogether. 
         */
        int maxIndex = 1;
        if (time[0] == 0) {
            maxIndex = 0;
        }
        
        for (int i = 1; i < time.length; i++) {
            if (time[i] < 0) {
                maxIndex++;
            }
        }
        return maxIndex;
    }
    }
    
}