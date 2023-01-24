package com.codex;

import java.util.*;

public class Solution {
    
    public static int eliminateMaximum(int[] dist, int[] speed) {
        // write your code in Java SE 8
        int[] time = new int[dist.length];
        for (int i = 0; i < dist.length; i++) {
            time[i] = dist[i] / speed[i];
        }
        Arrays.sort(time);
        int min = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] < 0) {
                min++;
            }
        }
        return maxIndex;
    }

    
}