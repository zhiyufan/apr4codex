package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) {
        int[] dist = {5, 4, 3, 2, 1};
        int[] speed = {1, 2, 3, 4, 5};
        System.out.println(eliminateMaximum(dist, speed));
    }

    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        long[] time = new long[dist.length];
        for(int i = 0; i < dist.length; i++) {
            time[i] = (long)dist[i] * speed[i];
        }
        Arrays.sort(time);
        int maxIndex = 0;
        for(int i = 0; i < dist.length; i++) {
            if(time[i] < 0) {
                maxIndex++;
            }
        }
        return maxIndex;
    }

    
}