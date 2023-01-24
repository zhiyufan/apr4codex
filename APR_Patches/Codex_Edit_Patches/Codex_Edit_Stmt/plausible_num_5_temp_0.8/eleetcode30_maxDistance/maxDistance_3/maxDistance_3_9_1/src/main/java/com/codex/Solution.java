package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(colors[colors.length - 1], colors.length - 1);
        int prev = colors.length - 1;
        int min = Integer.MAX_VALUE;
        for(int i = colors.length - 2; i >= 0; i--){
            if(map.containsKey(colors[i])) min = Math.min(min, prev - i);
            else if(min != Integer.MAX_VALUE) map.put(colors[i], i);
            prev = i;
        } 
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}