package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        int maxIndex = 0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] > dist[maxIndex]) {
                maxIndex = i;
                continue;
            }
            if (dist[i] == dist[maxIndex] && speed[i] > speed[maxIndex]) {
                maxIndex = i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < maxIndex; i++) {
            if (dist[i] - dist[maxIndex] <= speed[i] * speed[maxIndex] ) {
                list.add(speed[i]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < speed[maxIndex]) {
                count++;
            }
        }
        
        return count;
    }
    
}