package com.codex;

import java.util.*;

public class Solution {
    private static class Pair {
        
        int index;
        int time;
        
        public Pair(int index, int time) {
            this.index = index;
            this.time = time;
        }
    }
    
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        Pair[] arr = new Pair[dist.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Pair(i, dist[i] * speed[i]);
        }
        Arrays.sort(arr, (a, b) -> {
            if(a.time > b.time) return -1;
            else if(a.time < b.time) return 1;
            else return 0;
        });
        int maxIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(speed[arr[i].index] < 0) {
                maxIndex++;
                break;
            }
        }
        return maxIndex;
    }

    
}