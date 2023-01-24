package com.codex;

import java.util.*;

public class Solution {
    public static long interchangeableRectangles(int[][] rectangles) {
        
        HashMap<Double, Long> map = new HashMap<>();
        for (int i = 0; i < rectangles.length; i++){
            for (int j = 0; j < rectangles[0].length; j++){
                if (rectangles[i][0] < rectangles[i][1]){
                    int temp = rectangles[i][0];
                    rectangles[i][0] = rectangles[i][1];
                    rectangles[i][1] = temp;
                }
                Double ratio = (double)rectangles[i][0] / rectangles[i][1];
                if (map.containsKey(ratio)) {
                    map.put(ratio, map.get(ratio) + 1);
                } else {
                    map.put(ratio, 1);
                }
            }
        }
        long res = 0;
        for (long l : map.values()){
            res += l * (l - 1) / 2;
        }
        return res;
    }

    
}