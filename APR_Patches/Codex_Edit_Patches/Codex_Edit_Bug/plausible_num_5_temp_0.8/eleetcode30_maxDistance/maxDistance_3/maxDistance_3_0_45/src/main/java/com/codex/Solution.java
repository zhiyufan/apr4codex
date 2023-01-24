package com.codex;

import java.util.*;

public class Solution {
public static int maxDistance(int[] colors) {
        
        //left[i] means the first same color block on the left side of colors[i]
        //right[i] means the first same color block on the right side of colors[i]
        int[] left = new int[colors.length]; 
        int[] right = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            right[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : colors.length;
            map.put(colors[i], i);
        }
        

        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            left[i] = map.containsKey(colors[i]) ? map.get(colors[i]) : -1;
            map.put(colors[i], i);
            
            int longest = Math.abs(right[i] - left[i]) - 1;
            max = Math.max(max, longest);
        }
        return max;
    }

    
}