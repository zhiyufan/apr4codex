package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        
        if (rectangles == null || rectangles.length == 0 || rectangles[0].length == 0) return 0;
        
        HashMap<Double, Long> map = new HashMap<>();
        for (int[] r : rectangles){
            int w = r[0];
            int h = r[1];
            if (w > h){
                int temp = w;
                w = h;
                h = temp;
            }
            Double ratio = (double) w / h;
            if (!map.containsKey(ratio)){
                map.put(ratio, 0L);
            }else{
                map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
            }
        }
        
        long res = 0;
        for (Map.Entry<Double, Long> entry : map.entrySet()){
            res += entry.getValue() * (entry.getValue() - 1) / 2;
        }
        return res;
    }

    
}