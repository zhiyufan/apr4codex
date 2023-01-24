package com.codex;

import java.util.*;

public class Solution {

	public static int maxDistance(int[] colors) {
        //if(colors == null || colors.length == 0) return 0;
        int[] left = new int[colors.length];
        int[] right = new int[colors.length];
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < colors.length; i++) {
           min = Math.min(min,colors[i]);
            max = Math.max(max,colors[i]);
        }
        for(int i = 0; i < colors.length; i++){
            map.put(colors[i], i);
        }

        for(int i = 0; i < colors.length; i++){
            map1.put(colors[i],i);
        }
        for(int i = 0; i < colors.length; i++){
            left[i] = map.containsKey(colors[i]-1) ? map.get(colors[i]-1) : -1;
        }
        for (int i = 0; i < colors.length; i++) {
            right[i] = map1.containsKey(colors[i]+1) ? map1.get(colors[i]+1) : -1;
        }
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < colors.length; i++){
            leftMax = Math.max(left[i],leftMax);
            rightMax = Math.max(right[i],rightMax);
            res = Math.max(res, Math.max(i - leftMax,rightMax - i));
        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }   

    
}