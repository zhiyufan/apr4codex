package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
    
        int m = rectangles.length;
        int n = rectangles[0].length;
        
        HashMap<Double, Long> map = new HashMap<>();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (rectangles[i][0] < rectangles[i][1]){
                    int temp = rectangles[i][0];
                    rectangles[i][0] = rectangles[i][1];
                    rectangles[i][1] = temp;
                }
                Double ratio = (double)rectangles[i][0] / rectangles[i][1];
                map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
            }
        }
        
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }

    
}