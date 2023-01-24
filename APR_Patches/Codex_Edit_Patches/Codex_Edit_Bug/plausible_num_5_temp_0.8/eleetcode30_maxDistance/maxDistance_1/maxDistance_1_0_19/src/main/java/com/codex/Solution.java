package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        
        int distance = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        map.put(colors[0], 0);

        for (int i = 0; i < colors.length; i++) {
            if (!map.containsKey(colors[i])) 
                map.put(colors[i], i);
            
            max = Math.max(max, map.get(colors[i]));
            min = Math.min(min, map.get(colors[i]));
            
            distance = Math.max(max - min, distance);
            
            if (distance == colors.length - 1)
                break;
        }
        return distance;
    }

    
}